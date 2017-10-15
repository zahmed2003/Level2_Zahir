package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GridPlayer extends GameObject implements KeyListener{
	
	public GridPlayer(int x, int y, int width, int height)
	{
		super(x, y, width, height);
		
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	
	public void update()
	{
		keyHandler();
	}
	
	public void draw(Graphics g)
	{
		g.drawImage(GamePanel.GPImg, x, y, width, height, null);

	}
	
	
	public void keyHandler()
	{
		if(x < 0)
		{
			x=0;
		}
		if(x > 500 - width)
		{
			x=500 - width;
		}
		
		if(y < 0)
		{
			y=0;
		}
		if(y > 250 - width)
		{
			y=250 - width;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_RIGHT)
		{
			InputManager.right_key = false;
		}
		
		
	}

}
