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
				
				
				if(o1.colBox.intersects(o2.colBox)){
					o1.setColliding(true);
					o1.setCollisionObject(o2);
					
					o2.setColliding(true);
					o2.setCollisionObject(o1);
					
					if((o1 instanceof RedTile || o1 instanceof RMTile) && o2 instanceof Player)
					{
						p.isAlive = false;
					}
					
					if(o1 instanceof RMTile && o2 instanceof SolidTile) {
						o1.colliding = true;
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
	
	public void moveTile(int tw) {
		for (int i = 0; i < objects.size(); i++) {
				GameObject o = objects.get(i);
				if(o instanceof RMTile)
				{
					
					if(o.direction == -1 && (o.colliding == true || o.y >= GameRunner.height - o.height))
					{
						o.direction = 1;
						o.y -= tw;
						o.colliding = false;
					}
					
					else if(o.direction == 1 && (o.colliding == true || o.y <= 0))
					{
						o.direction = -1;
						o.y+=tw;
						o.colliding = false;
					}
					else if(o.direction == 1 && o.colliding == false)
					{
						o.y -= tw;
					}
					else if(o.direction == -1 && o.colliding == false)
					{
						o.y+=tw;
					}
				}
		}
	}
	
	
	public void reset(){
		objects.clear();
	}
}

