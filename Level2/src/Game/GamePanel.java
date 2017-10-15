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



public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer timer;
Player player = new Player(50,100,50,50);
GridPlayer gp = new GridPlayer(50, 100, 50, 50);

SafeTile stile1 = new SafeTile(50,50, 50, 50);
SafeTile stile2 = new SafeTile(100,50, 50, 50);
SafeTile stile3 = new SafeTile(150,50, 50, 50);
SafeTile stile4 = new SafeTile(200,50, 50, 50);
SafeTile stile5 = new SafeTile(250,50, 50, 50);
SafeTile stile6 = new SafeTile(300,50, 50, 50);
SafeTile stile7 = new SafeTile(350,50, 50, 50);
SafeTile stile8 = new SafeTile(400,50, 50, 50);
SafeTile stile9 = new SafeTile(50,100, 50, 50);
SafeTile stile10 = new SafeTile(100,100, 50, 50);
SafeTile stile11 = new SafeTile(150,100, 50, 50);
SafeTile stile12 = new SafeTile(200,100, 50, 50);
SafeTile stile13 = new SafeTile(250,100, 50, 50);

SolidTile bt = new SolidTile(300, 100, 50, 50);
NextLevelTile wtile = new NextLevelTile(350,100, 50, 50);
ElectricTile et = new ElectricTile(400, 100, 50, 50);

SafeTile stile17 = new SafeTile(50,150, 50, 50);
SafeTile stile18 = new SafeTile(100,150, 50, 50);
SafeTile stile19 = new SafeTile(150,150, 50, 50);
SafeTile stile20 = new SafeTile(200,150, 50, 50);
SafeTile stile21 = new SafeTile(250,150, 50, 50);
SafeTile stile22 = new SafeTile(300,150, 50, 50);
SafeTile stile23 = new SafeTile(350,150, 50, 50);
SafeTile stile24 = new SafeTile(400,150, 50, 50);

RedTile rtile1 = new RedTile(0,0,50,50);
RedTile rtile2 = new RedTile(0,50,50,50);
RedTile rtile3 = new RedTile(0,100,50,50);
RedTile rtile4 = new RedTile(0,150,50,50);
RedTile rtile5 = new RedTile(0,200,50,50);
RedTile rtile6 = new RedTile(50,200,50,50);
RedTile rtile7 = new RedTile(100,200,50,50);
RedTile rtile8 = new RedTile(150,200,50,50);
RedTile rtile9 = new RedTile(200,200,50,50);
RedTile rtile10 = new RedTile(250,200,50,50);
RedTile rtile11 = new RedTile(300,200,50,50);
RedTile rtile12 = new RedTile(350,200,50,50);
RedTile rtile13 = new RedTile(400,200,50,50);
RedTile rtile14 = new RedTile(450,200,50,50);
RedTile rtile15 = new RedTile(450,150,50,50);
RedTile rtile16 = new RedTile(450,100,50,50);
RedTile rtile17 = new RedTile(450,50,50,50);
RedTile rtile18 = new RedTile(450,0,50,50);
RedTile rtile19 = new RedTile(400,0,50,50);
RedTile rtile20 = new RedTile(350,0,50,50);
RedTile rtile21 = new RedTile(300,0,50,50);
RedTile rtile22 = new RedTile(250,0,50,50);
RedTile rtile23 = new RedTile(200,0,50,50);
RedTile rtile24 = new RedTile(150,0,50,50);
RedTile rtile25 = new RedTile(100,0,50,50);
RedTile rtile26 = new RedTile(50,0,50,50);



public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;



public GamePanel()
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
	
	checkCollision(rtile1);
	checkCollision(rtile2);
	checkCollision(rtile3);
	checkCollision(rtile4);
	checkCollision(rtile5);
	checkCollision(rtile6);
	checkCollision(rtile7);
	checkCollision(rtile8);
	checkCollision(rtile9);
	checkCollision(rtile10);
	checkCollision(rtile11);
	checkCollision(rtile12);
	checkCollision(rtile13);
	checkCollision(rtile14);
	checkCollision(rtile15);
	checkCollision(rtile16);
	checkCollision(rtile17);
	checkCollision(rtile18);
	checkCollision(rtile19);
	checkCollision(rtile20);
	checkCollision(rtile21);
	checkCollision(rtile22);
	checkCollision(rtile23);
	checkCollision(rtile24);
	checkCollision(rtile25);
	checkCollision(rtile26);
	
	checkCollision(et);
	checkCollision(bt);
	
	
	if(player.isAlive == false)
	{
		DeathEffect d = new DeathEffect(player.x, player.y, 25, 25);
		player.x = 50;
		player.y = 100;
		gp.x = 50;
		gp.y = 100;
		player.isAlive = true;
	
		
	}
}

public void drawLevel1State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.width, GameRunner.height);
	
	rtile1.draw(g);
	rtile2.draw(g);
	rtile3.draw(g);
	rtile4.draw(g);
	rtile5.draw(g);
	rtile6.draw(g);
	rtile7.draw(g);
	rtile8.draw(g);
	rtile9.draw(g);
	rtile10.draw(g);
	rtile11.draw(g);
	rtile12.draw(g);
	rtile13.draw(g);
	rtile14.draw(g);
	rtile15.draw(g);
	rtile16.draw(g);
	rtile17.draw(g);
	rtile18.draw(g);
	rtile19.draw(g);
	rtile20.draw(g);
	rtile21.draw(g);
	rtile22.draw(g);
	rtile23.draw(g);
	rtile24.draw(g);
	rtile25.draw(g);
	rtile26.draw(g);
	
	
	stile1.draw(g);
	stile2.draw(g);
	stile3.draw(g);
	stile4.draw(g);
	stile5.draw(g);
	stile6.draw(g);
	stile7.draw(g);
	stile8.draw(g);
	stile9.draw(g);
	stile10.draw(g);
	stile11.draw(g);
	stile12.draw(g);
	stile13.draw(g);

	bt.draw(g);
	wtile.draw(g);
	et.draw(g);

	stile17.draw(g);
	stile18.draw(g);
	stile19.draw(g);
	stile20.draw(g);
	stile21.draw(g);
	stile22.draw(g);
	stile23.draw(g);
	stile24.draw(g);
	
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
		gp.y -= 50;
	}
	if (player.y > o.y && player.x == o.x)
	{
		gp.y += 50;
	}
	if (player.y == o.y && player.x < o.x)
	{
		gp.x -= 50;
	}
	if (player.y == o.y && player.x > o.x)
	{
		gp.x += 50;
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
		gp.x += 50;
		InputManager.horizontal = true;
	}
	if(key == KeyEvent.VK_LEFT)
	{
		gp.x -= 50;
		InputManager.horizontal = true;
	}
	if(key == KeyEvent.VK_UP)
	{
		gp.y -= 50;
		InputManager.vertical = true;
	}
	if(key == KeyEvent.VK_DOWN)
	{
		gp.y += 50;
		InputManager.vertical = true;
	}
	if(key == KeyEvent.VK_ENTER)
	{
		player.x = gp.x;
		player.y = gp.y;
		InputManager.horizontal = false;
		InputManager.vertical = false;
		et.state = -et.state;
	}
	}
	
	else if(gp.x == player.x && gp.y == player.y)
	{
		InputManager.horizontal = false;
		InputManager.vertical = false;
	}
	
	
	else if(InputManager.horizontal == true)
	{
		if(key == KeyEvent.VK_RIGHT)
		{
			gp.x += 50;
			InputManager.horizontal = true;
		}
		if(key == KeyEvent.VK_LEFT)
		{
			gp.x -= 50;
			InputManager.horizontal = true;
		}
		if(key == KeyEvent.VK_ENTER)
		{
			player.x = gp.x;
			player.y = gp.y;
			InputManager.horizontal = false;
			InputManager.vertical = false;
			et.state = -et.state;
		}
	}
	
	else if(InputManager.vertical == true)
	{
		if(key == KeyEvent.VK_UP)
		{
			gp.y -= 50;
			InputManager.vertical = true;
		}
		if(key == KeyEvent.VK_DOWN)
		{
			gp.y += 50;
			InputManager.vertical = true;
		}
		if(key == KeyEvent.VK_ENTER)
		{
			player.x = gp.x;
			player.y = gp.y;
			et.state = -et.state;
			InputManager.horizontal = false;
			InputManager.vertical = false;
		}
	}
	
}

@Override
public void keyReleased(KeyEvent e) {

	
}


}
