package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;



public class Level1State extends JPanel implements ActionListener, KeyListener{
Timer timer;
static Player player = new Player(200, 100,100,100);
GridPlayer gp = new GridPlayer(200, 100,100,100);



public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;

SolidTile st1 = new SolidTile(300, 100, 100, 100);
SolidTile st2 = new SolidTile(400, 100, 100, 100);
SolidTile st3 = new SolidTile(200, 200, 100, 100);
SolidTile st4 = new SolidTile(300, 200, 100, 100);
SolidTile st5 = new SolidTile(400, 200, 100, 100);
SolidTile st6 = new SolidTile(100, 300, 100, 100);
SolidTile st7 = new SolidTile(100, 300, 100, 100);


public Level1State()
{
	timer = new Timer(1000/60, this);
	
	this.timer = timer;
	
	try 
	{
	
		PlayerImg = ImageIO.read(this.getClass().getResourceAsStream("Player.png"));
		NTImg = ImageIO.read(this.getClass().getResourceAsStream("NT.png"));
		RTImg = ImageIO.read(this.getClass().getResourceAsStream("RT.png"));
		GPImg = ImageIO.read(this.getClass().getResourceAsStream("GP.png"));
		deathImg = ImageIO.read(this.getClass().getResourceAsStream("death.png"));
		wtImg = ImageIO.read(this.getClass().getResourceAsStream("wt.png"));
		ONETImg = ImageIO.read(this.getClass().getResourceAsStream("ONET.png"));
		OFFETImg = ImageIO.read(this.getClass().getResourceAsStream("OFFET.png"));
		BTImg = ImageIO.read(this.getClass().getResourceAsStream("BT.png"));
		
		
	} 
	catch (IOException e) {
		e.printStackTrace();
	}

}

public void startGame()
{
	timer.start();
}

public void updateMenuState() {

}

public void updateLevel1State() {
	
	player.update();
	gp.update();
	
	
	if(player.isAlive == false)
	{
		DeathEffect d = new DeathEffect(player.x, player.y, 25, 25);
		player.x = 50;
		player.y = 100;
		gp.x = 50;
		gp.y = 100;
		player.isAlive = true;
	
		
	}

	//if(player.x == wtile.x && player.y == wtile.y)
	//{
	//	GameStateManager.CURRENT_STATE = 2;
		
	//}
}

public void drawLevel1State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.width, GameRunner.height);
	
	st1.draw(g);
	st2.draw(g);
	st3.draw(g);
	st4.draw(g);
	st5.draw(g);
	st6.draw(g);
	st7.draw(g);
	
	gp.draw(g);
	player.draw(g);
}




public void checkCollision(GameObject o)
{
	if(player.colBox.intersects(o.colBox) == true && (o instanceof RedTile || (o instanceof ElectricTile && o.state == 1)))
	{
		player.isAlive = false;
	}
	
	if (gp.colBox.intersects(o.colBox) == true && o instanceof SolidTile)
	{
		
	if (player.y < o.y && player.x == o.x)
	{
		gp.y -= 100;
	}
	if (player.y > o.y && player.x == o.x)
	{
		gp.y += 100;
	}
	if (player.y == o.y && player.x < o.x)
	{
		gp.x -= 100;
	}
	if (player.y == o.y && player.x > o.x)
	{
		gp.x += 100;
	}
	
	}
	
}






public void paintComponent(Graphics g) {
	drawLevel1State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel1State();
	
}

@Override
public void keyTyped(KeyEvent e) {

	
}

@Override
public void keyPressed(KeyEvent e) {
	int key = e.getKeyCode();
	
	if(InputManager.horizontal == false && InputManager.vertical == false)
	{
	if(key == KeyEvent.VK_RIGHT)
	{
		gp.x += 100;
		InputManager.horizontal = true;
	}
	if(key == KeyEvent.VK_LEFT)
	{
		gp.x -= 100;
		InputManager.horizontal = true;
	}
	if(key == KeyEvent.VK_UP)
	{
		gp.y -= 100;
		InputManager.vertical = true;
	}
	if(key == KeyEvent.VK_DOWN)
	{
		gp.y += 100;
		InputManager.vertical = true;
	}
	if(key == KeyEvent.VK_ENTER)
	{
		player.x = gp.x;
		player.y = gp.y;
		InputManager.horizontal = false;
		InputManager.vertical = false;
		//et.state = -et.state;
	}
	}
	
	
	
	else if(InputManager.horizontal == true)
	{
		if(key == KeyEvent.VK_RIGHT)
		{
			gp.x += 100;
			InputManager.horizontal = true;
		}
		if(key == KeyEvent.VK_LEFT)
		{
			gp.x -= 100;
			InputManager.horizontal = true;
		}
		if(key == KeyEvent.VK_ENTER)
		{
			player.x = gp.x;
			player.y = gp.y;
			InputManager.horizontal = false;
			InputManager.vertical = false;
			//et.state = -et.state;
		}
	}
	
	else if(InputManager.vertical == true)
	{
		if(key == KeyEvent.VK_UP)
		{
			gp.y -= 100;
			InputManager.vertical = true;
		}
		if(key == KeyEvent.VK_DOWN)
		{
			gp.y += 100;
			InputManager.vertical = true;
		}
		if(key == KeyEvent.VK_ENTER)
		{
			player.x = gp.x;
			player.y = gp.y;
			//et.state = -et.state;
			InputManager.horizontal = false;
			InputManager.vertical = false;
		}
		if(gp.x == player.x && gp.y == player.y)
		{
			InputManager.horizontal = false;
			InputManager.vertical = false;
		}
	}
	
}

@Override
public void keyReleased(KeyEvent e) {

	
}


}
