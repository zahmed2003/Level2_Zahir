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
	static Level8State lv8 = new Level8State();
	static Level9State lv9 = new Level9State();
	static Level10State lv10 = new Level10State();
	static Level11State lv11 = new Level11State();
	static Level12State lv12 = new Level12State();
	static Level13State lv13 = new Level13State();


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
		Level8State lv8 = new Level8State();
		Level9State lv9 = new Level9State();
		Level10State lv10 = new Level10State();
		Level11State lv11 = new Level11State();
		Level12State lv12 = new Level12State();
		Level13State lv13 = new Level13State();
		
		JFrame frame = new JFrame();

		GameRunner.frame = frame;
		
		GameRunner.lv1 = lv1;
		GameRunner.lv2 = lv2;
		GameRunner.lv3 = lv3;
		GameRunner.lv4 = lv4;
		GameRunner.lv5 = lv5;
		GameRunner.lv6 = lv6;
		GameRunner.lv7 = lv7;
		GameRunner.lv8 = lv8;
		GameRunner.lv9 = lv9;
		GameRunner.lv10 = lv10;
		GameRunner.lv11 = lv11;
		GameRunner.lv12 = lv12;
		GameRunner.lv13 = lv13;
		
		setup();
	}

	public void setup() {
		GameRunner.frame.add(GameRunner.lv13);
		GameRunner.frame.setSize(GameRunner.width, GameRunner.height);
		GameRunner.frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameRunner.frame.addKeyListener(GameRunner.lv13);
		GameRunner.lv13.startGame();

			
			
	}
	
	
	}




