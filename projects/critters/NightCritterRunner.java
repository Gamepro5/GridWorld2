import java.awt.Color;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;


public class NightCritterRunner {
	 public static void main(String[] args)
	    {
	        ActorWorld world = new ActorWorld();
	        NightCritter alice = new NightCritter();
	        alice.setColor(Color.ORANGE);
	        world.add(new Location(7, 0), alice);
	        world.show();
	    }
}
