package adventuregame.model;

import java.util.ArrayList;

public class World {
	private ArrayList<Location> locations;

	public World() {
		this.locations = new ArrayList<Location>();
	}

	/**
	 * Returns a list of locations in the world
	 * 
	 * @return a ArrayList of Locations
	 */
	public ArrayList<Location> getLocations() {
		return this.locations;
	}

	/**
	 * Adds a location to the World
	 * 
	 * @precondition !name.isEmpty() && name != null
	 * @postcondition getLocations().size += 1 &&
	 *                getLocations().contains(Location(name, isLocked))
	 * @param name     the name of the location
	 * @param isLocked if the location is locked
	 * @return if added to list of locations
	 */
	public boolean addLocation(String name, boolean isLocked) {
		if (name == null) {
			throw new IllegalArgumentException("the location name cannot be null");
		}
		if (name.isEmpty()) {
			throw new IllegalArgumentException("the location name cannot be empty");
		}
		return this.locations.add(new Location(name, isLocked));
	}
}
