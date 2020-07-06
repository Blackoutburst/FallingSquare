package com.blackoutburst.fallingsquare.map;

import android.content.Context;
import android.media.MediaPlayer;

import com.blackoutburst.fallingsquare.graphics.Colors;
import com.blackoutburst.fallingsquare.core.GameCore;
import com.blackoutburst.fallingsquare.R;
import com.blackoutburst.fallingsquare.graphics.Render;
import com.blackoutburst.fallingsquare.graphics.TextureLoader;
import com.blackoutburst.fallingsquare.utils.Vector3f;
import com.blackoutburst.fallingsquare.buttons.ButtonManager;

import java.util.ArrayList;
import java.util.List;

import javax.microedition.khronos.opengles.GL10;

public class Map {

    private static MediaPlayer level_complete;
    private static MediaPlayer death;
    public static List<Tiles> tiles = new ArrayList<Tiles>();

    public static void render(GL10 gl, TextureLoader textureLoader) {
        for (Tiles t : tiles) {
            switch (t.getTexture()) {
                case "d0" : Render.quadS(gl, textureLoader.d0, t.getX() , t.getY(), t.getWidth(), t.getHeight(), Colors.WHITE, t.getRotation());break;
                case "d1" : Render.quadS(gl, textureLoader.d1, t.getX() , t.getY(), t.getWidth(), t.getHeight(), Colors.WHITE, t.getRotation());break;
                case "d2" : Render.quadS(gl, textureLoader.d2, t.getX() , t.getY(), t.getWidth(), t.getHeight(), Colors.WHITE, t.getRotation());break;
                case "d3" : Render.quadS(gl, textureLoader.d3, t.getX() , t.getY(), t.getWidth(), t.getHeight(), Colors.WHITE, t.getRotation());break;
                case "d4" : Render.quadS(gl, textureLoader.d4, t.getX() , t.getY(), t.getWidth(), t.getHeight(), Colors.WHITE, t.getRotation());break;
                case "d5" : Render.quadS(gl, textureLoader.d5, t.getX() , t.getY(), t.getWidth(), t.getHeight(), Colors.WHITE, t.getRotation());break;
                case "d6" : Render.quadS(gl, textureLoader.d6, t.getX() , t.getY(), t.getWidth(), t.getHeight(), Colors.WHITE, t.getRotation());break;
                case "d7" : Render.quadS(gl, textureLoader.d7, t.getX() , t.getY(), t.getWidth(), t.getHeight(), Colors.WHITE, t.getRotation());break;
                case "d8" : Render.quadS(gl, textureLoader.d8, t.getX() , t.getY(), t.getWidth(), t.getHeight(), Colors.WHITE, t.getRotation());break;
                case "d9" : Render.quadS(gl, textureLoader.d9, t.getX() , t.getY(), t.getWidth(), t.getHeight(), Colors.WHITE, t.getRotation());break;
                case "da" : Render.quadS(gl, textureLoader.da, t.getX() , t.getY(), t.getWidth(), t.getHeight(), Colors.WHITE, t.getRotation());break;
                case "begin" : Render.quadS(gl, textureLoader.begin, t.getX() , t.getY(), t.getWidth(), t.getHeight(), Colors.WHITE, t.getRotation());break;
            }
            if (t.texture.equals("end") && Coin.c1 && Coin.c2 && Coin.c3)
                Render.quadS(gl, textureLoader.end, t.getX() , t.getY(), t.getWidth(), t.getHeight(), Colors.WHITE, t.getRotation());
            else if (t.texture.equals("end")) {
                Render.quadS(gl, textureLoader.end, t.getX() , t.getY(), t.getWidth(), t.getHeight(), Colors.GRAY, t.getRotation());
            }
        }
    }

    public static void update(Vector3f player, Vector3f spawn, Context context) {
        for (Tiles t : tiles) {
            if (t.isSolid() && player.x + 60 > t.getX() && player.x < t.getX() + t.getWidth() && player.y + 60 > t.getY() && player.y < t.getY() + t.getHeight() && !GameCore.dead) {
                ButtonManager.death();
                GameCore.dead = true;

                if (GameCore.soundActivate) {
                    death = MediaPlayer.create(context, R.raw.death);
                    death.start();
                }
            }

            if (!GameCore.win && Coin.c1 && Coin.c2 && Coin.c3 && t.texture.contains("end") && player.x + 60 > t.getX() && player.x < t.getX() + t.getWidth() && player.y + 60 > t.getY() && player.y < t.getY() + t.getHeight()) {
                GameCore.win = true;
                if ((GameCore.level + 1) >= GameCore.maxLevel)
                    GameCore.maxLevel = GameCore.level + 1;
                GameCore.writeConfig(context);
                ButtonManager.win();
                if (GameCore.soundActivate) {
                    level_complete = MediaPlayer.create(context, R.raw.level_complete);
                    level_complete.start();
                }
            }
        }
    }
}
