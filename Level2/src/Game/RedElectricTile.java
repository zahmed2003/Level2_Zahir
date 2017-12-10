package Game;

import java.awt.Graphics;

public class RedElectricTile extends GameObject{
	public static final int ROn = 1;
	public static final int ROff = -1;

	
	public RedElectricTile(int x, int y, int width, int height, int RState)
	{
		super(x, y, width, height);
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.RState = RState;
	}
	
	public void update()
	{
		colBox.setBounds(x, y, width, height);
	}
	
	public void draw(Graphics g)
	{
		if(RState == 1)
		{
		g.drawImage(GamePanel.ONETImg, x, y, width, height, null);
		}
		if(RState == -1)
		{
			g.drawImage(GamePanel.OFFETImg, x, y, width, height, null);
		}
	}
	
}