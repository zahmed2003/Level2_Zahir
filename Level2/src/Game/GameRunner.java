package Game;

import java.awt.Color;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameRunner{

	static JFrame frame = new JFrame();
	final static int width = 1500;
	final static int height = 750;
	GameRunner game;
	
	static MenuState m = new MenuState();
	static FloorSelector f = new FloorSelector();
	
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
	static Level14State lv14 = new Level14State();
	static Level15State lv15 = new Level15State();
	static Level16State lv16 = new Level16State();
	static Level17State lv17 = new Level17State();
	static Level18State lv18 = new Level18State();
	static Level19State lv19 = new Level19State();
	static Level20State lv20 = new Level20State();
	static Level21State lv21 = new Level21State();
	static Level22State lv22 = new Level22State();
	static Level23State lv23 = new Level23State();
	static Level24State lv24 = new Level24State();
	static Level25State lv25 = new Level25State();
	static Level26State lv26 = new Level26State();
	static Level27State lv27 = new Level27State();
	static Level28State lv28 = new Level28State();
	static Level29State lv29 = new Level29State();
	


	public static void main(String[] args) {
		GameRunner game = new GameRunner();
	
	}

	public GameRunner() {
		
		MenuState m = new MenuState();
		FloorSelector f = new FloorSelector();
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
		Level14State lv14 = new Level14State();
		Level15State lv15 = new Level15State();
		Level16State lv16 = new Level16State();
		Level17State lv17 = new Level17State();
		Level18State lv18 = new Level18State();
		Level19State lv19 = new Level19State();
		Level20State lv20 = new Level20State();
		Level21State lv21 = new Level21State();
		Level22State lv22 = new Level22State();
		Level23State lv23 = new Level23State();
		Level24State lv24 = new Level24State();
		Level25State lv25 = new Level25State();
		Level26State lv26 = new Level26State();
		Level27State lv27 = new Level27State();
		Level28State lv28 = new Level28State();
		Level29State lv29 = new Level29State();
		
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
		GameRunner.lv14 = lv14;
		GameRunner.lv15 = lv15;
		GameRunner.lv16 = lv16;
		GameRunner.lv17 = lv17;
		GameRunner.lv18 = lv18;
		GameRunner.lv19 = lv19;
		GameRunner.lv20 = lv20;
		GameRunner.lv21 = lv21;
		GameRunner.lv22 = lv22;
		GameRunner.lv23 = lv23;
		GameRunner.lv24 = lv24;
		GameRunner.lv25 = lv25;
		GameRunner.lv26 = lv26;
		GameRunner.lv27 = lv27;
		GameRunner.lv28 = lv28;
		GameRunner.lv29 = lv29;
		GameRunner.f = f;
		
		setup();
	}

	public void setup() {
		Sound.sound4.loop();
	
		GameRunner.frame.add(GameRunner.lv29);
		GameRunner.frame.setSize(GameRunner.width, GameRunner.height);
		GameRunner.frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameRunner.frame.addKeyListener(GameRunner.lv29);
		GameRunner.lv29.startGame();

			
			
	}
	
	
}


	
	




