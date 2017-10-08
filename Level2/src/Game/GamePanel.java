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
Player player = new Player(50,50,50,50);


public GamePanel()
{
	timer = new Timer(1000/60, this);
}

public void startGame()
{
	timer.start();
}


public void paintComponent(Graphics g){
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.width, GameRunner.height);
	
	player.draw(g);
	player.update();
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
	
	
}

@Override
public void keyReleased(KeyEvent e) {

	
}


}
