package com.blackoutburst.fallingsquare.map;

import com.blackoutburst.fallingsquare.graphics.Colors;
import com.blackoutburst.fallingsquare.utils.Vector3f;

public abstract class Tiles {
    protected String texture;
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean solid;
    protected Colors color;
    protected int rotation;

    public Tiles(String texture, int x, int y, int width, int height, boolean solid, Colors color, int rotation) {
        this.texture = texture;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.solid = solid;
        this.color = color;
        this.rotation = rotation;
    }

    /**
     * On récupère les vertices des bloc
     *
     * @return 4 vecteur 2
     */
    public Vector3f[] getVertices() {
        return new Vector3f[]{
                new Vector3f(x, y, 0),
                new Vector3f(x, y + height, 0),
                new Vector3f(x + width, y + height, 0),
                new Vector3f(x + width, y, 0)
        };
    }


    /**
     * On prend la texture du tile
     *
     * @return la texture du tile
     * @author Blackoutburst
     * @since 1.1
     */
    public String getTexture() {
        return texture;
    }

    /**
     * On prend la position horizontale du tile
     *
     * @return la position horizontale du tile
     * @author Blackoutburst
     * @since 1.1
     */
    public int getX() {
        return x;
    }

    /**
     * On prend la position verticale du tile
     *
     * @return la position verticale du tile
     * @author Blackoutburst
     * @since 1.1
     */
    public int getY() {
        return y;
    }

    /**
     * On vérifie si le tile est solide
     *
     * @return la solidité du tile
     * @author Blackoutburst
     * @since 1.1
     */
    public boolean isSolid() {
        return solid;
    }


    /**
     * On prend la largeur du tile
     *
     * @return la largeur du tile
     * @author Blackoutburst
     * @since 1.2
     */
    public int getWidth() {
        return width;
    }

    /**
     * On prend la hauteur du tile
     *
     * @return la hauteur du tile
     * @author Blackoutburst
     * @since 1.2
     */
    public int getHeight() {
        return height;
    }

    /**
     * On prend la couleur du tile
     *
     * @return la couleur du tile
     * @author Blackoutburst
     * @since 1.1
     */
    public Colors getColor() {
        return color;
    }

    /**
     * On prend la rotation du tile
     *
     * @return la rotation du tile
     * @author Blackoutburst
     * @see 1.2
     */
    public int getRotation() {
        return rotation;
    }


    /**
     * On définit la texture du tile
     *
     * @author Blackoutburst
     * @see 1.2
     */
    public void setTexture(String texture) {
        this.texture = texture;
    }

    /**
     * On définit la position verticale du tile
     *
     * @author Blackoutburst
     * @see 1.2
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * On définit la position du horizontale
     *
     * @author Blackoutburst
     * @see 1.2
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * On définit la largeur du tile
     *
     * @author Blackoutburst
     * @see 1.2
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * On définit la hauteur du tile
     *
     * @author Blackoutburst
     * @see 1.2
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * On définit la solidité du tile
     *
     * @author Blackoutburst
     * @see 1.2
     */
    public void setSolid(boolean solid) {
        this.solid = solid;
    }

    /**
     * On définit la couleur du tile
     *
     * @author Blackoutburst
     * @see 1.2
     */
    public void setColor(Colors color) {
        this.color = color;
    }

    /**
     * On définit la rotation du tile
     *
     * @author Blackoutburst
     * @see 1.2
     */
    public void setRotation(int rotation) {
        this.rotation = rotation;
    }
}