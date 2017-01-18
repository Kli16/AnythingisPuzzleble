public class Player{

    private int energy, GPA, floor;
    private boolean[] keysToSuccess;
    private String name;
    public static String[][] mapnames; //Has the name of each location that will be displayed to the player
    public static boolean[][] mapstatus; //Has the status of the location, meaning if you have gone there or not
    public static Activity[][] location; //has the class of each location
    public static boolean[] escalator; //has the status of each escalator (working == true, not working == false)

    public Player() {
	energy = 0;
	GPA = 0;//The GPA will correspond to the length of the new ship that you get, 0-4 is F-A (E not included) 
	floor = 11;
	keysToSuccess = new boolean[20];
	name = "";
	mapnames = new String[10][3];
	mapstatus = new boolean[10][3];
	location = new Activity[10][3];
	location = [[], [SUPuzzle, Battleship], [Volleyball], [Cocoros], [Bathroom5, Cafeteria,], [SpeechAndDebate, EngPuzzle, Library, PE], [Bathroom6, Bio], [Bathroom7, PhysicsLab], [ChemLab], [Drafting, ArtPuzzle]];
    }

    public Player(String given) {
	this();
	name = given;
    }

    public String[] lookAround() {
	return map[floor];
    }

    public void Play(){
	String ret = "";
	ret = "Welcome to Stuyvesant High School. Your Helicopter has dropped you off on the roof for school this morning.";
	ret += "\nDifficulty?\n1 = Easy\n2 = Normal\n3 = Hard";
	System.out.println(ret);

	int difficulty; 
	difficulty = Keyboard.readInt();
	if (difficulty == 1) {
	    System.out.println("Easy");
	}
	else if (difficulty == 2) {
	    System.out.println("Normal");
	}
	else {
	    System.out.println("Hard");
	}

	ret = "You have reached the BOSS LEVEL.";
	System.out.println(ret);
        location[1][1].Play();
    }
}
