package Game;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameRunner{

	static JFrame frame = new JFrame();
	final static int width = 1500;
	final static int height = 750;
	
	static MenuState m = new MenuState();
	static GamePanel lv1 = new GamePanel();
	static Level2State lv2 = new Level2State();
	static Level3State lv3 = new Level3State();


	public static void main(String[] args) {
		GameRunner game = new GameRunner();
		
	
	}

	public GameRunner() {
		
		MenuState m = new MenuState();
		GamePanel lv1 = new GamePanel();
		Level2State lv2 = new Level2State();
		Level3State lv3 = new Level3State();
		
		JFrame frame = new JFrame();

		GameRunner.frame = frame;
		
		GameRunner.lv1 = lv1;
		GameRunner.lv2 = lv2;
		GameRunner.lv3 = lv3;
		setup();
	}

	public void setup() {
		GameRunner.frame.add(GameRunner.m);
		GameRunner.frame.setSize(GameRunner.width, GameRunner.height);
		GameRunner.frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameRunner.frame.addKeyListener(GameRunner.m);
		GameRunner.m.startGame();

			
			
	}
	
	
	}




