package Game;

import java.awt.Graphics;
import java.awt.Rectangle;

public class RMTile2 extends GameObject{
	public static final int right = 1;
	public static final int left = -1;
	
	public RMTile2(int x, int y, int width, int height, int direction)
	{
		super(x, y, width, height);
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.direction = direction;
		
		colBox = new Rectangle(x - (width/2), y - (height/2), width, height);
	}
	
	public void update()
	{
		colBox.setBounds(x, y, width, height);
	}
	
	public void draw(Graphics g)
	{
		if(direction == 1)
		{
		g.drawImage(GamePanel.RMRImg, x, y, width, height, null);
		}
		if(direction == -1)
		{
			g.drawImage(GamePanel.RMLImg, x, y, width, height, null);
		}
	}
	
}
