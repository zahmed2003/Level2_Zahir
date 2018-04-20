package Game;

import java.awt.Graphics;

public class RECL extends GameObject{
	public static final int ROn = 1;
	public static final int ROff = -1;

	
	public RECL(int x, int y, int width, int height, int RState)
	{
		super(x, y, width, height);
		
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setHeight(height);
		this.RState = RState;
		
		direction = 0;
	}
	
	public void update()
	{
		colBox.setBounds(getX(), getY(), getWidth(), getHeight());
	}
	
	public void draw(Graphics g)
	{
		if(RState == 1)
		{
		g.drawImage(GamePanel.RECLOnImg, getX(), getY(), getWidth(), getHeight(), null);
		}
		if(RState == -1)
		{
			g.drawImage(GamePanel.RECLOffImg, getX(), getY(), getWidth(), getHeight(), null);
		}
	}
	
}