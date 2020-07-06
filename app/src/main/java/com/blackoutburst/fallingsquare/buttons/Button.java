package com.blackoutburst.fallingsquare.buttons;

import android.content.Context;
import android.view.MotionEvent;

import com.blackoutburst.fallingsquare.graphics.Colors;
import com.blackoutburst.fallingsquare.core.GameCore;
import com.blackoutburst.fallingsquare.graphics.Texture;

import javax.microedition.khronos.opengles.GL10;

public abstract class Button {

    protected Texture texture;
    protected Texture textureSwitch;
    protected float x;
    protected float y;
    protected float width;
    protected float height;
    protected Colors color;
    protected int rotation;
    protected boolean clicked;
    protected boolean hold;
    protected boolean slide;
    protected boolean switchColor;
    protected boolean locked;
    protected int timer;
    protected int level;
    protected int levelmax;
    protected boolean max;
    protected int price;
    protected int price2;
    protected Texture icon;
    protected String tag;
    protected float ypos;

    public Button(Texture texture, Texture textureSwitch, float x, float y, float width, float height, Colors color, int rotation, boolean switchColor, int timer) {
        this.texture = texture;
        this.textureSwitch = textureSwitch;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.rotation = rotation;
        this.switchColor = switchColor;
        this.timer = timer;
    }

    public Button(Texture texture, Texture textureSwitch, float x, float y, float width, float height, Colors color, int rotation, boolean switchColor, int timer, boolean locked, int level) {
        this.texture = texture;
        this.textureSwitch = textureSwitch;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.rotation = rotation;
        this.switchColor = switchColor;
        this.timer = timer;
        this.locked = locked;
        this.level = level;
    }


    public Button(Texture texture, Texture textureSwitch, float x, float y, float width, float height, Colors color, int rotation, boolean switchColor, int timer, int level, int levelmax, boolean max, int price, int price2, Texture icon, String tag, float ypos) {
        this.texture = texture;
        this.textureSwitch = textureSwitch;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.rotation = rotation;
        this.switchColor = switchColor;
        this.timer = timer;
        this.level = level;
        this.levelmax = levelmax;
        this.max = max;
        this.price = price;
        this.price2 = price2;
        this.icon = icon;
        this.tag = tag;
        this.ypos = ypos;
    }

    public abstract void update(MotionEvent event, Context context);
    protected abstract void render(GL10 gl);


    public boolean isClicked(MotionEvent event) {
        if(event.getX() >= x && event.getX() <= x + width && event.getY() >= y && event.getY() <= y + height && GameCore.eventType == 1){
            return !clicked;
        }
        return clicked;
    }

    public boolean isHold(MotionEvent event) {
        if(event.getX() >= x && event.getX() <= x + width && event.getY() >= y && event.getY() <= y + height && GameCore.eventType == 0||
                event.getX() >= x && event.getX() <= x + width && event.getY() >= y && event.getY() <= y + height && GameCore.eventType == 2){
            return !hold;
        }
        return hold;
    }


    public boolean isHoldShop(MotionEvent event) {
        if(event.getX() >= x && event.getX() <= x + width && event.getY() >= y && event.getY() <= y + height && GameCore.eventType == 0){
            return !hold;
        }
        return hold;
    }

    public boolean isSlide(MotionEvent event) {
        if(event.getX() >= x && event.getX() <= x + width && event.getY() >= y && event.getY() <= y + height && GameCore.eventType == 2){
            return !slide;
        }
        return slide;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
}
