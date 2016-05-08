package location;

public class Game extends Location {
	private String type;
	
	public Game(String type, String name, String area) {
		super("Game", name, area);
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
