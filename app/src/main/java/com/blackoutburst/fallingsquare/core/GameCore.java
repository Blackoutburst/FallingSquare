package com.blackoutburst.fallingsquare.core;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.blackoutburst.fallingsquare.buttons.Button;
import com.blackoutburst.fallingsquare.buttons.ButtonManager;
import com.blackoutburst.fallingsquare.graphics.Colors;
import com.blackoutburst.fallingsquare.graphics.Render;
import com.blackoutburst.fallingsquare.graphics.TextureLoader;
import com.blackoutburst.fallingsquare.map.Coin;
import com.blackoutburst.fallingsquare.map.Map;
import com.blackoutburst.fallingsquare.map.MapLoader;
import com.blackoutburst.fallingsquare.particles.ParticlesManager;
import com.blackoutburst.fallingsquare.particles.PlayerParticles;
import com.blackoutburst.fallingsquare.utils.Vector3f;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Random;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class GameCore extends GLSurfaceView {
    public static Vector3f screen = new Vector3f();
    public static FloatBuffer vertexBuffer;
    public static TextureLoader textureLoader;
    public static Vector3f camera = new Vector3f();
    public static Vector3f player = new Vector3f();
    public static Vector3f spawn = new Vector3f();
    private boolean running = false;
    public static boolean win = false;
    public static boolean dead = false;
    public static boolean inMenu = true;
    public static boolean inPause = false;
    public static boolean soundActivate = true;
    public static int level = 1;
    public static int maxLevel = 1;
    public static boolean main = true;
    public static int page = 1;
    private Random rand = new Random();
    public static float xTouch, yTouch, eventType = -1, initialX, initialY;

    public GameCore(Context context, AttributeSet attrs) {
        super(context, attrs);
        setEGLConfigChooser(8,8,8,8,0,0);
        setRenderer(new MyRenderer());

        float vertices[]  = {
                0, 0, 0.0f,
                1, 0, 0.0f,
                0, 1, 0.0f,
                1, 1, 0.0f,
        };

        ByteBuffer vbb = ByteBuffer.allocateDirect(vertices.length * 4);
        vbb.order(ByteOrder.nativeOrder());
        vertexBuffer = vbb.asFloatBuffer();
        vertexBuffer.put(vertices);
        vertexBuffer.position(0);

        textureLoader = new TextureLoader(context, attrs);
    }


    public static void readConfig(Context context){
        try {
            InputStream inputStream = context.openFileInput("config");

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString;
                StringBuilder stringBuilder = new StringBuilder();

                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    stringBuilder.append(receiveString);
                }

                inputStream.close();
                String values = stringBuilder.toString();
                String[] val = values.split(" ");

                maxLevel = Integer.valueOf(val[0]);
                soundActivate = Boolean.valueOf(val[1]);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeConfig(Context context){
        FileOutputStream outputStream;
        try {
            outputStream = context.openFileOutput("config", Context.MODE_PRIVATE);
            outputStream.write((maxLevel+" ").getBytes());
            outputStream.write((soundActivate+" ").getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean onTouchEvent(final MotionEvent event) {
        queueEvent(new Runnable(){
            public void run() {

                if(event.getAction() == 0){
                    initialX = event.getX();
                    initialY = event.getY();
                }

                xTouch = event.getX();
                yTouch = event.getY();

                if(eventType == 1 && event.getAction() == 1){
                    eventType = 0;
                }else{
                    eventType = event.getAction();
                }

                try {
                    for (Button b : ButtonManager.buttons) {
                        b.update(event, getContext());
                    }
                }catch(Exception e){}
            }});
        return true;
    }

    public static void load_map(Context context)
    {
        Coin.c1 = false;
        Coin.c2 = false;
        Coin.c3 = false;
        ParticlesManager.particles.clear();
        Map.tiles.clear();
        Map.tiles = MapLoader.loadTiles(context,level);
    }

    private final class MyRenderer implements GLSurfaceView.Renderer{

        public void onSurfaceCreated(GL10 gl, EGLConfig config) {
            screen.x = MainActivity.width;
            screen.y = MainActivity.height;
            gl.glEnable(GL10.GL_ALPHA_TEST);
            gl.glEnable(GL10.GL_BLEND);
            gl.glBlendFunc(GL10.GL_SRC_ALPHA, GL10.GL_ONE_MINUS_SRC_ALPHA);
            gl.glDisable(GL10.GL_DEPTH_TEST);
            gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
            gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
            gl.glViewport(0, 0, (int) screen.x, (int) screen.y);
            gl.glMatrixMode(GL10.GL_PROJECTION);
            gl.glLoadIdentity();
            gl.glOrthof(0, screen.x, screen.y, 0, -1, 1);
            gl.glMatrixMode(GL10.GL_MODELVIEW);
            gl.glLoadIdentity();
            gl.glEnableClientState(GL10.GL_TEXTURE_COORD_ARRAY);

            if (!running) {
                running = true;
                ButtonManager.mainMenu();
                readConfig(getContext());
                TextureLoader.load(textureLoader, getContext());
            }
        }

        public void onSurfaceChanged(GL10 gl, int width, int height) {
            screen.y = height;
            screen.x = width;
            gl.glClearColor(0.3f, 0.3f, 0.3f, 1);
            gl.glViewport(0, 0, (int) screen.x, (int) screen.y);
            gl.glOrthof(0, screen.x, screen.y, 0, -1, 1);
        }

        public void onDrawFrame(GL10 gl) {

            if (inMenu) {
                camera.x = 0;
                camera.y = 0 ;

                gl.glLoadIdentity();
                gl.glTranslatef(camera.x, camera.y,0);
                gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
            }


            if (!inMenu) {
                camera.x = (-player.x + (screen.x / 2) - 30);
                camera.y = (-player.y + (screen.y / 2) - 30);

                gl.glLoadIdentity();
                gl.glTranslatef(camera.x, camera.y,0);
                gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

                //Render map
                Map.render(gl, textureLoader);

                //Update Map
                Map.update(player, spawn, getContext());

                if (!win && !inPause && !dead) {
                    player.x += MainActivity.accelerometer.y;
                    player.y += MainActivity.accelerometer.x;
                }

                if (!inPause && !dead && !win) {
                    int size = rand.nextInt(10) + 5;
                    int x = rand.nextInt(60 - size);
                    int y = rand.nextInt(60 - size);
                    ParticlesManager.particles.add(new PlayerParticles(GameCore.textureLoader.particles, new Vector3f(player.x + x, player.y + y, 0), new Vector3f(size, size, size), new Colors(0.0f, 0.6f, 1.0f, 1.0f), false, 1));
                    ParticlesManager.update(gl);
                }

                //Coin
                Coin.render(gl, textureLoader, camera, screen, player, getContext());
                //Player
                Render.quadS(gl, textureLoader.player, player.x , player.y, 60, 60, Colors.WHITE, 0);

            }

            if(inMenu && !main) {
                switch (page) {
                    case 1: Render.quadS(gl, textureLoader.p1, -camera.x + (screen.x / 2) - (screen.y / 4) , -camera.y + screen.y - screen.y / 8, screen.y / 2, screen.y / 26, Colors.WHITE, 0);break;
                    case 2: Render.quadS(gl, textureLoader.p2, -camera.x + (screen.x / 2) - (screen.y / 4) , -camera.y + screen.y - screen.y / 8, screen.y / 2, screen.y / 26, Colors.WHITE, 0);break;
                    case 3: Render.quadS(gl, textureLoader.p3, -camera.x + (screen.x / 2) - (screen.y / 4) , -camera.y + screen.y - screen.y / 8, screen.y / 2, screen.y / 26, Colors.WHITE, 0);break;
                    case 4: Render.quadS(gl, textureLoader.p4, -camera.x + (screen.x / 2) - (screen.y / 4) , -camera.y + screen.y - screen.y / 8, screen.y / 2, screen.y / 26, Colors.WHITE, 0);break;
                    case 5: Render.quadS(gl, textureLoader.p5, -camera.x + (screen.x / 2) - (screen.y / 4) , -camera.y + screen.y - screen.y / 8, screen.y / 2, screen.y / 26, Colors.WHITE, 0);break;
                    case 6: Render.quadS(gl, textureLoader.p6, -camera.x + (screen.x / 2) - (screen.y / 4) , -camera.y + screen.y - screen.y / 8, screen.y / 2, screen.y / 26, Colors.WHITE, 0);break;
                    case 7: Render.quadS(gl, textureLoader.p7, -camera.x + (screen.x / 2) - (screen.y / 4) , -camera.y + screen.y - screen.y / 8, screen.y / 2, screen.y / 26, Colors.WHITE, 0);break;
                    case 8: Render.quadS(gl, textureLoader.p8, -camera.x + (screen.x / 2) - (screen.y / 4) , -camera.y + screen.y - screen.y / 8, screen.y / 2, screen.y / 26, Colors.WHITE, 0);break;
                    case 9: Render.quadS(gl, textureLoader.p9, -camera.x + (screen.x / 2) - (screen.y / 4) , -camera.y + screen.y - screen.y / 8, screen.y / 2, screen.y / 26, Colors.WHITE, 0);break;
                    case 10: Render.quadS(gl, textureLoader.p10, -camera.x + (screen.x / 2) - (screen.y / 4) , -camera.y + screen.y - screen.y / 8, screen.y / 2, screen.y / 26, Colors.WHITE, 0);break;
                }
            }

            if (inPause || dead || win) {
                Render.quadS(gl, textureLoader.particles, -camera.x , -camera.y, screen.x, screen.y, new Colors(0,0,0, 0.3f), 0);
            }
            //Buttons
            ButtonManager.update(gl);
        }
    }
}
