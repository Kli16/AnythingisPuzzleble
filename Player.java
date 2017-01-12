public class Player{

    private int energy, GPA, floor;
    private boolean[] keysToSuccess;
    private String name;
    public final Location[][] map;

    public Player() {
	energy = 0;
	GPA = 60;
	floor = 11;
	keysToSuccess = new boolean[20];
	name = "";
	map = new Location[10][5];
    }

    public Player(String given) {
	this();
	name = given;
    }

    public String[] lookAround() {
	return map[floor];
    }

    
