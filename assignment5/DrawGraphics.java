package assignment5;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 * MIT6_092 Assignment 5
 * @author yutian
 * @since Jul 8, 2015
 */
public class DrawGraphics {
    BouncingBox box;
    ArrayList<BouncingBox> boxList;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
    	
    	boxList = new ArrayList<>();
    	box = new BouncingBox(200, 50, Color.RED);
    	BouncingBox box1 = new BouncingBox(50, 200, Color.GREEN);
    	BouncingBox box2 = new BouncingBox(100, 100, Color.BLUE);
    	
    	boxList.add(box);
    	boxList.add(box1);
    	boxList.add(box2);

    	for (BouncingBox b : boxList)
    	{
    		b.setMovementVector(1, -2);
    	}
    	
//        box.setMovementVector(1, -2);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawRect(80, 50, 100, 100);
        surface.drawOval(50, 100, 80, 80);
        // box.draw(surface);
        for(BouncingBox b : boxList)
        {
        	b.draw(surface);
        }
    }
} 