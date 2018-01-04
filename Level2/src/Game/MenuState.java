package Game;


import java.awt.Color;
import java.awt.Font;
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


public class MenuState extends JPanel implements KeyListener, ActionListener{
		private BufferedImage p;
		Timer timer;
		boolean menuSelect = true;
		
		private int currentChoice = 0;
		private String[] options = {
			"Start",
			"Quit"
		};
		
		private Color titleColor;
		private Font titleFont;
		
		private Font font;
		private Font font2;
		
		public MenuState() {
			timer = new Timer(1000/60, this);
		
				// load select
				try {
					p = ImageIO.read(
						getClass().getResourceAsStream("GP.png")
					).getSubimage(110, 130, 120, 110);
				} catch (IOException e) {
					
					e.printStackTrace(); 
				}
				
				// titles and fonts
				titleColor = Color.WHITE;
				titleFont = new Font("Times New Roman", Font.PLAIN, 175);
				font = new Font("Callibri", Font.PLAIN, 140);
				font2 = new Font("Arial", Font.PLAIN, 50);
			
		}
		
		
		public void paintComponent(Graphics g) {
			
			// draw bg
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, GameRunner.width, GameRunner.height);
			
			// draw title
			g.setColor(titleColor);
			g.setFont(titleFont);
			g.drawString("P I X E L  R O O K", 50, 200);
			
			// draw menu options
			g.setFont(font);
			g.setColor(Color.WHITE);
			g.drawString("Start", 600, 400);
			g.drawString("Quit", 600, 600);
			
			// draw floating rook
			if(currentChoice == 0) g.drawImage(p, 450, 300, null);
			else if(currentChoice == 1) g.drawImage(p, 450, 500, null);
			
			// other
			g.setFont(font2);
			g.drawString("2018 Zahir A.", 10, 725);
			
			menuSelect = true;
		}
		
		public void startGame()
		{
			timer.start();
		}

		
		private void select() {
			if(currentChoice == 0) {
				timer.stop();
				menuSelect = false;
				Sound.click.play();
				GameRunner.frame.remove(GameRunner.m);
				GameRunner.frame.add(GameRunner.f);
				GameRunner.frame.setSize(GameRunner.width, GameRunner.height);
				GameRunner.frame.setVisible(true);
				GameRunner.frame.addKeyListener(GameRunner.f);
				GameRunner.f.startGame();
				
			}
			else if(currentChoice == 1) {
				System.exit(0);
			}
		}
		
		public void actionPerformed(ActionEvent e) {
			repaint();
			
			
		}
		@Override
		public void keyTyped(KeyEvent e) {
		
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if(menuSelect == true)
			{
			int key = e.getKeyCode();
			if(key == KeyEvent.VK_ENTER) select();
			if(key == KeyEvent.VK_UP) {
				if(currentChoice > 0) {
					currentChoice--;
				}
			}
			if(key == KeyEvent.VK_DOWN) {
				if(currentChoice < options.length - 1) {
					currentChoice++;
				}
			}
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
			
		}
		
	}


