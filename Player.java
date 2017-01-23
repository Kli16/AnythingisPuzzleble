import cs1.Keyboard;
import java.util.Arrays;
import java.util.ArrayList;

public class Player{

    public  int energy, GPA, floor, kts;
    public  boolean[] keysToSuccess;
    public  String name;
    public static String[][] map; //Has the name of each location that will be displayed to the player
    public static boolean[][] mapstatus; //Has the status of the location, meaning if you have gone there or not
    public static Activity[][] location; //has the class of each location
    public static boolean[] escalator; //has the status of each escalator (working == true, not working == false)
    
    public Player() {
	energy = 0;
	GPA = 0;//The GPA will correspond to the length of the new ship that you get, 0-4 is F-A (E not included) 
	floor = 11;
	keysToSuccess = new boolean[20];
	name = "";
	map = new String[10][3];
	mapstatus = new boolean[10][3];
	
	Activity sUPuzzle = new SUPuzzle();
	Activity battleship = new Battleship();
	Activity volleyball = new Volleyball();
	Activity starWars = new StarWars();
	Activity bathroom5 = new Bathroom5();
	Activity cafeteria = new Cafeteria();
	Activity speechAndDebate = new SpeechAndDebate();
	Activity engPuzzle = new EngPuzzle();
	Activity library = new Library();
	Activity pe = new PE();
	Activity bathroom6 = new Bathroom6();
	Activity bio = new Bio();
	Activity bathroom7 = new Bathroom7();
	Activity physicsLab = new PhysicsLab();
	Activity chemLab = new ChemLab();
	Activity drafting = new Drafting();
	Activity artPuzzle = new ArtPuzzle();
        ArrayList<ArrayList> location = new ArrayList<ArrayList>();
	ArrayList<Activity> secondFloor = new ArrayList<Activity>();
	secondFloor.add(sUPuzzle);
	secondFloor.add(battleship);
	ArrayList<Activity> thirdFloor = new ArrayList<Activity>();
	thirdFloor.add(volleyball);
	ArrayList<Activity> fourthFloor = new ArrayList<Activity>();
	fourthFloor.add(starWars);
	ArrayList<Activity> fifthFloor = new ArrayList<Activity>();
        fifthFloor.add(bathroom5);
	fifthFloor.add(starWars);
	ArrayList<Activity> sixthFloor = new ArrayList<Activity>();
	sixthFloor.add(speechAndDebate);
	sixthFloor.add(engPuzzle);
	sixthFloor.add(library);
	sixthFloor.add(pe);
	sixthFloor.add(bathroom6);
	ArrayList<Activity> seventh = new ArrayList<Activity>();
	seventh.add(bio);
	seventh.add(bathroom7);
	ArrayList<Activity> eighth = new ArrayList<Activity>();
	eighth.add(physicsLab);
	ArrayList<Activity> ninth = new ArrayList<Activity>();
	ninth.add(chemLab);
	ArrayList<Activity> tenth = new ArrayList<Activity>();
	tenth.add(drafting);
	tenth.add(artPuzzle);
        location.add(secondFloor);
	location.add(thirdFloor);
	location.add(fourthFloor);
	location.add(fifthFloor);
	location.add(sixthFloor);
	location.add(seventh);
	location.add(eighth);
	location.add(ninth);
	location.add(tenth);
    }
    
    
    public Player(String given) {
	this();
	name = given;
    }
   
    public String[] lookAround() {
	return map[floor];
    }

    public void Play(){
	Player Kevin = new Player("Kevin");
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
	
        location[1][1].Play(Kevin);
    }
    public static void  main(String[] args){
	Player Kevin = new Player("Kevin");
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
	
        location[1][1].Play(Kevin);
    }
}
