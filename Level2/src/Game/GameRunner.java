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
	static Level4State lv4 = new Level4State();
	static Level5State lv5 = new Level5State();
	static Level6State lv6 = new Level6State();
	static Level7State lv7 = new Level7State();


	public static void main(String[] args) {
		GameRunner game = new GameRunner();
		
	
	}

	public GameRunner() {
		
		MenuState m = new MenuState();
		GamePanel lv1 = new GamePanel();
		Level2State lv2 = new Level2State();
		Level3State lv3 = new Level3State();
		Level4State lv4 = new Level4State();
		Level5State lv5 = new Level5State();
		Level6State lv6 = new Level6State();
		Level7State lv7 = new Level7State();
		
		JFrame frame = new JFrame();

		GameRunner.frame = frame;
		
		GameRunner.lv1 = lv1;
		GameRunner.lv2 = lv2;
		GameRunner.lv3 = lv3;
		GameRunner.lv4 = lv4;
		GameRunner.lv5 = lv5;
		GameRunner.lv6 = lv6;
		GameRunner.lv7 = lv7;
		
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




