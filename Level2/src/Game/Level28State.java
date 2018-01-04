package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Level28State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 11;
	public static int thn = 13;
	public static int th = GameRunner.height/thn;
	public static int tw = th;
	public static int opacity = 0;
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw*2, th*2, tw,th);
GridPlayer gp = new GridPlayer(tw*2,th*2, tw,th);

SolidTile t1 = new SolidTile(0, 0, tw, th);
SolidTile t2 = new SolidTile(tw, 0, tw, th);
SolidTile t3 = new SolidTile(tw*2, 0, tw, th);
SolidTile t4 = new SolidTile(tw*3, 0, tw, th);
SolidTile t5 = new SolidTile(tw*4, 0, tw, th);
SolidTile t6 = new SolidTile(tw*5, 0, tw, th);
SolidTile t7 = new SolidTile(tw*6, 0, tw, th);
SolidTile t8 = new SolidTile(tw*7, 0, tw, th);
SolidTile t9 = new SolidTile(tw*8, 0, tw, th);
SolidTile t10 = new SolidTile(tw*9, 0, tw, th);
SolidTile t11 = new SolidTile(tw*10, 0, tw, th);

SolidTile t12 = new SolidTile(0, th, tw, th);
SafeTile t13 = new SafeTile(tw, th, tw, th);
RedElectricTile t14 = new RedElectricTile(tw*2, th, tw, th, -1);
SafeTile t15 = new SafeTile(tw*3, th, tw, th);
SolidTile t16 = new SolidTile(tw*4, th, tw, th);
SolidTile t17 = new SolidTile(tw*5, th, tw, th);
SolidTile t18 = new SolidTile(tw*6, th, tw, th);
SafeTile t19 = new SafeTile(tw*7, th, tw, th);
RedElectricTile t20 = new RedElectricTile(tw*8, th, tw, th, -1);
SafeTile t21 = new SafeTile(tw*9, th, tw, th);
SolidTile t22 = new SolidTile(tw*10, th, tw, th);

SolidTile t23 = new SolidTile(0, th*2, tw, th);
SafeTile t24 = new SafeTile(tw, th*2, tw, th);
RedElectricTile t25 = new RedElectricTile(tw*2, th*2, tw, th, -1);
SafeTile t26 = new SafeTile(tw*3, th*2, tw, th);
SolidTile t27 = new SolidTile(tw*4, th*2, tw, th);
SolidTile t28 = new SolidTile(tw*5, th*2, tw, th);
SolidTile t29 = new SolidTile(tw*6, th*2, tw, th);
SafeTile t30 = new SafeTile(tw*7, th*2, tw, th);
NextFloorTile t31 = new NextFloorTile(tw*8, th*2, tw, th);
SafeTile t32 = new SafeTile(tw*9, th*2, tw, th);
SolidTile t33 = new SolidTile(tw*10, th*2, tw, th);

SolidTile t34 = new SolidTile(0, th*3, tw, th);
SafeTile t35 = new SafeTile(tw, th*3, tw, th);
RedElectricTile t36 = new RedElectricTile(tw*2, th*3, tw, th, -1);
SafeTile t37 = new SafeTile(tw*3, th*3, tw, th);
SolidTile t38 = new SolidTile(tw*4, th*3, tw, th);
SolidTile t39 = new SolidTile(tw*5, th*3, tw, th);
SolidTile t40 = new SolidTile(tw*6, th*3, tw, th);
SafeTile t41 = new SafeTile(tw*7, th*3, tw, th);
RedElectricTile t42 = new RedElectricTile(tw*8, th*3, tw, th, -1);
SafeTile t43 = new SafeTile(tw*9, th*3, tw, th);
SolidTile t44 = new SolidTile(tw*10, th*3, tw, th);

SolidTile t45 = new SolidTile(0, th*4, tw, th);
SolidTile t46 = new SolidTile(tw, th*4, tw, th);
RedTile t47 = new RedTile(tw*2, th*4, tw, th);
SolidTile t48 = new SolidTile(tw*3, th*4, tw, th);
SolidTile t49 = new SolidTile(tw*4, th*4, tw, th);
SolidTile t50 = new SolidTile(tw*5, th*4, tw, th);
SolidTile t51 = new SolidTile(tw*6, th*4, tw, th);
SolidTile t52 = new SolidTile(tw*7, th*4, tw, th);
RedTile t53 = new RedTile(tw*8, th*4, tw, th);
SolidTile t54 = new SolidTile(tw*9, th*4, tw, th);
SolidTile t55 = new SolidTile(tw*10, th*4, tw, th);

RedTile t56 = new RedTile(0, th*5, tw, th);
RedTile t57 = new RedTile(tw, th*5, tw, th);
RedTile t58 = new RedTile(tw*2, th*5, tw, th);
RedTile t59 = new RedTile(tw*3, th*5, tw, th);
RedTile t60 = new RedTile(tw*4, th*5, tw, th);
SolidTile t61 = new SolidTile(tw*5, th*5, tw, th);
RedTile t62 = new RedTile(tw*6, th*5, tw, th);
RedTile t63 = new RedTile(tw*7, th*5, tw, th);
RedTile t64 = new RedTile(tw*8, th*5, tw, th);
RedTile t65 = new RedTile(tw*9, th*5, tw, th);
RedTile t66 = new RedTile(tw*10, th*5, tw, th);

RedElectricTile t67 = new RedElectricTile(0, th*6, tw, th, -1);
DoubleLCB t68 = new DoubleLCB(tw, th*6, tw, th);
DoubleLCB t69 = new DoubleLCB(tw*2, th*6, tw, th);
DoubleLCB t70 = new DoubleLCB(tw*3, th*6, tw, th);
RedElectricTile t71 = new RedElectricTile(tw*4, th*6, tw, th, -1);
SolidTile t72 = new SolidTile(tw*5, th*6, tw, th);
RedElectricTile t73 = new RedElectricTile(tw*6, th*6, tw, th, -1);
LeftConveyerBelt t74 = new LeftConveyerBelt(tw*7, th*6, tw, th);
DoubleLCB t75 = new DoubleLCB(tw*8, th*6, tw, th);
DoubleLCB t76 = new DoubleLCB(tw*9, th*6, tw, th);
RedElectricTile t77 = new RedElectricTile(tw*10, th*6, tw, th, -1);

RedTile t78 = new RedTile(0, th*7, tw, th);
RedTile t79 = new RedTile(tw, th*7, tw, th);
RedTile t80 = new RedTile(tw*2, th*7, tw, th);
RedTile t81 = new RedTile(tw*3, th*7, tw, th);
RedTile t82 = new RedTile(tw*4, th*7, tw, th);
SolidTile t83 = new SolidTile(tw*5, th*7, tw, th);
RedTile t84 = new RedTile(tw*6, th*7, tw, th);
RedTile t85 = new RedTile(tw*7, th*7, tw, th);
RedTile t86 = new RedTile(tw*8, th*7, tw, th);
RedTile t87 = new RedTile(tw*9, th*7, tw, th);
RedTile t88 = new RedTile(tw*10, th*7, tw, th);

RedElectricTile t89 = new RedElectricTile(0, th*8, tw, th, -1);
DoubleRCB t90 = new DoubleRCB(tw, th*8, tw, th);
DoubleRCB t91 = new DoubleRCB(tw*2, th*8, tw, th);
RightConveyerBelt t92 = new RightConveyerBelt(tw*3, th*8, tw, th);
RedElectricTile t93 = new RedElectricTile(tw*4, th*8, tw, th, -1);
SolidTile t94 = new SolidTile(tw*5, th*8, tw, th);
RedElectricTile t95 = new RedElectricTile(tw*6, th*8, tw, th, -1);
DoubleRCB t96 = new DoubleRCB(tw*7, th*8, tw, th);
DoubleRCB t97 = new DoubleRCB(tw*8, th*8, tw, th);
DoubleRCB t98 = new DoubleRCB(tw*9, th*8, tw, th);
RedElectricTile t99 = new RedElectricTile(tw*10, th*8, tw, th, -1);

RedTile t100 = new RedTile(0, th*9, tw, th);
RedTile t101 = new RedTile(tw, th*9, tw, th);
RedTile t102 = new RedTile(tw*2, th*9, tw, th);
RedTile t103 = new RedTile(tw*3, th*9, tw, th);
RedTile t104 = new RedTile(tw*4, th*9, tw, th);
SolidTile t105 = new SolidTile(tw*5, th*9, tw, th);
RedTile t106 = new RedTile(tw*6, th*9, tw, th);
RedTile t107 = new RedTile(tw*7, th*9, tw, th);
RedTile t108 = new RedTile(tw*8, th*9, tw, th);
RedTile t109 = new RedTile(tw*9, th*9, tw, th);
RedTile t110 = new RedTile(tw*10, th*9, tw, th);

RedElectricTile t111 = new RedElectricTile(0, th*10, tw, th, -1);
LeftConveyerBelt t112 = new LeftConveyerBelt(tw, th*10, tw, th);
LeftConveyerBelt t113 = new LeftConveyerBelt(tw*2, th*10, tw, th);
LeftConveyerBelt t114 = new LeftConveyerBelt(tw*3, th*10, tw, th);
RedElectricTile t115 = new RedElectricTile(tw*4, th*10, tw, th, -1);
SolidTile t116 = new SolidTile(tw*5, th*10, tw, th);
RedElectricTile t117 = new RedElectricTile(tw*6, th*10, tw, th, -1);
LeftConveyerBelt t118 = new LeftConveyerBelt(tw*7, th*10, tw, th);
LeftConveyerBelt t119 = new LeftConveyerBelt(tw*8, th*10, tw, th);
LeftConveyerBelt t120 = new LeftConveyerBelt(tw*9, th*10, tw, th);
RedElectricTile t121 = new RedElectricTile(tw*10, th*10, tw, th, -1);

RedTile t122= new RedTile(0, th*11, tw, th);
RedTile t123 = new RedTile(tw, th*11, tw, th);
RedTile t124 = new RedTile(tw*2, th*11, tw, th);
RedTile t125 = new RedTile(tw*3, th*11, tw, th);
RedTile t126 = new RedTile(tw*4, th*11, tw, th);
RedTile t127 = new RedTile(tw*5, th*11, tw, th);
RedTile t128 = new RedTile(tw*6, th*11, tw, th);
RedTile t129 = new RedTile(tw*7, th*11, tw, th);
RedTile t130 = new RedTile(tw*8, th*11, tw, th);
RedTile t131 = new RedTile(tw*9, th*11, tw, th);
RedTile t132 = new RedTile(tw*10, th*11, tw, th);

RedTile t133= new RedTile(0, th*12, tw, th);
RedTile t134 = new RedTile(tw, th*12, tw, th);
RedTile t135 = new RedTile(tw*2, th*12, tw, th);
RightConveyerBelt t136 = new RightConveyerBelt(tw*3, th*12, tw, th);
RightConveyerBelt t137 = new RightConveyerBelt(tw*4, th*12, tw, th);
RightConveyerBelt t138 = new RightConveyerBelt(tw*5, th*12, tw, th);
RightConveyerBelt t139 = new RightConveyerBelt(tw*6, th*12, tw, th);
RightConveyerBelt t140 = new RightConveyerBelt(tw*7, th*12, tw, th);
RedTile t141 = new RedTile(tw*8, th*12, tw, th);
RedTile t142 = new RedTile(tw*9, th*12, tw, th);
RedTile t143 = new RedTile(tw*10, th*12, tw, th);

Pawn e1 = new Pawn(tw*8, th*4, tw, th);
Pawn e2 = new Pawn(tw*5, th*12, tw, th);



public Level28State()
{
	timer = new Timer(1000/60, this);
	
	manager.addObject(t1);
	manager.addObject(t2);
	manager.addObject(t3);
	manager.addObject(t4);
	manager.addObject(t5);
	manager.addObject(t6);
	manager.addObject(t7);
	manager.addObject(t8);
	manager.addObject(t9);
	manager.addObject(t10);
	manager.addObject(t11);
	manager.addObject(t12);
	manager.addObject(t13);
	manager.addObject(t14);
	manager.addObject(t15);
	manager.addObject(t16);
	manager.addObject(t17);
	manager.addObject(t18);
	manager.addObject(t19);
	manager.addObject(t20);
	manager.addObject(t21);
	manager.addObject(t22);
	manager.addObject(t23);
	manager.addObject(t24);
	manager.addObject(t25);
	manager.addObject(t26);
	manager.addObject(t27);
	manager.addObject(t28);
	manager.addObject(t29);
	manager.addObject(t30);
	manager.addObject(t31);
	manager.addObject(t32);
	manager.addObject(t33);
	manager.addObject(t34);
	manager.addObject(t35);
	manager.addObject(t36);
	manager.addObject(t37);
	manager.addObject(t38);
	manager.addObject(t39);
	manager.addObject(t40);
	manager.addObject(t41);
	manager.addObject(t42);
	manager.addObject(t43);
	manager.addObject(t44);
	manager.addObject(t45);
	manager.addObject(t46);
	manager.addObject(t47);
	manager.addObject(t48);
	manager.addObject(t49);
	manager.addObject(t50);
	manager.addObject(t51);
	manager.addObject(t52);
	manager.addObject(t53);
	manager.addObject(t54);
	manager.addObject(t55);
	manager.addObject(t56);
	manager.addObject(t57);
	manager.addObject(t58);
	manager.addObject(t59);
	manager.addObject(t60);
	manager.addObject(t61);
	manager.addObject(t62);
	manager.addObject(t63);
	manager.addObject(t64);
	manager.addObject(t65);
	manager.addObject(t66);
	manager.addObject(t67);
	manager.addObject(t68);
	manager.addObject(t69);
	manager.addObject(t70);
	manager.addObject(t71);
	manager.addObject(t72);
	manager.addObject(t73);
	manager.addObject(t74);
	manager.addObject(t75);
	manager.addObject(t76);
	manager.addObject(t77);
	manager.addObject(t78);
	manager.addObject(t79);
	manager.addObject(t80);
	manager.addObject(t81);
	manager.addObject(t82);
	manager.addObject(t83);
	manager.addObject(t84);
	manager.addObject(t85);
	manager.addObject(t86);
	manager.addObject(t87);
	manager.addObject(t88);
	manager.addObject(t89);
	manager.addObject(t90);
	manager.addObject(t91);
	manager.addObject(t92);
	manager.addObject(t93);
	manager.addObject(t94);
	manager.addObject(t95);
	manager.addObject(t96);
	manager.addObject(t97);
	manager.addObject(t98);
	manager.addObject(t99);
	manager.addObject(t100);
	manager.addObject(t101);
	manager.addObject(t102);
	manager.addObject(t103);
	manager.addObject(t104);
	manager.addObject(t105);
	manager.addObject(t106);
	manager.addObject(t107);
	manager.addObject(t108);
	manager.addObject(t109);
	manager.addObject(t110);
	manager.addObject(t111);
	manager.addObject(t112);
	manager.addObject(t113);
	manager.addObject(t114);
	manager.addObject(t115);
	manager.addObject(t116);
	manager.addObject(t117);
	manager.addObject(t118);
	manager.addObject(t119);
	manager.addObject(t120);
	manager.addObject(t121);
	manager.addObject(t122);
	manager.addObject(t123);
	manager.addObject(t124);
	manager.addObject(t125);
	manager.addObject(t126);
	manager.addObject(t127);
	manager.addObject(t128);
	manager.addObject(t129);
	manager.addObject(t130);
	manager.addObject(t131);
	manager.addObject(t132);
	manager.addObject(t133);
	manager.addObject(t134);
	manager.addObject(t135);
	manager.addObject(t136);
	manager.addObject(t137);
	manager.addObject(t138);
	manager.addObject(t139);
	manager.addObject(t140);
	manager.addObject(t141);
	manager.addObject(t142);
	manager.addObject(t143);
	
	manager.addObject(e1);
	manager.addObject(e2);
	
	manager.addObject(gp);
	manager.addObject(player);

}


public void startGame()
{
	timer.start();
}

public void updateLevel28State() {

	manager.update();
	manager.checkCollision(player, tw);
	winChecker();
	boundChecker();
	
	
	if(player.isAlive == false)
	{
		gp.x = tw* 2;
		gp.y = th*2;
		
		
		player.x = tw*2;
		player.y = th*2;
		
		e1.x = tw*8;
		e1.y = th*4;
		
		e2.x = tw*5;
		e2.y = th*12;
		
		manager.redTileReset();
		
		
		player.isAlive = true;
		
	}

	
}

public void boundChecker()
{
	if(gp.x < 0) {gp.x = 0;}
	if(gp.x >tw*twn - gp.width) {gp.x = tw*twn - gp.width;}
	if(gp.y < 0) {gp.y = 0;}
	if(gp.y > th*thn - gp.height) {gp.y = th*thn - gp.height;}
	
	if(player.x < 0) {player.x = 0;}
	if(player.x >tw*twn - player.width) {player.x = tw*twn - player.width;}
	if(player.y < 0) {player.y = 0;}
	if(player.y > th*thn - player.height) {player.y = th*thn - player.height;}
}

public void winChecker()
{
	if(player.x == t31.x && player.y == t31.y)
	{
		if(opacity < 245)
		{
		if(System.currentTimeMillis() % 2 == 0)
			{
				opacity += 10;
			}
		}
		
		if(opacity >= 245)
		{
			Sound.sound3.stop();
		
			manager.reset();
			timer.stop();
			Sound.end.loop();
			GameRunner.frame.add(GameRunner.e);
			GameRunner.frame.setSize(GameRunner.width, GameRunner.height);
			GameRunner.frame.setVisible(true);
			GameRunner.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			GameRunner.frame.addKeyListener(GameRunner.e);
			GameRunner.e.startGame();

		}
	}
}

public void drawLevel28State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.width, GameRunner.height);
	manager.draw(g);
	
	g.setColor(new Color(255, 255, 255, opacity));
	g.fillRect(0, 0, GameRunner.width, GameRunner.height);
}


public void paintComponent(Graphics g) {
	drawLevel28State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel28State();
	
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
		gp.x += tw;
		InputManager.horizontal = true;
	}
	if(key == KeyEvent.VK_LEFT)
	{
		gp.x -= tw;
		InputManager.horizontal = true;
	}
	if(key == KeyEvent.VK_UP)
	{
		gp.y -= th;
		InputManager.vertical = true;
	}
	if(key == KeyEvent.VK_DOWN)
	{
		gp.y += th;
		InputManager.vertical = true;
	}

	}
	
	
	
	else if(InputManager.horizontal == true)
	{
		if(key == KeyEvent.VK_RIGHT)
		{
			gp.x += tw;
			InputManager.horizontal = true;
		}
		if(key == KeyEvent.VK_LEFT)
		{
			gp.x -= tw;
			InputManager.horizontal = true;
		}
		
	}
	
	else if(InputManager.vertical == true)
	{
		if(key == KeyEvent.VK_UP)
		{
			gp.y -= th;
			InputManager.vertical = true;
		}
		if(key == KeyEvent.VK_DOWN)
		{
			gp.y += th;
			InputManager.vertical = true;
		}
		
		
	}
	if(gp.x == player.x && gp.y == player.y)
	{
		InputManager.horizontal = false;
		InputManager.vertical = false;
	}
	if(key == KeyEvent.VK_ENTER)
	{
		manager.cb = false;
		KeyHandler.enterPressed = true;
		
		manager.moveTile(tw, twn, thn + 2*tw);
		
		manager.switchState();
		player.x= gp.x;
		player.y= gp.y;
		
		manager.rightConveyerBelt(player, gp, tw);
		manager.movePawn(tw, twn * tw, thn*th, player);
		manager.moveRook(tw, twn * tw, thn*th, player);
		manager.checkRedState(player);
		
		InputManager.horizontal = false;
		InputManager.vertical = false;
		
		KeyHandler.enterPressed = false;
	}
}

@Override
public void keyReleased(KeyEvent e) {

	
}

{

}
}
