package Game;

import Game.tiles.RedTile;
import Game.tiles.SafeTile;
import Game.tiles.SolidTile;

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

public class Level3State  extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 7;
	public static int thn = 7;
	public static int th = GameRunner.height/twn;
	public static int tw = th;
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw*5 + GameRunner.width/4, th*5, tw,th);
GridPlayer gp = new GridPlayer(tw*5 + GameRunner.width/4,th*5, tw,th);

SafeTile t1 = new SafeTile(0+ GameRunner.width/4, 0, tw, th);
SafeTile t2 = new SafeTile(tw+ GameRunner.width/4, 0, tw, th);
SafeTile t3 = new SafeTile(2*tw+ GameRunner.width/4, 0, tw, th);
SolidTile t4 = new SolidTile(3*tw+ GameRunner.width/4, 0, tw, th);
RedTile t5 = new RedTile(4*tw+ GameRunner.width/4, 0, tw, th);
RedTile t6 = new RedTile(5*tw+ GameRunner.width/4, 0, tw, th);
RedTile t7 = new RedTile(6*tw+ GameRunner.width/4, 0, tw, th);

SafeTile t8 = new SafeTile(0+ GameRunner.width/4, th, tw, th);
NextLevelTile t9 = new NextLevelTile(tw+ GameRunner.width/4, th, tw, th);
SafeTile t10 = new SafeTile(2*tw+ GameRunner.width/4, th, tw, th);
SolidTile t11 = new SolidTile(3*tw+ GameRunner.width/4, th, tw, th);
SafeTile t12 = new SafeTile(4*tw+ GameRunner.width/4, th, tw, th);
SafeTile t13 = new SafeTile(5*tw+ GameRunner.width/4, th, tw, th);
RedTile t14 = new RedTile(6*tw+ GameRunner.width/4, th, tw, th);

SafeTile t15 = new SafeTile(0+ GameRunner.width/4, 2*th, tw, th);
SafeTile t16 = new SafeTile(tw+ GameRunner.width/4, 2*th, tw, th);
SafeTile t17 = new SafeTile(2*tw+ GameRunner.width/4, 2*th, tw, th);
SafeTile t18 = new SafeTile(3*tw+ GameRunner.width/4, 2*th, tw, th);
SafeTile t19 = new SafeTile(4*tw+ GameRunner.width/4, 2*th, tw, th);
SafeTile t20 = new SafeTile(5*tw+ GameRunner.width/4, 2*th, tw, th);
RedTile t21 = new RedTile(6*tw + GameRunner.width/4, 2*th, tw, th);

SolidTile t22 = new SolidTile(0 + GameRunner.width/4, 3*th, tw, th);
SolidTile t23 = new SolidTile(tw + GameRunner.width/4, 3*th, tw, th);
SafeTile t24 = new SafeTile(2*tw + GameRunner.width/4, 3*th, tw, th);
RedTile t25 = new RedTile(3*tw + GameRunner.width/4, 3*th, tw, th);
SafeTile t26 = new SafeTile(4*tw + GameRunner.width/4, 3*th, tw, th);
SolidTile t27 = new SolidTile(5*tw + GameRunner.width/4, 3*th, tw, th);
SolidTile t28 = new SolidTile(6*tw + GameRunner.width/4, 3*th, tw, th);

RedTile t29 = new RedTile(0 + GameRunner.width/4, 4*th, tw, th);
SafeTile t30 = new SafeTile(tw + GameRunner.width/4, 4*th, tw, th);
SafeTile t31 = new SafeTile(2*tw + GameRunner.width/4, 4*th, tw, th);
SafeTile t32 = new SafeTile(3*tw + GameRunner.width/4, 4*th, tw, th);
SafeTile t33 = new SafeTile(4*tw + GameRunner.width/4, 4*th, tw, th);
SafeTile t34 = new SafeTile(5*tw + GameRunner.width/4, 4*th, tw, th);
SafeTile t35 = new SafeTile(6*tw + GameRunner.width/4, 4*th, tw, th);

RedTile t36 = new RedTile(0 + GameRunner.width/4, 5*th, tw, th);
SafeTile t37 = new SafeTile(tw + GameRunner.width/4, 5*th, tw, th);
SafeTile t38 = new SafeTile(2*tw + GameRunner.width/4, 5*th, tw, th);
SolidTile t39 = new SolidTile(3*tw + GameRunner.width/4, 5*th, tw, th);
SafeTile t40 = new SafeTile(4*tw + GameRunner.width/4, 5*th, tw, th);
SafeTile t41 = new SafeTile(5*tw + GameRunner.width/4, 5*th, tw, th);
SafeTile t42 = new SafeTile(6*tw + GameRunner.width/4, 5*th, tw, th);

RedTile t43 = new RedTile(0 + GameRunner.width/4, 6*th , tw, th);
RedTile t44 = new RedTile(tw + GameRunner.width/4, 6*th, tw, th);
RedTile t45 = new RedTile(2*tw + GameRunner.width/4, 6*th, tw, th);
SolidTile t46 = new SolidTile(3*tw + GameRunner.width/4, 6*th, tw, th);
SafeTile t47 = new SafeTile(4*tw + GameRunner.width/4, 6*th, tw, th);
SafeTile t48 = new SafeTile(5*tw + GameRunner.width/4, 6*th, tw, th);
SafeTile t49 = new SafeTile(6*tw + GameRunner.width/4, 6*th, tw, th);


public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level3State()
{
	timer = new Timer(1000/60, this);
	
	manager.addObject(t1);
	manager.addObject(t2);
	manager.addObject(t3);
	manager.addObject(t4);
	manager.addObject(t5);
	manager.addObject(t6);
	manager.addObject(t7);
	manager.addObject(t8);
	manager.addObject(t9);
	manager.addObject(t10);
	manager.addObject(t11);
	manager.addObject(t12);
	manager.addObject(t13);
	manager.addObject(t14);
	manager.addObject(t15);
	manager.addObject(t16);
	manager.addObject(t17);
	manager.addObject(t18);
	manager.addObject(t19);
	manager.addObject(t20);
	manager.addObject(t21);
	manager.addObject(t22);
	manager.addObject(t23);
	manager.addObject(t24);
	manager.addObject(t25);
	manager.addObject(t26);
	manager.addObject(t27);
	manager.addObject(t28);
	manager.addObject(t29);
	manager.addObject(t30);
	manager.addObject(t31);
	manager.addObject(t32);
	manager.addObject(t33);
	manager.addObject(t34);
	manager.addObject(t35);
	manager.addObject(t36);
	manager.addObject(t37);
	manager.addObject(t38);
	manager.addObject(t39);
	manager.addObject(t40);
	manager.addObject(t41);
	manager.addObject(t42);
	manager.addObject(t43);
	manager.addObject(t44);
	manager.addObject(t45);
	manager.addObject(t46);
	manager.addObject(t47);
	manager.addObject(t48);
	manager.addObject(t49);
	

	manager.addObject(gp);
	manager.addObject(player);
	
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

public void updateLevel3State() {
	
	manager.update();
	manager.checkCollision(player, tw);
	winChecker();
	boundChecker();
	
	
	if(player.isAlive == false)
	{
		gp.x = tw*5 + GameRunner.width/4;
		gp.y = th*5;
		
		player.x = tw*5 + GameRunner.width/4;
		player.y = th*5;
		player.isAlive = true;
		
	}

	
}

public void boundChecker()
{
	if(gp.x < GameRunner.width/4) {gp.x = GameRunner.width/4;}
	if(gp.x >tw*7 - gp.width + GameRunner.width/4) {gp.x = tw*7 - gp.width+ GameRunner.width/4;}
	if(gp.y < 0) {gp.y = 0;}
	if(gp.y > th*7 - gp.height) {gp.y = th*7 - gp.height;}

}

public void winChecker()
{
	if(player.x == t9.x && player.y == t9.y)
	{
		manager.reset();
		timer.stop();
		GameRunner.frame.remove(GameRunner.lv4);
		GameRunner.frame.add(GameRunner.lv4);
		GameRunner.frame.setSize(GameRunner.width, GameRunner.height);
		GameRunner.frame.setVisible(true);
		GameRunner.frame.addKeyListener(GameRunner.lv4);
		GameRunner.lv4.startGame();
	}
}

public void drawLevel3State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.width, GameRunner.height);
	manager.draw(g);
}




public void paintComponent(Graphics g) {
	drawLevel3State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel3State();
	
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
		gp.x += tw;
		InputManager.horizontal = true;
	}
	if(key == KeyEvent.VK_LEFT)
	{
		gp.x -= tw;
		InputManager.horizontal = true;
	}
	if(key == KeyEvent.VK_UP)
	{
		gp.y -= th;
		InputManager.vertical = true;
	}
	if(key == KeyEvent.VK_DOWN)
	{
		gp.y += th;
		InputManager.vertical = true;
	}
	if(key == KeyEvent.VK_ENTER)
	{
		player.x = gp.x;
		player.y = gp.y;
		InputManager.horizontal = false;
		InputManager.vertical = false;
	}
	}
	
	
	
	else if(InputManager.horizontal == true)
	{
		if(key == KeyEvent.VK_RIGHT)
		{
			gp.x += tw;
			InputManager.horizontal = true;
		}
		if(key == KeyEvent.VK_LEFT)
		{
			gp.x -= tw;
			InputManager.horizontal = true;
		}
		if(key == KeyEvent.VK_ENTER)
		{
			player.x = gp.x;
			player.y = gp.y;
			InputManager.horizontal = false;
			InputManager.vertical = false;
		}
	}
	
	else if(InputManager.vertical == true)
	{
		if(key == KeyEvent.VK_UP)
		{
			gp.y -= th;
			InputManager.vertical = true;
		}
		if(key == KeyEvent.VK_DOWN)
		{
			gp.y += th;
			InputManager.vertical = true;
		}
		if(key == KeyEvent.VK_ENTER)
		{
			player.x = gp.x;
			player.y = gp.y;
			InputManager.horizontal = false;
			InputManager.vertical = false;
		}
		
	}
	if(gp.x == player.x && gp.y == player.y)
	{
		InputManager.horizontal = false;
		InputManager.vertical = false;
	}
}

@Override
public void keyReleased(KeyEvent e) {

	
}


}

