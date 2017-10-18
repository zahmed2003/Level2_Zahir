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
					
					//insert death checker
					
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
	
	public void reset(){
		objects.clear();
	}
}

