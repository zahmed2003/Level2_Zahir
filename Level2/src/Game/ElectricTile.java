package Game;

import java.awt.Graphics;

public class ElectricTile extends GameObject{
	public static final int on = 1;
	public static final int off = -1;
	
	public ElectricTile(int x, int y, int width, int height, int state)
	{
		super(x, y, width, height);
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.state = state;
	}
	
	public void update()
	{
		colBox.setBounds(x, y, width, height);
	}
	
	public void draw(Graphics g)
	{
		if(state == 1)
		{
		g.drawImage(Level1State.ONETImg, x, y, width, height, null);
		}
		if(state == -1)
		{
			g.drawImage(Level1State.OFFETImg, x, y, width, height, null);
		}
	}
	
}
