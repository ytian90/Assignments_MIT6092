package assignment6;

import java.awt.Graphics;

/**
 * MIT6_092 Assignment 6
 * Opposite mover compared to bouncer
 * @author yutian
 * @since Jul 8, 2015
 */
public class StraightMover implements Mover {
    private int x;
    private int y;
    private int xDirection; // x increase per step
    private int yDirection; // y increase per step
    private Sprite sprite;

    /** Create a Bouncer that positions sprite at (startX, startY). */
    public StraightMover(int startX, int startY, Sprite sprite) {
        x = startX;
        y = startY;
        this.sprite = sprite; 
    }

    /** Starts moving the object in the direction (xIncrement, yIncrement). */
    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }

    public void draw(Graphics graphics) {
        sprite.draw(graphics, x, y);

        // Move the center of the object each time we draw it
        x += xDirection;
        y += yDirection;
    }
}
