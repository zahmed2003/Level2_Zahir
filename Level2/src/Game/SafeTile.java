package Game;

import java.awt.Color;
import java.awt.Graphics;

import javax.imageio.ImageIO;

public class SafeTile extends GameObject{

	public SafeTile(int x, int y, int width, int height)
	{
		super(x, y, width, height);
		
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
		g.drawImage(Level1State.NTImg, x, y, width, height, null);
	}
	
}
