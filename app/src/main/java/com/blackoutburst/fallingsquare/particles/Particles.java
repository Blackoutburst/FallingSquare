package com.blackoutburst.fallingsquare.particles;

import com.blackoutburst.fallingsquare.graphics.Colors;
import com.blackoutburst.fallingsquare.graphics.Texture;
import com.blackoutburst.fallingsquare.utils.Vector3f;

import javax.microedition.khronos.opengles.GL10;

public abstract class Particles {

    protected Texture texture;
    protected Vector3f position;
    protected Vector3f size;
    protected Colors color;
    protected boolean removed;
    protected float alpha;

    public Particles(Texture texture, Vector3f position, Vector3f size, Colors color, boolean removed, float alpha) {
        this.texture = texture;
        this.position = position;
        this.size = size;
        this.color = color;
        this.removed = removed;
        this.alpha = alpha;
    }

    protected abstract void update();
    protected abstract void render(GL10 gl);
}