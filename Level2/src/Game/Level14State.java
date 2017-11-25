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

public class Level14State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 16;
	public static int thn = 3;
	public static int tw = GameRunner.width/twn;
	public static int th = tw;
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw, th, tw,th);
GridPlayer gp = new GridPlayer(tw,th, tw,th);

SafeTile t1 = new SafeTile(0, 0, tw, th);
SafeTile t2 = new SafeTile(tw, 0, tw, th);
SafeTile t3 = new SafeTile(2*tw, 0, tw, th);
SolidTile t4 = new SolidTile(3*tw, 0, tw, th);
SafeTile t5 = new SafeTile(4*tw, 0, tw, th);
SafeTile t6 = new SafeTile(5*tw, 0, tw, th);
SafeTile t7 = new SafeTile(6*tw, 0, tw, th);
SafeTile t8 = new SafeTile(7*tw, 0, tw, th);
SafeTile t9 = new SafeTile(8*tw, 0, tw, th);
SafeTile t10 = new SafeTile(9*tw, 0, tw, th);
SafeTile t11 = new SafeTile(10*tw, 0, tw, th);
SolidTile t12 = new SolidTile(11*tw, 0, tw, th);
SafeTile t13 = new SafeTile(12*tw, 0, tw, th);
SafeTile t14 = new SafeTile(13*tw, 0, tw, th);
SafeTile t15 = new SafeTile(14*tw, 0, tw, th);
SolidTile t16 = new SolidTile(15*tw, 0, tw, th);

SafeTile t17 = new SafeTile(0, th, tw, th);
SafeTile t18 = new SafeTile(tw, th, tw, th);
SafeTile t19 = new SafeTile(2*tw, th, tw, th);
SolidTile t20 = new SolidTile(3*tw, th, tw, th);
SafeTile t21 = new SafeTile(4*tw, th, tw, th);
SafeTile t22 = new SafeTile(5*tw, th, tw, th);
SafeTile t23 = new SafeTile(6*tw, th, tw, th);
SolidTile t24 = new SolidTile(7*tw, th, tw, th);
SafeTile t25 = new SafeTile(8*tw, th, tw, th);
SafeTile t26 = new SafeTile(9*tw, th, tw, th);
SafeTile t27 = new SafeTile(10*tw, th, tw, th);
SolidTile t28 = new SolidTile(11*tw, th, tw, th);
SafeTile t29 = new SafeTile(12*tw, th, tw, th);
NextLevelTile t30 = new NextLevelTile(13*tw, th, tw, th);
SafeTile t31 = new SafeTile(14*tw, th, tw, th);
SolidTile t32 = new SolidTile(15*tw, th, tw, th);

SafeTile t33 = new SafeTile(0, 2*th, tw, th);
SafeTile t34 = new SafeTile(tw, 2*th, tw, th);
SafeTile t35 = new SafeTile(2*tw, 2*th, tw, th);
SafeTile t36 = new SafeTile(3*tw, 2*th, tw, th);
SafeTile t37 = new SafeTile(4*tw, 2*th, tw, th);
SafeTile t38 = new SafeTile(5*tw, 2*th, tw, th);
SafeTile t39 = new SafeTile(6*tw, 2*th, tw, th);
SolidTile t40 = new SolidTile(7*tw, 2*th, tw, th);
SafeTile t41 = new SafeTile(8*tw, 2*th, tw, th);
SafeTile t42 = new SafeTile(9*tw, 2*th, tw, th);
SafeTile t43 = new SafeTile(10*tw, 2*th, tw, th);
SafeTile t44 = new SafeTile(11*tw, 2*th, tw, th);
SafeTile t45 = new SafeTile(12*tw, 2*th, tw, th);
SafeTile t46 = new SafeTile(13*tw, 2*th, tw, th);
SafeTile t47 = new SafeTile(14*tw, 2*th, tw, th);
SolidTile t48 = new SolidTile(15*tw, 2*th, tw, th);

Pawn e1 = new Pawn(7*tw, 0, tw, th);
Pawn e2 = new Pawn(3*tw, 2*th, tw, th);
Pawn e3 = new Pawn(11*tw, 2*th, tw, th);

public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level14State()
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
	
	manager.addObject(e1);
	manager.addObject(e2);
	manager.addObject(e3);


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

public void updateLevel14State() {
	
	manager.update();
	manager.checkCollision(player, tw);
	winChecker();
	boundChecker();
	
	
	if(player.isAlive == false)
	{
		gp.x = tw;
		gp.y = th;
		
		player.x = tw;
		player.y = th;
		
		e1.x = 7*tw;
		e1.y = 0;
		
		e2.x = 3*tw;
		e2.y = 2*th;
		
		e3.x = 11*tw;
		e3.y = 2*th;
		
		player.isAlive = true;
		
	}

	
}

public void boundChecker()
{
	if(gp.x < 0) {gp.x = 0;}
	if(gp.x >tw*16 - gp.width) {gp.x = tw*16 - gp.width;}
	if(gp.y < 0) {gp.y = 0;}
	if(gp.y > th*3 - gp.height) {gp.y = th*3 - gp.height;}

}

public void winChecker()
{
	if(player.x == t30.x && player.y == t30.y)
	{
		//manager.reset();
		//timer.stop();
		//GameRunner.frame.remove(GameRunner.lv14);
		//GameRunner.frame.add(GameRunner.lv15);
		//GameRunner.frame.setSize(GameRunner.width, GameRunner.height);
		//GameRunner.frame.setVisible(true);
		//GameRunner.frame.addKeyListener(GameRunner.lv15);
		//GameRunner.lv15.startGame();
	}
}

public void drawLevel14State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.width, GameRunner.height);
	manager.draw(g);
}




public void paintComponent(Graphics g) {
	drawLevel14State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel14State();
	
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
		
		
	}
	if(gp.x == player.x && gp.y == player.y)
	{
		InputManager.horizontal = false;
		InputManager.vertical = false;
	}
	if(key == KeyEvent.VK_ENTER)
	{
		manager.moveTile(tw, twn*tw, thn*th);
		player.x = gp.x;
		player.y = gp.y;
		manager.movePawn(tw,twn*tw, thn*th, player);
		InputManager.horizontal = false;
		InputManager.vertical = false;
	}
}

@Override
public void keyReleased(KeyEvent e) {

	
}


}



