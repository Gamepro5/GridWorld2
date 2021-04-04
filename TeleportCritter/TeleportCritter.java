import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class TeleportCritter extends Critter
{  
	
	public boolean availableSquare(Location pos) {
		if (getGrid().isValid(pos)) {
			Actor a = getGrid().get(pos);
			if (a == null || a instanceof Flower) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public ArrayList<Location> getMoveLocations()
	{
		ArrayList<Location> locs = new ArrayList<Location>();
		
		int ROWS = getGrid().getNumRows();
		int COLS = getGrid().getNumCols();

		for (int x=0;x<COLS;x++) {
			for (int y=0;y<ROWS;y++) {
				Location temp = new Location(x,y);
				if (availableSquare(temp)) {
					locs.add(temp);
				}
				temp = null;
				// take me away, JVM garbage collector!
			}
		}
		return locs;



}
}
