package Game;

import java.awt.Graphics;
import java.awt.Rectangle;

public class LeftConveyerBelt extends GameObject{
	

	public LeftConveyerBelt(int x, int y, int width, int height)
	{
		super(x, y, width, height);
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		colBox = new Rectangle(x - (width/2), y - (height/2), width, height);
	}
	
	public void update()
	{
		
		colBox.setBounds(x, y, width, height);
	}
	
	public void draw(Graphics g)
	{
		g.drawImage(GamePanel.CLImg, x, y, width, height, null);

	}
	
}
