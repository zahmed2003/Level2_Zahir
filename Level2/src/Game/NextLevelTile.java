package Game;

import java.awt.Graphics;

public class NextLevelTile extends GameObject{
	public NextLevelTile(int x, int y, int width, int height)
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
		g.drawImage(GamePanel.wtImg, x, y, width, height, null);
	}
}
