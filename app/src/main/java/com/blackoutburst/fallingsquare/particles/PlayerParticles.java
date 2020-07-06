package com.blackoutburst.fallingsquare.particles;

import com.blackoutburst.fallingsquare.graphics.Colors;
import com.blackoutburst.fallingsquare.graphics.Render;
import com.blackoutburst.fallingsquare.graphics.Texture;
import com.blackoutburst.fallingsquare.utils.Vector3f;

import javax.microedition.khronos.opengles.GL10;

public class PlayerParticles extends Particles{

    public PlayerParticles(Texture texture, Vector3f position, Vector3f size, Colors color, boolean removed, float alpha) {
        super(texture, position, size, color, removed, alpha);
    }

    protected void update() {
        color = new Colors(color.red, color.green, color.blue, alpha);
        alpha -= 0.01f;
        color.green += 0.01f;

        if(alpha <= 0) {
            removed = true;
        }
    }

    protected void render(GL10 gl) {
            Render.quadS(gl,texture, position.x-size.x/4, position.y-size.y/4, size.x/2, size.y/2, color, 0);
        }
    }
