package com.blackoutburst.fallingsquare.buttons;

import android.content.Context;
import android.view.MotionEvent;

import com.blackoutburst.fallingsquare.graphics.Colors;
import com.blackoutburst.fallingsquare.core.GameCore;
import com.blackoutburst.fallingsquare.graphics.Render;
import com.blackoutburst.fallingsquare.graphics.Texture;

import javax.microedition.khronos.opengles.GL10;

public class ExitButton extends Button {
    public ExitButton(Texture texture, Texture textureSwitch, float x, float y, float width, float height, Colors color, int rotation, boolean switchColor, int timer) {
        super(texture, textureSwitch, x, y, width, height, color, rotation, switchColor, timer);
    }

    public void update(MotionEvent event, Context context) {
        if(timer > 5) {
            if (isClicked(event)) {
                System.exit(0);
            }
        }
    }

    protected void render(GL10 gl) {
        timer++;
        if(color.alpha > 1)
            color.alpha = 1;
        if(color.alpha < 1)
            color.alpha += 0.1f;
        Render.quadS(gl, texture, -GameCore.camera.x + x, -GameCore.camera.y + y, width, height, color, rotation);
    }
}
