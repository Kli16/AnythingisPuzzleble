import cs1.Keyboard;
import java.util.Arrays;
import java.util.ArrayList;

public class Player{

    public int energy = 0;
    public int GPA = 0;
    public int floor = 8;
    public int kts = 0;
    public String name;
    //public ArrayList<ArrayList<String>> map; //Has the name of each location that will be displayed to the player
    ArrayList<ArrayList<String>> map = new ArrayList<ArrayList<String>>();
    ArrayList<String> mapZero = new ArrayList<String>();
    ArrayList<String> mapOne = new ArrayList<String>();
    ArrayList<String> mapTwo = new ArrayList<String>();
    ArrayList<String> mapThree = new ArrayList<String>();
    ArrayList<String> mapFour = new ArrayList<String>();
    ArrayList<String> mapFive = new ArrayList<String>();
    ArrayList<String> mapSix = new ArrayList<String>();
    ArrayList<String> mapSeven = new ArrayList<String>();
    ArrayList<String> mapEight = new ArrayList<String>();
    public boolean[][] mapStatus = {{false},{false},{false},{false,false},{false,false,false,false},{false},{false},{false},{false,false}}; //Has the status of the location, meaning if you have gone there or not
    //public ArrayList<ArrayList<Activity>> location; //has the class of each location
    public boolean[] escalator = {false,false,true,true,true,true,true,true,false}; //has the status of each escalator (working == true, not working == false)
    ArrayList<ArrayList<Activity>> location = new ArrayList<ArrayList<Activity>>();
    ArrayList<Activity> secondFloor = new ArrayList<Activity>();
    ArrayList<Activity> thirdFloor = new ArrayList<Activity>();
    ArrayList<Activity> fourthFloor = new ArrayList<Activity>();
    ArrayList<Activity> fifthFloor = new ArrayList<Activity>();
    ArrayList<Activity> sixthFloor = new ArrayList<Activity>();
    ArrayList<Activity> seventh = new ArrayList<Activity>();
    ArrayList<Activity> eighth = new ArrayList<Activity>();
    ArrayList<Activity> ninth = new ArrayList<Activity>();
    ArrayList<Activity> tenth = new ArrayList<Activity>();

    public Player() {
	int energy = 0;
	int GPA = 0;//The GPA will correspond to the length of the new ship that you get, 0-4 is F-A (E not included) 
	int floor = 8;
	int kts = 0;
	String name = "";
	mapZero.add("Battleship!");
	mapZero.add("2nd floor: You see Mr. Brown sitting near the exit with a battleship board. Defeat him, and escape!");
	mapOne.add("Volleyball");
	mapOne.add("3rd floor: You see an open door into the gym.");
	mapTwo.add("Cards");
	mapTwo.add("4th floor: You see a table with some cards on it");
	mapThree.add("Cafeteria");
	mapThree.add("Bathroom");
	mapThree.add("5th floor: You see the cafeteria is open. So is the bathroom.");
	mapFour.add("Speech and Debate");
	mapFour.add("English");
	mapFour.add("Library");
	mapFour.add("Bathroom");
	mapFour.add("6th floor: There are so many options!");
	mapFive.add("Bathroom");
	mapFive.add("7th floor: All the biology rooms are closed. The bathroom isn't though.");
	mapSix.add("8th floor: You expected more great opportunities. There don't seem to be any.");
	mapSeven.add("Chemistry Lab");
	mapSeven.add("9th floor: You see an open chemistry lab.");
	mapEight.add("Drafting");
	mapEight.add("Art");
	mapEight.add("10th floor: You see drafting and art classrooms open.");
	map.add(mapZero);
	map.add(mapOne);
	map.add(mapTwo);
	map.add(mapThree);
	map.add(mapFour);
	map.add(mapFive);
	map.add(mapSix);
	map.add(mapSeven);
	map.add(mapEight);
	boolean[][] mapStatus = {{false},{false},{false},{false,false},{false,false,false,false},{false},{false},{false},{false,false}};
	boolean[] escalator = {false,false,true,true,true,true,true,true,true};
        
	Activity battleship = new Battleship();
	Activity volleyball = new Volleyball();
	Activity starWars = new StarWars();
	Activity bathroom5 = new Bathroom5();
	Activity cafeteria = new Cafeteria();
	Activity speechAndDebate = new SpeechAndDebate();
	Activity engPuzzle = new EngPuzzle();
	Activity library = new Library();
	Activity bathroom6 = new Bathroom6();
	Activity bathroom7 = new Bathroom7();
	Activity chemLab = new ChemLab();
	Activity drafting = new Drafting();
	Activity artPuzzle = new ArtPuzzle();
	secondFloor.add(battleship);
	thirdFloor.add(volleyball);
	fourthFloor.add(starWars);
	fifthFloor.add(cafeteria);
        fifthFloor.add(bathroom5);
	sixthFloor.add(speechAndDebate);
	sixthFloor.add(engPuzzle);
	sixthFloor.add(library);
	sixthFloor.add(bathroom6);
	seventh.add(bathroom7);
	ninth.add(chemLab);
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
   
    public String lookAround() {
	return map.get(floor).get(map.get(floor).size()-1);
    }

    public void Play(){
        System.out.println("Welcome to Stuyvesant High School, "+name+". Your Helicopter has dropped you off on the roof for school this morning.");
        System.out.println("Difficulty?\n1 = Easy\n2 = Normal\n3 = Hard");
	int difficulty; 
	difficulty = Keyboard.readInt();
	if (difficulty == 1) {
	    System.out.println("Easy");
	}
	else if (difficulty == 2) {
	    int brokenOne;
	    for (int broken = 0; broken < 2; broken++) {
		brokenOne = (int) (Math.random()*6+2);
		escalator[brokenOne] = false;
	    }
	    System.out.println("Normal");
	}
	else {
	    int brokenOne;
	    for (int broken = 0; broken < 5; broken++) {
		brokenOne = (int) (Math.random()*6+2);
		escalator[brokenOne] = false;
	    }
	    System.out.println("Hard");
	}
	while (floor >= 0) {
	    playLevel();
	}
	
	System.out.println("You've completed the game!");
	System.out.println("Final score (the lower the better): "+(energy-kts*Math.log10(kts)));
    }

    public void playLevel() {
	System.out.println(lookAround());
	int numOptions,option;
	while (true) {
	    numOptions = map.get(floor).size()-1;
	    option = 0;
	    while (option < numOptions) {
		if (!mapStatus[floor][option]) {
		    System.out.println(option+": "+map.get(floor).get(option));
		}
		option++;
	    }
	    int stairs = option;
	    if (floor > 0) {
		System.out.println(option+": Take the stairs down one floor");
	    }
	    if (escalator[floor]) {
		option++;
		int escalator = option;
		System.out.println(option+": Take the escalator down two floors");
	    }
	    int input = Keyboard.readInt();
	    if (input < numOptions) {
		location.get(floor).get(input).Play(this);
		mapStatus[floor][input] = true;
		if (floor == 0) {
		    floor--;
		}
	    }
	    else if (input == stairs) {
		floor--;
		return;
	    }
	    else {
		floor -= 2;
		return;
	    }
	}
    }
}
