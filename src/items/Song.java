package items;

public class Song extends Music {
	private String name;
	private String artist;
	
	public Song(String genre, String name, String artist) {
		super(genre);
		this.name = name;
		this.artist = artist;
	}
	
	public String getName() {
		return name;
	}
	
	public String getArtist() {
		return artist;
	}
}
