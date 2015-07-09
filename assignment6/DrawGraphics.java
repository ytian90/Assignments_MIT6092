package assignment6;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 * MIT6_092 Assignment 6 
 * An implement of DrawGraphics
 * @author yutian
 * @since Jul 8, 2015
 */
public class DrawGraphics {
//    Bouncer movingSprite;
//    ArrayList<Bouncer> list = new ArrayList<>();
//    ArrayList<StraightMover> mlist = new ArrayList<>();
    
    // Change to single ArrayList Mover
	ArrayList<Mover> list = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        Bouncer mbox = new Bouncer(100, 170, box);
        list.add(mbox);
        
        Oval oval = new Oval(20, 15, Color.BLUE);
        Bouncer moval = new Bouncer(170, 100, oval);
        list.add(moval);
        
        Rectangle box2 = new Rectangle(15, 20, Color.RED);
        StraightMover mbox2 = new StraightMover(50, 170, box2);
        list.add(mbox2);
        
        Oval oval2 = new Oval(20, 15, Color.BLUE);
        StraightMover moval2 = new StraightMover(170, 50, oval2);
        list.add(moval2);
        
        for (Mover b : list)
        {
        	b.setMovementVector(3, 1);
        }
        
//        for (StraightMover s : mlist)
//        {
//        	s.setMovementVector(2, -1);
//        }
        
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
    	
    	for (Mover b : list)
    	{
    		b.draw(surface);
    	}
    	
//    	for (StraightMover s : mlist)
//    	{
//    		s.draw(surface);
//    	}
    	
//      movingSprite.draw(surface);
    }
}
