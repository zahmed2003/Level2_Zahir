package Game;

import java.awt.Graphics;

public class ECR extends GameObject{
	public static final int on = 1;
	public static final int off = -1;
	public static int superstate;
	public static final int o = 1;
	public static final int no = -1;
	
	public ECR(int x, int y, int width, int height, int state)
	{
		super(x, y, width, height);
		
		ElectricTile.superstate = 1;
		
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
		g.drawImage(GamePanel.ECROnImg, x, y, width, height, null);
		}
		if(state == -1)
		{
			g.drawImage(GamePanel.ECROffImg, x, y, width, height, null);
		}
	}
	
}
