package assignment6;

import java.awt.Graphics;

/**
 * MIT6_092 Assignment 6
 * @author yutian
 * @since Jul 8, 2015
 */
public interface Sprite {
    /**
     * Draws this sprite on surface, with the coordinate (leftX, topY) as the
     * top left corner.
     */
    void draw(Graphics surface, int leftX, int topY);

    /** Returns the width of the sprite. */
    int getWidth();

    /** Returns the height of the sprite. */
    int getHeight();
}
