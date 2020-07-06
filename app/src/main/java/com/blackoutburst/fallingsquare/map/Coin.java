package com.blackoutburst.fallingsquare.map;

import android.content.Context;
import android.media.MediaPlayer;

import com.blackoutburst.fallingsquare.core.GameCore;
import com.blackoutburst.fallingsquare.R;
import com.blackoutburst.fallingsquare.graphics.Render;
import com.blackoutburst.fallingsquare.utils.Vector3f;
import com.blackoutburst.fallingsquare.graphics.Colors;
import com.blackoutburst.fallingsquare.graphics.TextureLoader;

import javax.microedition.khronos.opengles.GL10;

public class Coin {

    public static boolean c1 = false;
    public static boolean c2 = false;
    public static boolean c3 = false;
    public static Vector3f coin1 = new Vector3f();
    public static Vector3f coin2 = new Vector3f();
    public static Vector3f coin3 = new Vector3f();
    private static MediaPlayer coin;
    public static float alpha1;
    public static float alpha2;
    public static float alpha3;

    public static void render(GL10 gl, TextureLoader textureLoader, Vector3f camera, Vector3f screen, Vector3f player, Context context) {
        //Coin Interaction
        if (!c1 && player.x + 60 > coin1.x && player.x < coin1.x + 60 && player.y + 60 > coin1.y && player.y < coin1.y + 60) {
            c1 = true;
            if (GameCore.soundActivate) {
                coin = MediaPlayer.create(context, R.raw.coin);
                coin.start();
            }
        }
        if (!c2 && player.x + 60 > coin2.x && player.x < coin2.x + 60 && player.y + 60 > coin2.y && player.y < coin2.y + 60) {
            c2 = true;
            if (GameCore.soundActivate) {
                coin = MediaPlayer.create(context, R.raw.coin);
                coin.start();
            }
        }
        if (!c3 && player.x + 60 > coin3.x && player.x < coin3.x + 60 && player.y + 60 > coin3.y && player.y < coin3.y + 60) {
            c3 = true;
            if (GameCore.soundActivate) {
                coin = MediaPlayer.create(context, R.raw.coin);
                coin.start();
            }
        }

        if (c1)
            alpha1 -= 0.05f;
        if (c2)
            alpha2 -= 0.05f;
        if (c3)
            alpha3 -= 0.05f;

        //Map Coin
            Render.quadS(gl, textureLoader.coin, coin1.x , coin1.y, 60, 60, new Colors(1,1,1,alpha1), 0);
            Render.quadS(gl, textureLoader.coin, coin2.x , coin2.y, 60, 60, new Colors(1,1,1,alpha2), 0);
            Render.quadS(gl, textureLoader.coin, coin3.x , coin3.y, 60, 60, new Colors(1,1,1,alpha3), 0);

        //Coin HUD
        if (c1)
            Render.quadS(gl, textureLoader.coin, -camera.x + 10 , -camera.y + 10, screen.y/7.2f, screen.y/7.2f, Colors.WHITE, 0);
        else
            Render.quadS(gl, textureLoader.coin0, -camera.x + 10 , -camera.y + 10, screen.y/7.2f, screen.y/7.2f, Colors.WHITE, 0);
        if (c2)
            Render.quadS(gl, textureLoader.coin, -camera.x + (screen.y/7.2f) + 10 , -camera.y + 10, screen.y/7.2f, screen.y/7.2f, Colors.WHITE, 0);
        else
            Render.quadS(gl, textureLoader.coin0, -camera.x + (screen.y/7.2f) + 10 , -camera.y + 10, screen.y/7.2f, screen.y/7.2f, Colors.WHITE, 0);
        if (c3)
            Render.quadS(gl, textureLoader.coin, -camera.x + (screen.y/7.2f) * 2 + 20, -camera.y + 10, screen.y/7.2f, screen.y/7.2f, Colors.WHITE, 0);
        else
            Render.quadS(gl, textureLoader.coin0, -camera.x + (screen.y/7.2f) * 2 + 20 , -camera.y + 10, screen.y/7.2f, screen.y/7.2f, Colors.WHITE, 0);
    }
}
