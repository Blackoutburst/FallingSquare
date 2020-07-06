package com.blackoutburst.fallingsquare.graphics;

import com.blackoutburst.fallingsquare.core.GameCore;

import javax.microedition.khronos.opengles.GL10;

public class Render {

    public static void quadS(GL10 gl, Texture texture, float x, float y, float width, float height, Colors color, int rotation){
        if(x + width > -GameCore.camera.x && x < -GameCore.camera.x +GameCore.screen.x && y + height > -GameCore.camera.y && y < -GameCore.camera.y + GameCore.screen.y) {
            gl.glPushMatrix();
            gl.glTranslatef(x + width / 2, y + height / 2, 0);
            gl.glRotatef(-rotation, 0, 0, 1);
            gl.glTranslatef(-x - width / 2, -y - height / 2, 0);
            gl.glColor4f(color.red, color.green, color.blue, color.alpha);
            texture.prepare(gl, GL10.GL_CLAMP_TO_EDGE);
            gl.glVertexPointer(3, GL10.GL_FLOAT, 0, GameCore.vertexBuffer);
            texture.draw(gl, x, y, width, height, 0);
            gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
            gl.glPopMatrix();
        }
    }

    public static void quadS(GL10 gl, Texture texture, float x, float y, float width, float height, Colors color, float rotation){
        if(x + width > -GameCore.camera.x && x < -GameCore.camera.x +GameCore.screen.x && y + height > -GameCore.camera.y && y < -GameCore.camera.y + GameCore.screen.y) {
            gl.glPushMatrix();
            gl.glTranslatef(x + width / 2, y + height / 2, 0);
            gl.glRotatef(-rotation, 0, 0, 1);
            gl.glTranslatef(-x - width / 2, -y - height / 2, 0);
            gl.glColor4f(color.red, color.green, color.blue, color.alpha);
            texture.prepare(gl, GL10.GL_CLAMP_TO_EDGE);
            gl.glVertexPointer(3, GL10.GL_FLOAT, 0, GameCore.vertexBuffer);
            texture.draw(gl, x, y, width, height, 0);
            gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
            gl.glPopMatrix();
        }
    }

}
