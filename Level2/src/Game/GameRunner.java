package Game;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameRunner{

	JFrame frame = new JFrame();
	final static int width = 1000;
	final static int height = 1000;
	
	Level1State lv1 = new Level1State();
	Level2State lv2 = new Level2State();


	public static void main(String[] args) {
		GameRunner game = new GameRunner();
		
	
	}

	public GameRunner() {
		Level1State lv1 = new Level1State();
		Level2State lv2 = new Level2State();
		
		JFrame frame = new JFrame();

		this.frame = frame;
		
		this.lv1 = lv1;
		this.lv2 = lv2;
		setup();
	}

	public void setup() {
		
		 if(GameStateManager.CURRENT_STATE == 1)
			{
			frame.setTitle("Game");
			frame.add(lv1);
			frame.setSize(width, height);
			frame.setVisible(true);
			frame.addKeyListener(lv1);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			lv1.startGame();
			}
			if(GameStateManager.CURRENT_STATE == 2)
			{
				frame.remove(lv1);
				frame.add(lv2);
				frame.setSize(width, height);
				frame.setVisible(true);
				frame.addKeyListener(lv2);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				lv2.startGame();
			}
	}
	
	
	}




