package turtleBouncer;

import java.awt.Color;
import java.awt.event.KeyEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class turtleBouncer extends GraphicsProgram 
{
	private static final int APP_WIDTH = 300;
	private static final int APP_HEIGHT = 300;
	private static final int TURTLE_X = 0;
	private static final int TURTLE_Y = 100;
	
	private int step = 10;
	
	GTurtle turtle;
	
	public void run()
	{
		addKeyListeners();
		setSize(APP_WIDTH, APP_HEIGHT);
		turtle = new GTurtle(TURTLE_X, TURTLE_Y);
		add(turtle);
	
	while (true)
	{
		if(turtle.getX() >= APP_WIDTH) //turtle hits right edge
		{
			turtle.setDirection(180);
			step = -10;
		}
		else if(turtle.getX() <= 0) //turtle hits left edge
		{
			turtle.setDirection(0);
			step = 10;
		}
		turtle.move(step, 0);
	}
	}
	
/*	public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_RIGHT:
			turtle.setDirection(0);
			turtle.move(STEP, 0);
			//turtle.forward(10);
			break;
		case KeyEvent.VK_LEFT:
			turtle.setDirection(180);
			turtle.move(-STEP, 0);
			//turtle.forward(10);
			break;
		case KeyEvent.VK_UP:
			turtle.setDirection(90);
			turtle.move(0, -STEP);
			//turtle.forward(10);
			break;
		case KeyEvent.VK_DOWN:
			turtle.setDirection(270);
			turtle.move(0, STEP);
			//turtle.forward(10);
			break;
		}
		
	}*/

}

