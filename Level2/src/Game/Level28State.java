package Game;

import Game.tiles.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Level28State extends JPanel implements ActionListener, KeyListener{
	
	private final static int WIDTH_IN_TILES = 11;
	private final static int HEIGHT_IN_TILES = 13;
	private final static int TILE_SIDE_LENGTH = GameRunner.height/ HEIGHT_IN_TILES;
	private static int opacity = 0;
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
GridPlayer gp = new GridPlayer(TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);

SolidTile t1 = new SolidTile(0, 0, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t2 = new SolidTile(TILE_SIDE_LENGTH, 0, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t3 = new SolidTile(TILE_SIDE_LENGTH *2, 0, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t4 = new SolidTile(TILE_SIDE_LENGTH *3, 0, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t5 = new SolidTile(TILE_SIDE_LENGTH *4, 0, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t6 = new SolidTile(TILE_SIDE_LENGTH *5, 0, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t7 = new SolidTile(TILE_SIDE_LENGTH *6, 0, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t8 = new SolidTile(TILE_SIDE_LENGTH *7, 0, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t9 = new SolidTile(TILE_SIDE_LENGTH *8, 0, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t10 = new SolidTile(TILE_SIDE_LENGTH *9, 0, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t11 = new SolidTile(TILE_SIDE_LENGTH *10, 0, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);

SolidTile t12 = new SolidTile(0, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SafeTile t13 = new SafeTile(TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedElectricTile t14 = new RedElectricTile(TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);
SafeTile t15 = new SafeTile(TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t16 = new SolidTile(TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t17 = new SolidTile(TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t18 = new SolidTile(TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SafeTile t19 = new SafeTile(TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedElectricTile t20 = new RedElectricTile(TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);
SafeTile t21 = new SafeTile(TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t22 = new SolidTile(TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);

SolidTile t23 = new SolidTile(0, TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SafeTile t24 = new SafeTile(TILE_SIDE_LENGTH, TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedElectricTile t25 = new RedElectricTile(TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);
SafeTile t26 = new SafeTile(TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t27 = new SolidTile(TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t28 = new SolidTile(TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t29 = new SolidTile(TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SafeTile t30 = new SafeTile(TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
NextFloorTile t31 = new NextFloorTile(TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SafeTile t32 = new SafeTile(TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t33 = new SolidTile(TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);

SolidTile t34 = new SolidTile(0, TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SafeTile t35 = new SafeTile(TILE_SIDE_LENGTH, TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedElectricTile t36 = new RedElectricTile(TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);
SafeTile t37 = new SafeTile(TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t38 = new SolidTile(TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t39 = new SolidTile(TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t40 = new SolidTile(TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SafeTile t41 = new SafeTile(TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedElectricTile t42 = new RedElectricTile(TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);
SafeTile t43 = new SafeTile(TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t44 = new SolidTile(TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);

SolidTile t45 = new SolidTile(0, TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t46 = new SolidTile(TILE_SIDE_LENGTH, TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t47 = new RedTile(TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t48 = new SolidTile(TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t49 = new SolidTile(TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t50 = new SolidTile(TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t51 = new SolidTile(TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t52 = new SolidTile(TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t53 = new RedTile(TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t54 = new SolidTile(TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t55 = new SolidTile(TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);

RedTile t56 = new RedTile(0, TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t57 = new RedTile(TILE_SIDE_LENGTH, TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t58 = new RedTile(TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t59 = new RedTile(TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t60 = new RedTile(TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t61 = new SolidTile(TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t62 = new RedTile(TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t63 = new RedTile(TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t64 = new RedTile(TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t65 = new RedTile(TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t66 = new RedTile(TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);

RedElectricTile t67 = new RedElectricTile(0, TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);
DoubleLCB t68 = new DoubleLCB(TILE_SIDE_LENGTH, TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
DoubleLCB t69 = new DoubleLCB(TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
DoubleLCB t70 = new DoubleLCB(TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedElectricTile t71 = new RedElectricTile(TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);
SolidTile t72 = new SolidTile(TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedElectricTile t73 = new RedElectricTile(TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);
LeftConveyerBelt t74 = new LeftConveyerBelt(TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
DoubleLCB t75 = new DoubleLCB(TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
DoubleLCB t76 = new DoubleLCB(TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedElectricTile t77 = new RedElectricTile(TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);

RedTile t78 = new RedTile(0, TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t79 = new RedTile(TILE_SIDE_LENGTH, TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t80 = new RedTile(TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t81 = new RedTile(TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t82 = new RedTile(TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t83 = new SolidTile(TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t84 = new RedTile(TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t85 = new RedTile(TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t86 = new RedTile(TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t87 = new RedTile(TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t88 = new RedTile(TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);

RedElectricTile t89 = new RedElectricTile(0, TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);
DoubleRCB t90 = new DoubleRCB(TILE_SIDE_LENGTH, TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
DoubleRCB t91 = new DoubleRCB(TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RightConveyerBelt t92 = new RightConveyerBelt(TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedElectricTile t93 = new RedElectricTile(TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);
SolidTile t94 = new SolidTile(TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedElectricTile t95 = new RedElectricTile(TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);
DoubleRCB t96 = new DoubleRCB(TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
DoubleRCB t97 = new DoubleRCB(TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
DoubleRCB t98 = new DoubleRCB(TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedElectricTile t99 = new RedElectricTile(TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);

RedTile t100 = new RedTile(0, TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t101 = new RedTile(TILE_SIDE_LENGTH, TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t102 = new RedTile(TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t103 = new RedTile(TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t104 = new RedTile(TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
SolidTile t105 = new SolidTile(TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t106 = new RedTile(TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t107 = new RedTile(TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t108 = new RedTile(TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t109 = new RedTile(TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t110 = new RedTile(TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);

RedElectricTile t111 = new RedElectricTile(0, TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);
LeftConveyerBelt t112 = new LeftConveyerBelt(TILE_SIDE_LENGTH, TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
LeftConveyerBelt t113 = new LeftConveyerBelt(TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
LeftConveyerBelt t114 = new LeftConveyerBelt(TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedElectricTile t115 = new RedElectricTile(TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);
SolidTile t116 = new SolidTile(TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedElectricTile t117 = new RedElectricTile(TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);
LeftConveyerBelt t118 = new LeftConveyerBelt(TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
LeftConveyerBelt t119 = new LeftConveyerBelt(TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
LeftConveyerBelt t120 = new LeftConveyerBelt(TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedElectricTile t121 = new RedElectricTile(TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH, -1);

RedTile t122= new RedTile(0, TILE_SIDE_LENGTH *11, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t123 = new RedTile(TILE_SIDE_LENGTH, TILE_SIDE_LENGTH *11, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t124 = new RedTile(TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH *11, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t125 = new RedTile(TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH *11, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t126 = new RedTile(TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH *11, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t127 = new RedTile(TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH *11, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t128 = new RedTile(TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH *11, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t129 = new RedTile(TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH *11, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t130 = new RedTile(TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH *11, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t131 = new RedTile(TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH *11, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t132 = new RedTile(TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH *11, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);

RedTile t133= new RedTile(0, TILE_SIDE_LENGTH *12, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t134 = new RedTile(TILE_SIDE_LENGTH, TILE_SIDE_LENGTH *12, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t135 = new RedTile(TILE_SIDE_LENGTH *2, TILE_SIDE_LENGTH *12, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RightConveyerBelt t136 = new RightConveyerBelt(TILE_SIDE_LENGTH *3, TILE_SIDE_LENGTH *12, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RightConveyerBelt t137 = new RightConveyerBelt(TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH *12, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RightConveyerBelt t138 = new RightConveyerBelt(TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH *12, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RightConveyerBelt t139 = new RightConveyerBelt(TILE_SIDE_LENGTH *6, TILE_SIDE_LENGTH *12, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RightConveyerBelt t140 = new RightConveyerBelt(TILE_SIDE_LENGTH *7, TILE_SIDE_LENGTH *12, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t141 = new RedTile(TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH *12, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t142 = new RedTile(TILE_SIDE_LENGTH *9, TILE_SIDE_LENGTH *12, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
RedTile t143 = new RedTile(TILE_SIDE_LENGTH *10, TILE_SIDE_LENGTH *12, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);

Pawn e1 = new Pawn(TILE_SIDE_LENGTH *8, TILE_SIDE_LENGTH *4, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);
Pawn e2 = new Pawn(TILE_SIDE_LENGTH *5, TILE_SIDE_LENGTH *12, TILE_SIDE_LENGTH, TILE_SIDE_LENGTH);



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
	manager.checkCollision(player, TILE_SIDE_LENGTH);
	winChecker();
	boundChecker();
	
	
	if(player.isAlive == false)
	{
		gp.x = TILE_SIDE_LENGTH * 2;
		gp.y = TILE_SIDE_LENGTH *2;
		
		
		player.x = TILE_SIDE_LENGTH *2;
		player.y = TILE_SIDE_LENGTH *2;
		
		e1.x = TILE_SIDE_LENGTH *8;
		e1.y = TILE_SIDE_LENGTH *4;
		
		e2.x = TILE_SIDE_LENGTH *5;
		e2.y = TILE_SIDE_LENGTH *12;
		
		manager.redTileReset();
		
		
		player.isAlive = true;
		
	}

	
}

public void boundChecker()
{
	if(gp.x < 0) {gp.x = 0;}
	if(gp.x > TILE_SIDE_LENGTH * WIDTH_IN_TILES - gp.width) {gp.x = TILE_SIDE_LENGTH * WIDTH_IN_TILES - gp.width;}
	if(gp.y < 0) {gp.y = 0;}
	if(gp.y > TILE_SIDE_LENGTH * HEIGHT_IN_TILES - gp.height) {gp.y = TILE_SIDE_LENGTH * HEIGHT_IN_TILES - gp.height;}
	
	if(player.x < 0) {player.x = 0;}
	if(player.x > TILE_SIDE_LENGTH * WIDTH_IN_TILES - player.width) {player.x = TILE_SIDE_LENGTH * WIDTH_IN_TILES - player.width;}
	if(player.y < 0) {player.y = 0;}
	if(player.y > TILE_SIDE_LENGTH * HEIGHT_IN_TILES - player.height) {player.y = TILE_SIDE_LENGTH * HEIGHT_IN_TILES - player.height;}
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
			Sound.menuTrack.stop();
		
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
		gp.x += TILE_SIDE_LENGTH;
		InputManager.horizontal = true;
	}
	if(key == KeyEvent.VK_LEFT)
	{
		gp.x -= TILE_SIDE_LENGTH;
		InputManager.horizontal = true;
	}
	if(key == KeyEvent.VK_UP)
	{
		gp.y -= TILE_SIDE_LENGTH;
		InputManager.vertical = true;
	}
	if(key == KeyEvent.VK_DOWN)
	{
		gp.y += TILE_SIDE_LENGTH;
		InputManager.vertical = true;
	}

	}
	
	
	
	else if(InputManager.horizontal )
	{
		if(key == KeyEvent.VK_RIGHT)
		{
			gp.x += TILE_SIDE_LENGTH;
			InputManager.horizontal = true;
		}
		if(key == KeyEvent.VK_LEFT)
		{
			gp.x -= TILE_SIDE_LENGTH;
			InputManager.horizontal = true;
		}
		
	}
	
	else if(InputManager.vertical )
	{
		if(key == KeyEvent.VK_UP)
		{
			gp.y -= TILE_SIDE_LENGTH;
			InputManager.vertical = true;
		}
		if(key == KeyEvent.VK_DOWN)
		{
			gp.y += TILE_SIDE_LENGTH;
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
		
		manager.moveTile(TILE_SIDE_LENGTH, WIDTH_IN_TILES, HEIGHT_IN_TILES + 2* TILE_SIDE_LENGTH);
		
		manager.switchState();
		player.x= gp.x;
		player.y= gp.y;
		
		manager.rightConveyerBelt(player, gp, TILE_SIDE_LENGTH);
		manager.movePawn(TILE_SIDE_LENGTH, WIDTH_IN_TILES * TILE_SIDE_LENGTH, HEIGHT_IN_TILES * TILE_SIDE_LENGTH, player);
		manager.moveRook(TILE_SIDE_LENGTH, WIDTH_IN_TILES * TILE_SIDE_LENGTH, HEIGHT_IN_TILES * TILE_SIDE_LENGTH, player);
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
