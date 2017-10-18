package Game;

import java.awt.Graphics;

public class DeathEffect extends GameObject{
	public DeathEffect(int x, int y, int width, int height)
	{
		super(x, y, width, height);
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void update()
	{
		y += 10;
	}
	
	public void draw(Graphics g)
	{
		g.drawImage(GamePanel.deathImg, x, y, width, height, null);
	}
}
