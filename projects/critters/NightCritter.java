/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;

import java.util.ArrayList;

public class NightCritter extends Critter
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
	
	public ArrayList<Location> getMoveLocations() {
		Location loc = getLocation();
		ArrayList<Location> locs = new ArrayList<Location>();
		
		Location loc1 = new Location(loc.getRow()+1, loc.getCol()+2);
		Location loc2 = new Location(loc.getRow()+2, loc.getCol()+1);
		Location loc3 = new Location(loc.getRow()-1, loc.getCol()+2);
		Location loc4 = new Location(loc.getRow()+2, loc.getCol()-1);
		Location loc5 = new Location(loc.getRow()+1, loc.getCol()-2);
		Location loc6 = new Location(loc.getRow()-2, loc.getCol()+1);
		Location loc7 = new Location(loc.getRow()-1, loc.getCol()-2);
		Location loc8 = new Location(loc.getRow()-2, loc.getCol()-1);
		
		if (availableSquare(loc1)) {
			locs.add(loc1);
		}
		if (availableSquare(loc2)) {
			locs.add(loc2);
		}
		if (availableSquare(loc3)) {
			locs.add(loc3);
		}
		if (availableSquare(loc4)) {
			locs.add(loc4);
		}
		if (availableSquare(loc5)) {
			locs.add(loc5);
		}
		if (availableSquare(loc6)) {
			locs.add(loc6);
		}
		if (availableSquare(loc7)) {
			locs.add(loc7);
		}
		if (availableSquare(loc8)) {
			locs.add(loc8);
		}
		
		return locs;
	}
}