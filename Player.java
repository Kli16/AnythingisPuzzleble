public class Player{

    private int energy, GPA, floor;
    private boolean[] keysToSuccess;
    private String name;
    public static String[][] mapnames; //Has the name of each location that will be displayed to the player
    public static boolean[][] mapstatus; //Has the status of the location, meaning if you have gone there or not
    public static String[][] classname; //has the name of the class tha t contains the code for the corresponding location 
    public static boolean[] escalator; //has the status of each escalator (working == true, not working == false)

    public Player() {
	energy = 0;
	GPA = 0;//The GPA will correspond to the length of the new ship that you get, 0-4 is F-A (E not included) 
	floor = 11;
	keysToSuccess = new boolean[20];
	name = "";
	mapnames = new String[10][3];
	mapstatus = new boolean[10][3];
	classname = new String[10][3];
	
    }

    public Player(String given) {
	this();
	name = given;
    }

    public String[] lookAround() {
	return map[floor];
    }

    
