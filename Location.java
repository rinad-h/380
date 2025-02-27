
package edu.ucalgary.oop;
import java.util.ArrayList;

public class Location {
	private String name;
	private String address;
    private ArrayList<DisasterVictim> occupants; 
    private ArrayList<Supply> supplies;

    // Initialization
	public Location (String name, String address) {
		this.setName(name);
		this.setAddress(address);
		this.occupants = new ArrayList<DisasterVictim>();
        this.supplies = new ArrayList<Supply>();
	}
    // Setters
	public void setName(String name) {this.name = name;}
	public void setAddress(String address) {this.address = address;}
    public void setOccupants(ArrayList<DisasterVictim> occupant) {this.occupants = occupant;}
	public void setSupplies(ArrayList<Supply> supply) {this.supplies = supply;}

    // Getters
    public String getName() {return this.name;}
	public String getAddress() {return this.address;}
	public ArrayList<DisasterVictim> getOccupants() {return this.occupants;}
	public ArrayList<Supply> getSupplies() {return this.supplies;}

	// Methods
	public void addOccupant(DisasterVictim occupant) {
		this.occupants.add(occupant);
	}
	public void addSupply(Supply supply) {
        this.supplies.add(supply);
    }
	public void removeOccupant(DisasterVictim occupantToRemove) {
		this.occupants.remove(occupantToRemove);
	}
    public void removeSupply(Supply supplyToRemove) {
		this.supplies.remove(supplyToRemove);
	}
}