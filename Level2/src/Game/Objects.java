package Game;

public class Objects {
	
	public void checkCollision(Player p, GameObject o)
	{
		if(p.collisionBox == o.collisionBox && o instanceof RedTile)
		{
			p.isAlive = false;
			System.out.println("x");
		}

	}
}
