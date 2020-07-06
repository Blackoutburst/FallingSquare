package com.blackoutburst.fallingsquare.particles;

import java.util.ArrayList;
import java.util.List;

import javax.microedition.khronos.opengles.GL10;

public class ParticlesManager {
    public static List<Particles> particles = new ArrayList<Particles>();

    public static void update(GL10 gl) {
        for(Particles p : particles) {
            if(!p.removed) {
                p.update();
                p.render(gl);
            }
        }
        try {
            for(Particles p : particles)
                if(p.removed)
                    particles.remove(p);
        }catch(Exception e) {}
    }
}
