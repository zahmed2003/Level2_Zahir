package Game;

import java.awt.Graphics;

public class SolidTile extends GameObject{

	public SolidTile(int x, int y, int width, int height)
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
		g.drawImage(GamePanel.BTImg, x, y, width, height, null);
	}
	
}

