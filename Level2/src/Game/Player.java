package Game;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{

	public Player(int x, int y, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void update()
	{
		
	}
	
	public void draw(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);

	}
	
}
