package test;

import people.*;
import location.*;
import items.*;
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Beautiful();
		Person person4 = new Drunk();
		Person person5 = new Minor();
		Person person6 = new Person();
		Person person7 = new Beautiful();
		Person person8 = new Drunk();
		Person person9 = new Drunk();
		Person person10 = new Drunk();
		Person person11 = new Beautiful();
		Person person12 = new Beautiful();
		Person person13 = new Beautiful();
		Person person14 = new Beautiful();
		Person person15 = new Drunk();
		
		Music genre1 = new Music("Jazz");
		Music genre2 = new Music("Country");
		Music genre3 = new Music("EDM");
		
		Alcohol type1 = new Alcohol("Whiskey", "Jack Daniels");
		Alcohol type2 = new Alcohol("Vodka", "Grey Goose");
		Alcohol type3 = new Alcohol("Tequila", "Patron");
		Alcohol type4 = new Alcohol("Rum", "Captain Morgan");
		Alcohol type5 = new Alcohol("Beer", "Fat Tire");
		Alcohol type6 = new Alcohol("Beer", "Coronas");
		Alcohol type7 = new Alcohol("Beer", "Blue Moon");
		Alcohol type8 = new Alcohol("Whiskey", "Crown Royal");
		Alcohol type9 = new Alcohol("Champagne", "Cristal");
		Alcohol type10 = new Alcohol("Vodka", "Svedka");
		Alcohol type11 = new Alcohol("Beer", "Miller Lite");
		Alcohol type12 = new Alcohol("Beer", "Heineken");
		Alcohol type13 = new Alcohol("Beer", "Lagunitas IPA");
		Alcohol type14 = new Alcohol("Vodka", "SKOL");
		
		List<Alcohol> drinkSet1 = new ArrayList<Alcohol>();
		List<Alcohol> drinkSet2 = new ArrayList<Alcohol>();
		List<Alcohol> drinkSet3 = new ArrayList<Alcohol>();
		List<Alcohol> drinkSet4 = new ArrayList<Alcohol>();
		List<Alcohol> drinkSet5 = new ArrayList<Alcohol>();
		
		drinkSet1.add(type1);
		drinkSet1.add(type2);
		drinkSet1.add(type3);
		drinkSet1.add(type4);
		drinkSet1.add(type5);
		drinkSet1.add(type6);
		drinkSet1.add(type7);
		drinkSet1.add(type8);
		drinkSet1.add(type10);
		
		drinkSet2.add(type5);
		drinkSet2.add(type6);
		drinkSet2.add(type7);
		drinkSet2.add(type11);
		drinkSet2.add(type12);
		drinkSet2.add(type13);		
		
		drinkSet3.add(type1);
		drinkSet3.add(type4);
		drinkSet3.add(type11);
		
		drinkSet4.add(type1);
		drinkSet4.add(type10);
		drinkSet4.add(type11);
		drinkSet4.add(type14);
		
		drinkSet5.add(type1);
		drinkSet5.add(type2);
		drinkSet5.add(type3);
		drinkSet5.add(type4);
		drinkSet5.add(type5);
		drinkSet5.add(type6);
		drinkSet5.add(type7);
		drinkSet5.add(type8);
		drinkSet5.add(type9);
		drinkSet5.add(type10);
		drinkSet5.add(type11);
		drinkSet5.add(type12);
		drinkSet5.add(type13);
		drinkSet5.add(type14);
		
		Bar bar1 = new Bar("Puzzles", "Downtown", genre1, drinkSet1);
		Bar bar2 = new Bar("The Boulder", "Downtown", genre2, drinkSet2);
		Frat frat1 = new Frat("ATO", "University of Hello World", genre3, drinkSet3);
		Frat frat2 = new Frat("SAE", "University of Hello World", genre3, drinkSet4);
		Game game1 = new Game("Basketball", "Warriors vs Clippers", "Chase Center");
		Club club1 = new Club("Colors", "Downtown", genre3, drinkSet1);
		Club club2 = new Club("Shots", "Downtown", genre3, drinkSet5);
		
		bar1.addPerson(person1);
		bar1.addPerson(person2);
		bar1.addPerson(person3);
		bar1.addPerson(person8);
		bar1.addPerson(person9);
		
		bar2.addPerson(person1);
		bar2.addPerson(person2);
		bar2.addPerson(person3);
		bar2.addPerson(person8);
		bar2.addPerson(person9);
		
		frat1.addPerson(person4);
		frat1.addPerson(person10);
		frat1.addPerson(person3);
		frat1.addPerson(person6);
		frat1.addPerson(person7);
		
		frat2.addPerson(person15);
		frat2.addPerson(person5);
		frat2.addPerson(person14);
		frat2.addPerson(person6);
		
		club1.addPerson(person11);
		club1.addPerson(person12);
		club1.addPerson(person1);
		club1.addPerson(person4);
		club1.addPerson(person15);
		
		club2.addPerson(person13);
		club2.addPerson(person12);
		club2.addPerson(person7);
		club2.addPerson(person2);
		club2.addPerson(person15);
		
		game1.addPerson(person1);
		game1.addPerson(person12);
		game1.addPerson(person6);
		game1.addPerson(person8);
		game1.addPerson(person14);
				
		ArrayList<Location> stats = new ArrayList<Location>();
		stats.add(bar1);
		stats.add(bar2);
		stats.add(frat1);
		stats.add(frat2);
		stats.add(game1);
		stats.add(club1);
		stats.add(club2);
		
		for(int i=0;i<stats.size();++i) {
			System.out.println("Name: " + stats.get(i).getName() + ", Crowd: " + stats.get(i).crowdCount());
		}
		
		System.out.println("\n" + "Alcohol at "+ club2.getName() + ":" + club2.getAlcohol());
		
		System.out.println("\n" + "Drunk people at "+ frat1.getName() + ":" + frat1.getPeopleType("Drunk"));
		
		System.out.println("\n" + "Success!");
	}

}
