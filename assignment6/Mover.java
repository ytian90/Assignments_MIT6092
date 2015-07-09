package assignment6;

import java.awt.Graphics;

/**
 * MIT6_092 Assignment 6
 * Interface Mover
 * @author yutian
 * @since Jul 8, 2015
 */
public interface Mover {
	
	public void setMovementVector(int xIncrement, int yIncrement);
	
	public void draw(Graphics graphics);

}
