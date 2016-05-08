package items;

import location.*;

public class Alcohol {
	private String type;
	private String name;
	private int amount;
	private Location location;
	
	public Alcohol(String type, String name) {
		this.type = type;
		this.name = name;
		this.amount = 100;
	}
	
	public String toString() {
		return type + ", " + name;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void addAmount(int add) {
		amount = amount + add;
	}
	
	public void subtractAmount(int loss) {
		amount = amount - loss;
	}
	
	public String getLocation() {
		return location.getPlace();
	}
}
