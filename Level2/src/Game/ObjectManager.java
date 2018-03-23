package Game;


import Game.tiles.*;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	ArrayList<GameObject> objects;
	public boolean cb = false;
	public boolean cbp = false;
	
	Random ra = new Random();
	int r1;
	int r2;
	int r3;
	int r4;
	int r5;
	int r6;
	int r7;
	int r8;
	int r;


	public ObjectManager() {
		objects = new ArrayList<GameObject>();
	}

	public void addObject(GameObject o) {
		objects.add(o);
	}

	public void update() {
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			o.update();
		}
		
		purgeObjects();	
	}
 
	public void draw(Graphics g) {
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			o.draw(g);
		}
	}

	private void purgeObjects() {
		for (int i = 0; i < objects.size(); i++) {
			if (!objects.get(i).isAlive) {
				objects.remove(i);
			}
		}
	}



	public void checkCollision(Player p, int tw) {
		for (int i = 0; i < objects.size(); i++) {
			for (int j = i + 1; j < objects.size(); j++) {
				
				GameObject o1 = objects.get(i);
				GameObject o2 = objects.get(j);
				
				
				if(o1 instanceof SolidTile && o2 instanceof Rook)
				{
					//tile 2
					if(o2.x == o1.x && o2.y - tw == o1.y)
					{
						o2.setSolidColliding2(true);
					}
					//tile 4
					if(o2.x + tw == o1.x && o2.y == o1.y)
					{
						o2.setSolidColliding4(true);
					}
					//tile 6
					if(o2.x == o1.x && o2.y + tw == o1.y)
					{
						o2.setSolidColliding6(true);
					}
					//tile 8
					if(o2.x - tw == o1.x && o2.y == o1.y)
					{
						o2.setSolidColliding8(true);
					}
				}
				if(o2 instanceof Pawn && (o1 instanceof SolidTile || o1 instanceof Pawn))
				{
					//tile 1
					if(o2.x - tw == o1.x && o2.y - tw == o1.y)
					{
						o2.setSolidColliding1(true);
					}
					//tile 2
					if(o2.x == o1.x && o2.y - tw == o1.y)
					{
						o2.setSolidColliding2(true);
					}
					//tile 3
					if(o2.x + tw == o1.x && o2.y - tw == o1.y)
					{
						o2.setSolidColliding3(true);
					}
					//tile 4
					if(o2.x + tw == o1.x && o2.y == o1.y)
					{
						o2.setSolidColliding4(true);
					}
					//tile 5
					if(o2.x + tw == o1.x && o2.y + tw == o1.y)
					{
						o2.setSolidColliding5(true);
					}
					//tile 6
					if(o2.x == o1.x && o2.y + tw == o1.y)
					{
						o2.setSolidColliding6(true);
					}
					
					//tile 7
					if(o2.x - tw == o1.x && o2.y + tw == o1.y)
					{
						o2.setSolidColliding7(true);
					}
					
					//tile 8
					if(o2.x - tw == o1.x && o2.y == o1.y)
					{
						o2.setSolidColliding8(true);
					}
					
				}
				
				if(o1.colBox.intersects(o2.colBox)){
					
					o1.setColliding(true);
					o1.setCollisionObject(o2);
					
					o2.setColliding(true);
					o2.setCollisionObject(o1);
					
					
					if(o1 instanceof Pawn && o2 instanceof Pawn)
					{
						r = ra.nextInt(7);
						if(r == 0)
						{
							if(o2.isSolidColliding1 == true)
							{
								if(o2.isSolidColliding2 == true && o2.isSolidColliding8 == false)
								{
									o2.x -= tw;
								}
								else if(o2.isSolidColliding8 == true && o2.isSolidColliding2 == false)
								{
									o2.y -= tw;
								}
								else if(o2.isSolidColliding8 == true && o2.isSolidColliding2 == true)
								{
									
								}
								else
								{
									r1 = ra.nextInt(1);
									if(r1 == 0) {o2.x -= tw;}
									if(r1 == 1) {o2.y -= tw;}
								}
							}
							else
							{
							o2.x -= tw;
							o2.y -= tw;
							}
						}
						
						//tile 2
						else if(r == 1)
						{
							if(o2.isSolidColliding2 == true)
							{
								if(o2.isSolidColliding1 == true && o2.isSolidColliding3 == false)
								{
									o2.x += tw;
									o2.y -= tw;
								}
								else if(o2.isSolidColliding3 == true && o2.isSolidColliding1 == false)
								{
									o2.x -= tw;
									o2.y -= tw;
								}
								else if(o2.isSolidColliding3 == true && o2.isSolidColliding1 == true)
								{
									
								}
								else
								{
									r2 = ra.nextInt(1);
									if(r2 == 0)
									{
									o2.x += tw;
									o2.y -= tw;
									}
									if(r2 == 1)
									{
										o2.x -= tw;
										o2.y -= tw;
									}
								}
							}
							else
							{
							o2.y -= tw;
							}
						}
						
						//tile 3
						else if(r == 2)
						{
							if(o2.isSolidColliding3 == true)
							{
								if(o2.isSolidColliding2 == true && o2.isSolidColliding4 == false)
								{
									o2.x += tw;
								}
								else if (o2.isSolidColliding4 == true && o2.isSolidColliding2 == false)
								{
									o2.y -= tw;
								}
								else if (o2.isSolidColliding2 == true && o2.isSolidColliding4 == true)
								{
									
								}
								else
								{
									r3 = ra.nextInt(1);
									if(r3 == 0)
									{
										o2.x += tw;
									}
									if(r3 == 1)
									{
										o2.y -= tw;
									}
								}
							}
							else
							{
							o2.x += tw;
							o2.y -= tw;
							}
							
						}
						
						//tile 4
						else if(r == 3)
						{
							if(o2.isSolidColliding4 == true)
							{
								if(o2.isSolidColliding3 == true && o2.isSolidColliding5 == false)
								{
								o2.x += tw;
								o2.y += tw;
								}
								else if(o2.isSolidColliding5 == true && o2.isSolidColliding3 == false)
								{
								o2.x += tw;
								o2.y -= tw;
								}
								else if (o2.isSolidColliding3 == true && o2.isSolidColliding5 == true)
								{
									
								}
								else
								{
									r4 = ra.nextInt(1);
									if(r4 == 0)
									{
										o2.x += tw;
										o2.y += tw;
									}
									if(r4 == 1)
									{
										o2.x += tw;
										o2.y -= tw;
									}
								}
								
								
							}
							else
							{	
								o2.x += tw;
							}
							
						}
						
						//tile 5
						else if(r == 4)
						{
							if(o2.isSolidColliding5 == true)
							{
								if(o2.isSolidColliding4 == true && o2.isSolidColliding6 == false)
								{
									o2.y += tw;
								}
								else if(o2.isSolidColliding6 == true && o2.isSolidColliding4 == false)
								{
									o2.x += tw;
								}
								else if (o2.isSolidColliding4 == true && o2.isSolidColliding4 == true)
								{
									
								}
								else
								{
									r5 = ra.nextInt(1);
									if(r5 == 0)
									{
										o2.x += tw;
									}
									if(r5 == 1)
									{
										o2.y += tw;
									}
								}
							}
							else
							{
							o2.x += tw;
							o2.y += tw;
							}
						}
						
						//tile 6
						else if(r == 5)
						{
							if(o2.isSolidColliding6 == true)
							{
								if(o2.isSolidColliding5 == true && o2.isSolidColliding7 == false)
								{
									o2.x -= tw;
									o2.y += tw;
								}
								else if(o2.isSolidColliding7 == true && o2.isSolidColliding5 == false)
								{
									o2.x += tw;
									o2.y += tw;
								}
								else if(o2.isSolidColliding7 == true && o2.isSolidColliding5 == true)
								{
									
								}
								else
								{
									r6 = ra.nextInt(1);
									if(r6 == 0)
									{
										o2.x -= tw;
										o2.y += tw;
									}
									if(r6 == 1)
									{
										o2.x += tw;
										o2.y += tw;
									}
								}
							}
							else
							{
							o2.y += tw;
							}
						}
						
						//tile 7
						else if(r == 6)
						{
							if(o2.isSolidColliding7 == true)
							{
								if(o2.isSolidColliding6 == true && o2.isSolidColliding8 == false)
								{
									o2.x -= tw;
								}
								else if(o2.isSolidColliding8 == true && o2.isSolidColliding6 == false)
								{
									o2.y += tw;
								}
								else if(o2.isSolidColliding8 == true && o2.isSolidColliding6 == true)
								{
									
								}
								else
								{
									r7 = ra.nextInt(1);
									if(r7 == 0)
									{
										o2.x -= tw;
									}
									if(r7 == 1)
									{
										o2.y += tw;
									}
								}
							}
							else
							{
							o2.x -= tw;
							o2.y += tw;
							}
						}
						
						//tile 8
						else if(r == 7)
						{
							if(o2.isSolidColliding8 == true)
							{
								if(o2.isSolidColliding7 == true && o2.isSolidColliding1 == false)
								{
									o2.x -= tw;
									o2.y -= tw;
								}
								else if(o2.isSolidColliding1 == true && o2.isSolidColliding7 == false)
								{
									o2.x -= tw;
									o2.y += tw;
								}
								else if(o2.isSolidColliding1 == true && o2.isSolidColliding7 == true)
								{
									
								}
								else
								{
									r8 = ra.nextInt(1);
									if(r8 == 0)
									{
										o2.x -= tw;
										o2.y -= tw;
									}
									if(r8 == 1)
									{
										o2.x -= tw;
										o2.y += tw;
									}
								}
							}
							else
							{
							o2.x -= tw;
							}
						}
					}
					
					if((o1 instanceof RedTile || o1 instanceof RMTile || o1 instanceof RMTile2 || (o1 instanceof RedElectricTile && o1.RState == 1) ||(o1 instanceof ElectricTile && o1.state == 1) || o1 instanceof Pawn || (o1 instanceof ECL && o1.state == 1) || (o1 instanceof ECR && o1.state == 1) || (o1 instanceof DECL && o1.state == 1) || (o1 instanceof RECL && o1.state == 1) || (o1 instanceof RECR && o1.state == 1) || (o1 instanceof DRECL && o1.state == 1) || (o1 instanceof DECR && o1.state == 1) || (o1 instanceof DRECR && o1.state == 1)) && o2 instanceof Player)
					{
						p.isAlive = false;
						Sound.death.play();
						KeyHandler.numDeaths += 1;
					}
					
					
					if((o2 instanceof RMTile2 && o1 instanceof SolidTile)) {
						if(o2.direction == -1)
						{
							o2.x += 2*tw;
						}
						if(o2.direction == 1)
						{
							o2.x -= 2*tw;
						}
						
						o2.direction = -o2.direction;
					}
					if(o1 instanceof RMTile2 && o2 instanceof SolidTile) {
						
						if(o1.direction == -1)
						{
							o1.x += 2*tw;
						}
						if(o1.direction == 1)
						{
							o1.x -= 2*tw;
						}
					
					o1.direction = -o1.direction;
				}
					
					
					
					if((o2 instanceof RMTile)&& o1 instanceof SolidTile) {
						if(o2.direction == -1)
						{
							o2.y -= 2*tw;
						}
						if(o2.direction == 1)
						{
							o2.y += 2*tw;
						}
						
						o2.direction = -o2.direction;
					}
					if((o1 instanceof RMTile && o2 instanceof SolidTile && o1.direction == 1)) {
						
						if(o1.direction == -1)
						{
							o1.x += 2*tw;
						}
						if(o1.direction == 1)
						{
							o1.x -= 2*tw;
						}
					
					o1.direction = -o1.direction;
				}
					
				
					
					if((o1 instanceof SolidTile || o1 instanceof Pawn) && o2 instanceof GridPlayer)
					{
						if (p.y < o2.y && p.x == o2.x)
						{
							o2.y -= tw;
						}
						if (p.y > o2.y && p.x == o2.x)
						{
							o2.y += tw;
						}
						if (p.y == o2.y && p.x < o2.x)
						{
							o2.x -= tw;
						}
						if (p.y == o2.y && p.x > o2.x)
						{
							o2.x += tw;
						}
					}
				}
			}
		}
	}
	
	public void switchState()
	{
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			if(o instanceof ElectricTile || o instanceof DECR || o instanceof DECL || o instanceof ECR || o instanceof ECL)
			{
				o.state = -o.state;
				
			}
			
		}
	}
	
	public void resetElectric()
	{
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			if(o instanceof ElectricTile || o instanceof DECR || o instanceof DECL || o instanceof ECR || o instanceof ECL)
			{
				o.state = -o.state;
			}
		}
	}
	
	public void moveRook(int tw, int width, int height, Player p)
	{
		for (int i = 0; i < objects.size(); i++) { 
			for (int j = i + 1; j < objects.size(); j++) {
			
			GameObject o = objects.get(i);
			GameObject o2 = objects.get(j);
			
			
			if(o instanceof Rook)
			{
				
				if(p.x == o.x && p.y < o.y)
				{
					for(int i1 = 1; i1 <= (o.y - p.y)/tw; i1++)
					{
						if(o.isSolidColliding2 == false)
						{
							o.y += ((p.y - o.y)/tw)*tw;
						}
						if(o.isSolidColliding2 == true)
						{
							//do nothing
						}
						
					}

				}
				
				else if(p.x > o.x && p.y == o.y)
				{
					for(int i2 = 1; i2 <= (p.x - o.x)/tw; i2++)
					{
						
						if(o.isSolidColliding4 == false)
						{
							o.x += ((p.x - o.x)/tw)*tw;
						}
						if(o.isSolidColliding4 == true)
						{
							//do nothing
						}
						
					}
				}
				
				
				else if(p.x == o.x && p.y > o.y)
				{
					for(int i3 = 1; i3 <= (p.y - o.y)/tw; i3++)
					{
						if(o.isSolidColliding6 == false)
						{
							o.y += ((p.y - o.y)/tw)*tw;
						}
						if(o.isSolidColliding6 == true)
						{
							//do nothing
						}
						
					}
				}
				
				else if(p.x < o.x && p.y == o.y)
				{
					for(int i4 = 1; i4 <= (o.x - p.x)/tw; i4++)
					{
						
						if(o.isSolidColliding8 == false)
						{
							o.x -= ((o.x - p.x)/tw)*tw;
						}
						if(o.isSolidColliding8 == true)
						{
							//do nothing
						}
						
					}
				}
			}
		}
		}
	}
	
	public void movePawn(int tw, int width, int height, Player p)
	{
		for (int i = 0; i < objects.size(); i++) {
			
				GameObject o = objects.get(i);
				
				if(o instanceof Pawn)
				{
					
				//tile 1
				if(p.x < o.x && p.y < o.y)
				{
					if(o.isSolidColliding1 == true)
					{
						if(o.isSolidColliding2 == true && o.isSolidColliding8 == false)
						{
							o.x -= tw;
						}
						else if(o.isSolidColliding8 == true && o.isSolidColliding2 == false)
						{
							o.y -= tw;
						}
						else if(o.isSolidColliding8 == true && o.isSolidColliding2 == true)
						{
							
						}
						else
						{
							r1 = ra.nextInt(1);
							if(r1 == 0) {o.x -= tw;}
							if(r1 == 1) {o.y -= tw;}
						}
					}
					else
					{
					o.x -= tw;
					o.y -= tw;
					}
				}
				
				//tile 2
				else if(p.x == o.x && p.y < o.y)
				{
					if(o.isSolidColliding2 == true)
					{
						if(o.isSolidColliding1 == true && o.isSolidColliding3 == false)
						{
							o.x += tw;
							o.y -= tw;
						}
						else if(o.isSolidColliding3 == true && o.isSolidColliding1 == false)
						{
							o.x -= tw;
							o.y -= tw;
						}
						else if(o.isSolidColliding3 == true && o.isSolidColliding1 == true)
						{
							
						}
						else
						{
							r2 = ra.nextInt(1);
							if(r2 == 0)
							{
							o.x += tw;
							o.y -= tw;
							}
							if(r2 == 1)
							{
								o.x -= tw;
								o.y -= tw;
							}
						}
					}
					else
					{
					o.y -= tw;
					}
				}
				
				//tile 3
				else if(p.x > o.x && p.y < o.y)
				{
					if(o.isSolidColliding3 == true)
					{
						if(o.isSolidColliding2 == true && o.isSolidColliding4 == false)
						{
							o.x += tw;
						}
						else if (o.isSolidColliding4 == true && o.isSolidColliding2 == false)
						{
							o.y -= tw;
						}
						else if (o.isSolidColliding2 == true && o.isSolidColliding4 == true)
						{
							
						}
						else
						{
							r3 = ra.nextInt(1);
							if(r3 == 0)
							{
								o.x += tw;
							}
							if(r3 == 1)
							{
								o.y -= tw;
							}
						}
					}
					else
					{
					o.x += tw;
					o.y -= tw;
					}
					
				}
				
				//tile 4
				else if(p.x > o.x && p.y == o.y)
				{
					if(o.isSolidColliding4 == true)
					{
						if(o.isSolidColliding3 == true && o.isSolidColliding5 == false)
						{
						o.x += tw;
						o.y += tw;
						}
						else if(o.isSolidColliding5 == true && o.isSolidColliding3 == false)
						{
						o.x += tw;
						o.y -= tw;
						}
						else if (o.isSolidColliding3 == true && o.isSolidColliding5 == true)
						{
							
						}
						else
						{
							r4 = ra.nextInt(1);
							if(r4 == 0)
							{
								o.x += tw;
								o.y += tw;
							}
							if(r4 == 1)
							{
								o.x += tw;
								o.y -= tw;
							}
						}
						
						
					}
					else
					{	
						o.x += tw;
					}
					
				}
				
				//tile 5
				else if(p.x > o.x && p.y > o.y)
				{
					if(o.isSolidColliding5 == true)
					{
						if(o.isSolidColliding4 == true && o.isSolidColliding6 == false)
						{
							o.y += tw;
						}
						else if(o.isSolidColliding6 == true && o.isSolidColliding4 == false)
						{
							o.x += tw;
						}
						else if (o.isSolidColliding4 == true && o.isSolidColliding4 == true)
						{
							
						}
						else
						{
							r5 = ra.nextInt(1);
							if(r5 == 0)
							{
								o.x += tw;
							}
							if(r5 == 1)
							{
								o.y += tw;
							}
						}
					}
					else
					{
					o.x += tw;
					o.y += tw;
					}
				}
				
				//tile 6
				else if(p.x == o.x && p.y > o.y)
				{
					if(o.isSolidColliding6 == true)
					{
						if(o.isSolidColliding5 == true && o.isSolidColliding7 == false)
						{
							o.x -= tw;
							o.y += tw;
						}
						else if(o.isSolidColliding7 == true && o.isSolidColliding5 == false)
						{
							o.x += tw;
							o.y += tw;
						}
						else if(o.isSolidColliding7 == true && o.isSolidColliding5 == true)
						{
							
						}
						else
						{
							r6 = ra.nextInt(1);
							if(r6 == 0)
							{
								o.x -= tw;
								o.y += tw;
							}
							if(r6 == 1)
							{
								o.x += tw;
								o.y += tw;
							}
						}
					}
					else
					{
					o.y += tw;
					}
				}
				
				//tile 7
				else if(p.x < o.x && p.y > o.y)
				{
					if(o.isSolidColliding7 == true)
					{
						if(o.isSolidColliding6 == true && o.isSolidColliding8 == false)
						{
							o.x -= tw;
						}
						else if(o.isSolidColliding8 == true && o.isSolidColliding6 == false)
						{
							o.y += tw;
						}
						else if(o.isSolidColliding8 == true && o.isSolidColliding6 == true)
						{
							
						}
						else
						{
							r7 = ra.nextInt(1);
							if(r7 == 0)
							{
								o.x -= tw;
							}
							if(r7 == 1)
							{
								o.y += tw;
							}
						}
					}
					else
					{
					o.x -= tw;
					o.y += tw;
					}
				}
				
				//tile 8
				else if(p.x < o.x && p.y == o.y)
				{
					if(o.isSolidColliding8 == true)
					{
						if(o.isSolidColliding7 == true && o.isSolidColliding1 == false)
						{
							o.x -= tw;
							o.y -= tw;
						}
						else if(o.isSolidColliding1 == true && o.isSolidColliding7 == false)
						{
							o.x -= tw;
							o.y += tw;
						}
						else if(o.isSolidColliding1 == true && o.isSolidColliding7 == true)
						{
							
						}
						else
						{
							r8 = ra.nextInt(1);
							if(r8 == 0)
							{
								o.x -= tw;
								o.y -= tw;
							}
							if(r8 == 1)
							{
								o.x -= tw;
								o.y += tw;
							}
						}
					}
					else
					{
					o.x -= tw;
					}
				}
				
				o.setSolidColliding1(false);
				o.setSolidColliding2(false);
				o.setSolidColliding3(false);
				o.setSolidColliding4(false);
				o.setSolidColliding5(false);
				o.setSolidColliding6(false);
				o.setSolidColliding7(false);
				o.setSolidColliding8(false);
				
				}
				
			}
		}
	
	public void moveTile(int tw, int width, int height) {
		for (int i = 0; i < objects.size(); i++) {
				GameObject o = objects.get(i);
				if(o instanceof RMTile)
				{
					
					if(o.direction == -1 &&o.y >= height - o.height)
					{
						o.direction = 1;
					}
					
					if(o.direction == 1 && (o.y <= 0))
					{
						o.direction = -1;
					}
					if(o.direction == 1)
					{
						o.y -= tw;
					}
					if(o.direction == -1)
					{
						o.y+=tw;
					}
				}
				
				
				if(o instanceof RMTile2)
				{
				if(o.direction == -1 && (o.x <= 0))
					{
						o.direction = 1;
					}
					
				if(o.direction == 1 && (o.x >= width - o.width))
					{
						
						o.direction = -1;

					}
				 if(o.direction == 1)
					{
						o.x += tw;
					}
				 if(o.direction == -1)
					{
						o.x-=tw;
					}
				}
		}
	}
	
	public void checkRedState(Player p)
	{
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			if(o instanceof RedElectricTile || o instanceof RECR || o instanceof RECL || o instanceof DRECR || o instanceof DRECL)
			{
				if(KeyHandler.enterPressed == true && o.direction == 22)
				{
					o.RState = 1;
					o.direction = 0;
				}
				else if(p.x == o.x && p.y == o.y && KeyHandler.enterPressed == true)
				{
					o.direction = 22;
				}
			}
			}
	}
	
	public void redTileReset()
	{
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			if(o instanceof RedElectricTile || o instanceof RECR || o instanceof RECL || o instanceof DRECR || o instanceof DRECL)
			{
				o.RState = -1;
			}
		}
	}
	
	public void rightConveyerBelt(Player p, GridPlayer gp, int tw)
	{
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			if(cb == false)
			{
			if((o instanceof RightConveyerBelt || o instanceof ECR || o instanceof RECR)&& o.x == p.x && o.y == p.y)
			{
				p.x += tw;
				gp.x += tw;
				cb = true;
			}
			if((o instanceof LeftConveyerBelt || o instanceof ECL || o instanceof RECL) && o.x == p.x && o.y == p.y)
			{
				p.x -= tw;
				gp.x -= tw;
				cb = true;
			}
			if((o instanceof DoubleRCB || o instanceof DECR || o instanceof DRECR) && o.x == p.x && o.y == p.y)
			{
				p.x += 2*tw;
				gp.x += 2*tw;
				cb = true;
			}
			if((o instanceof DoubleLCB || o instanceof DECL || o instanceof DRECL) && o.x == p.x && o.y == p.y)
			{
				p.x -= 2*tw;
				gp.x -= 2*tw;
				cb = true;
			}
			}
		}
		}
	
	public void reset(){
		objects.clear();
	}
}

