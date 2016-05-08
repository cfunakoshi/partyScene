package location;

import items.*;
import java.util.*;

public class Frat extends Location {
	private Music music;
	private List<Alcohol> alcohol;
	private Set<Song> songs;

	public Frat(String name, String area, Music music, List<Alcohol> alcohol) {
		super("Frat", name, area);
		this.music = music;
		this.alcohol = alcohol;
	}
	
	public Music getMusic() {
		return music;
	}
	
	public Collection<Alcohol> getAlcohol() {
		return alcohol;
	}
	
	public void addAlcohol(Alcohol drink) {
		if(alcohol.contains(drink)) {
			alcohol.get(alcohol.indexOf(drink)).addAmount(drink.getAmount());
		}
		else {
			alcohol.add(drink);
		}
	}
	
	public void subtractAlcohol(Alcohol drink) {
		if(alcohol.contains(drink)) {
			alcohol.get(alcohol.indexOf(drink)).subtractAmount(drink.getAmount());
		}
		else {
			System.out.println("This club does not have that drink.");
		}
	}

	public Collection<Song> getSongList() {
		return songs;
	}
	
	public void addSong(Song song) {
		songs.add(song);
	}
}
