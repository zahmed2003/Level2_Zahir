package Game;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends GameObject{
	

	public Player(int x, int y, int width, int height)
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
		if(isColliding && collisionObject instanceof RedTile)
		{
			isAlive = false;
		}
		colBox.setBounds(x, y, width, height);
	}
	
	public void draw(Graphics g)
	{
		g.drawImage(GamePanel.PlayerImg, x, y, width, height, null);

	}
	
	
}
