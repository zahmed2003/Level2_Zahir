package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer timer;
Player player = new Player(0,250,50,50);
GridPlayer gp = new GridPlayer(0, 250, 50, 50);
SafeTile stile1 = new SafeTile(50,50, 50, 50);
RedTile rtile1 = new RedTile(50,0,50,50);


public GamePanel()
{
	timer = new Timer(1000/60, this);
}

public void startGame()
{
	timer.start();
}

public void updateGameState()
{
	player.checkCollision(player, rtile1);
}

public void paintComponent(Graphics g){
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.width, GameRunner.height);
	
	stile1.draw(g);
	rtile1.draw(g);
	
	gp.draw(g);
	gp.update();
	
	player.draw(g);
	player.update();
	
	
}

public void checkCollision(Player p, GameObject o)
{
	if(p.collisionBox == o.collisionBox && o instanceof RedTile)
	{
		p.isAlive = false;
	}
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	
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
	}
	}
	
	if(InputManager.horizontal == true)
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
		}
	}
	
	if(InputManager.vertical == true)
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
			InputManager.horizontal = false;
			InputManager.vertical = false;
		}
	}
	
	
}

@Override
public void keyReleased(KeyEvent e) {

	
}


}
