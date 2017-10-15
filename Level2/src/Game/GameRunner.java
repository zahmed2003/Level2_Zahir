package Game;

import javax.swing.JFrame;


public class GameRunner{

	JFrame frame = new JFrame();
	final static int width = 500;
	final static int height = 270;
	GamePanel gamepanel = new GamePanel();


	public static void main(String[] args) {
		GameRunner game = new GameRunner();
		

	}

	public GameRunner() {
		GamePanel gamepanel = new GamePanel();
		JFrame frame = new JFrame();

		this.frame = frame;
		this.gamepanel = gamepanel;
		setup();
	}

	public void setup() {
		frame.setTitle("Game");
		frame.add(gamepanel);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.addKeyListener(gamepanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gamepanel.startGame();
	}
	 
	
	}




