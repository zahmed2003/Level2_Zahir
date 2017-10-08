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
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);

	}
	
	public void keyHandler()
	{
		if(InputManager.right_key == true)
		{
			x +=50;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_RIGHT)
		{
			InputManager.right_key = true;
		}
		
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
