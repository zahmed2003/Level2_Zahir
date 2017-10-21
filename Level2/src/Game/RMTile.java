package Game;

import java.awt.Graphics;

public class RMTile extends GameObject{
	public static final int up = 1;
	public static final int down = -1;
	
	public RMTile(int x, int y, int width, int height, int direction)
	{
		super(x, y, width, height);
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.direction = direction;
	}
	
	public void update()
	{
		colBox.setBounds(x, y, width, height);
	}
	
	public void draw(Graphics g)
	{
		if(direction == 1)
		{
		g.drawImage(GamePanel.RMUpImg, x, y, width, height, null);
		}
		if(direction == -1)
		{
			g.drawImage(GamePanel.RMDownImg, x, y, width, height, null);
		}
	}
	
}

