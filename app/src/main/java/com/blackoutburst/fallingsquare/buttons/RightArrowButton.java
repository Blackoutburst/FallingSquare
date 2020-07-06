package com.blackoutburst.fallingsquare.buttons;

import android.content.Context;
import android.view.MotionEvent;

import com.blackoutburst.fallingsquare.graphics.Colors;
import com.blackoutburst.fallingsquare.core.GameCore;
import com.blackoutburst.fallingsquare.graphics.Render;
import com.blackoutburst.fallingsquare.graphics.Texture;

import javax.microedition.khronos.opengles.GL10;

public class RightArrowButton extends Button {
    public RightArrowButton(Texture texture, Texture textureSwitch, float x, float y, float width, float height, Colors color, int rotation, boolean switchColor, int timer) {
        super(texture, textureSwitch, x, y, width, height, color, rotation, switchColor, timer);
    }

    public void update(MotionEvent event, Context context) {
        if(timer > 5) {
            if (isClicked(event)) {
                GameCore.page++;
                switch(GameCore.page) {
                    case 1: ButtonManager.page1();break;
                    case 2: ButtonManager.page2();break;
                    case 3: ButtonManager.page3();break;
                    case 4: ButtonManager.page4();break;
                    case 5: ButtonManager.page5();break;
                    case 6: ButtonManager.page6();break;
                    case 7: ButtonManager.page7();break;
                    case 8: ButtonManager.page8();break;
                    case 9: ButtonManager.page9();break;
                    case 10: ButtonManager.page10();break;
                }
            }
        }
    }

    protected void render(GL10 gl) {
        timer++;
        color.alpha = 1;
        Render.quadS(gl, texture, -GameCore.camera.x + x, -GameCore.camera.y + y, width, height, color, rotation);
    }
}
