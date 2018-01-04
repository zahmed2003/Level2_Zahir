package Game;

import java.awt.Graphics;

public class DRECL extends GameObject{
	public static final int ROn = 1;
	public static final int ROff = -1;

	
	public DRECL(int x, int y, int width, int height, int RState)
	{
		super(x, y, width, height);
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.RState = RState;
		
		direction = 0;
	}
	
	public void update()
	{
		colBox.setBounds(x, y, width, height);
	}
	
	public void draw(Graphics g)
	{
		if(RState == 1)
		{
		g.drawImage(GamePanel.DRECLOnImg, x, y, width, height, null);
		}
		if(RState == -1)
		{
			g.drawImage(GamePanel.DRECLOffImg, x, y, width, height, null);
		}
	}
	
}
