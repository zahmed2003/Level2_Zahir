package Game;

import java.awt.Graphics;

public class RedTile extends GameObject{

	public RedTile(int x, int y, int width, int height)
	{
		super(x, y, width, height);
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void update()
	{
		colBox.setBounds(x, y, width, height);
	}
	
	public void draw(Graphics g)
	{
		g.drawImage(Level1State.RTImg, x, y, width, height, null);
	}
	
}
