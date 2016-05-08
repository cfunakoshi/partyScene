package location;

import people.*;
import java.util.*;

public class Location {
	private String place;
	private String name;
	private String area;
	private ArrayList<Person> people = new ArrayList<Person>();
	
	public Location(String place, String name, String area) {
		this.place = place;
		this.name = name;
		this.area = area;
	}
	
	public String getPlace() {
		return place;
	}
	
	public String getName() {
		return name;
	}
	
	public String getArea() {
		return area;
	}
	
	public void addPerson(Person person) {
		for(int i=0;i<people.size();++i) {
			if(people.get(i).hashCode() == person.hashCode()) {
				return;
			}
		}
		people.add(person);
		
	}
	
	public int crowdCount() {
		return people.size();
	}
	
	public int getPeopleType(String type) {
		int count = 0;
		for(int i=0;i<people.size();++i) {
			String temp = people.get(i).getType();
			if(temp == type) {
				count += 1;
			}
		}		
		return count;
	}
}
