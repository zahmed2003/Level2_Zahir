package Game;


import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	ArrayList<GameObject> objects;

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
				
				if(o2 instanceof Pawn && o1 instanceof SolidTile)
				{
					if(o2.x + tw == o1.x && o2.y - tw == o1.y)
					{
						o2.setSolidColliding3(true);
					}
					if(o2.x + tw == o1.x && o2.y == o1.y)
					{
						o2.setSolidColliding4(true);
					}
					if(o2.x + tw == o1.x && o2.y + tw == o1.y)
					{
						o2.setSolidColliding5(true);
					}
					
				}
				
				if(o1.colBox.intersects(o2.colBox)){
					
					o1.setColliding(true);
					o1.setCollisionObject(o2);
					
					o2.setColliding(true);
					o2.setCollisionObject(o1);
					
				
					
					if((o1 instanceof RedTile || o1 instanceof RMTile || o1 instanceof RMTile2 || (o1 instanceof ElectricTile && o1.state == 1)) && o2 instanceof Player)
					{
						p.isAlive = false;
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
					
				
					
					if(o1 instanceof SolidTile && o2 instanceof GridPlayer)
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
			if(o instanceof ElectricTile)
			{
				o.state = -o.state;
				
			}
			
		}
	}
	
	public void resetElectric()
	{
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			if(o instanceof ElectricTile)
			{
				o.state = -o.state;
			}
		}
	}
	
	public void movePawn(int tw, int width, int height, Player p)
	{
		for (int i = 0; i < objects.size(); i++) {
			
				GameObject o = objects.get(i);
				
				if(o instanceof Pawn)
				{
				if(p.x < o.x && p.y < o.y)
				{
					o.x -= tw;
					o.y -= tw;
				}
				else if(p.x == o.x && p.y < o.y)
				{
					o.y -= tw;
				}
				else if(p.x > o.x && p.y < o.y)
				{
					o.x += tw;
					o.y -= tw;
					
				}
				else if(p.x > o.x && p.y == o.y)
				{
					if(o.isSolidColliding4 == true)
					{
						if(o.isSolidColliding5 == true)
						{
						o.x += tw;
						o.y -= tw;
						}
						else if(o.isSolidColliding3 == true)
						{
						o.x += tw;
						o.y += tw;
						}
						else
						{
							o.x += tw;
							o.y -= tw;
						}
						
					}
					else
					{	
						o.x += tw;
					}
					
				}
					
				else if(p.x > o.x && p.y > o.y)
				{
					o.x += tw;
					o.y += tw;
				}
				else if(p.x == o.x && p.y > o.y)
				{
					o.y += tw;
				}
				else if(p.x < o.x && p.y > o.y)
				{
					o.x -= tw;
					o.y += tw;
				}
				else if(p.x < o.x && p.y == o.y)
				{
					o.x -= tw;
				}
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
	
	
	public void reset(){
		objects.clear();
	}
}

