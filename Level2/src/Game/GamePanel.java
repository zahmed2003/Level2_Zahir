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
CollisionSetter setter = new CollisionSetter();

final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState = MENU_STATE;


public GamePanel()
{
	timer = new Timer(1000/60, this);
	
	setter.addObject(rtile1);
	setter.addObject(stile1);
	setter.addObject(gp);
	setter.addObject(player);
}

public void startGame()
{
	timer.start();
}

public void updateMenuState() {

}

public void updateGameState() {
	setter.update();
	setter.checkCollision();
	if (player.isAlive == false)
	{
		currentState = END_STATE;
		player.isAlive = true;
		setter.reset();
		this.player = new Player(0,250,50,50);
		setter.addObject(player);
	}
	
}

public void updateEndState() {

}

public void drawMenuState(Graphics g) {
	g.setColor(Color.WHITE);
	g.fillRect(0, 0, GameRunner.width, GameRunner.height);

}

public void drawGameState(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.width, GameRunner.height);
	
	setter.draw(g);
}

public void drawEndState(Graphics g) {
	g.setColor(Color.WHITE);
	g.fillRect(0, 0, GameRunner.width, GameRunner.height);


}

public void paintComponent(Graphics g) {
	if (currentState == MENU_STATE) {
		drawMenuState(g);
	} else if (currentState == GAME_STATE) {
		drawGameState(g);
	} else if (currentState == END_STATE) {
		drawEndState(g);
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
	
	if (e.getKeyCode() == KeyEvent.VK_SPACE) { 
		
		if (currentState < 2) {
			currentState += 1;
		}
		if (currentState == 2)
		{
			currentState = GAME_STATE;
		}
		if (currentState >= 3) {
			currentState = MENU_STATE;
		}
	}
	
	
}

@Override
public void keyReleased(KeyEvent e) {

	
}


}
