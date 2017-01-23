import cs1.Keyboard;
import java.util.Arrays;
import java.util.ArrayList;

public class Player{

    public int energy, GPA, floor, kts;
    public String name;
    public String[][] map; //Has the name of each location that will be displayed to the player
    public boolean[][] mapstatus; //Has the status of the location, meaning if you have gone there or not
    public ArrayList<Activity> location; //has the class of each location
    public boolean[] escalator; //has the status of each escalator (working == true, not working == false)

    public Player() {
	int energy = 0;
	int GPA = 0;//The GPA will correspond to the length of the new ship that you get, 0-4 is F-A (E not included) 
	int floor = 8;
	int kts = 0;
	String name = "";
	String[][] map = new String[9][];
	map[0] = new String[2];
	map[0][0] = "Battleship!";
	map[0][1] = "2nd floor: You see Mr. Brown sitting near the exit with a battleship board. Defeat him, and escape!";
	map[1][0] = "Volleyball";
	map[1][1] = "3rd floor: You see an open door into the gym.";
	map[2][0] = "Cards";
	map[2][1] = "4th floor: You see a table with some cards on it";
	map[3][0] = "Cafeteria";
	map[3][1] = "Bathroom";
	map[3][2] = "5th floor: You see the cafeteria is open. So is the bathroom.";
	map[4][0] = "Speech and Debate";
	map[4][1] = "English";
	map[4][2] = "Library";
	map[4][3] = "Bathroom";
	map[4][4] = "6th floor: There are so many options!";
	map[5][0] = "Bathroom";
	map[5][1] = "7th floor: All the biology rooms are closed. The bathroom isn't though.";
	map[6][0] = "8th floor: You expected more great opportunities. There don't seem to be any.";
	map[7][0] = "Chemistry Lab";
	map[7][1] = "9th floor: You see an open chemistry lab.";
	map[8][0] = "Drafting";
	map[8][1] = "Art";
	map[8][2] = "10th floor: You see drafting and art classrooms open.";
	boolean[][] mapstatus = {{false},{false},{false},{false,false},{false,false,false,false},{false},{false},{false},{false,false}};
	boolean[] escalator = {true,true,true,true,true,true,true,true,true};
        
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
        ArrayList<ArrayList> location = new ArrayList<ArrayList>();
	ArrayList<Activity> secondFloor = new ArrayList<Activity>();
	secondFloor.add(battleship);
	ArrayList<Activity> thirdFloor = new ArrayList<Activity>();
	thirdFloor.add(volleyball);
	ArrayList<Activity> fourthFloor = new ArrayList<Activity>();
	fourthFloor.add(starWars);
	ArrayList<Activity> fifthFloor = new ArrayList<Activity>();
	fifthFloor.add(cafeteria);
        fifthFloor.add(bathroom5);
	ArrayList<Activity> sixthFloor = new ArrayList<Activity>();
	sixthFloor.add(speechAndDebate);
	sixthFloor.add(engPuzzle);
	sixthFloor.add(library);
	sixthFloor.add(bathroom6);
	ArrayList<Activity> seventh = new ArrayList<Activity>();
	seventh.add(bathroom7);
	ArrayList<Activity> eighth = new ArrayList<Activity>();
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
   
    public String lookAround() {
	return map[floor][map[floor].length-1];
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
		brokenOne = (int) (Math.random()*9);
		escalator[brokenOne] = false;
	    }
	    System.out.println("Normal");
	}
	else {
	    int brokenOne;
	    for (int broken = 0; broken < 5; broken++) {
		brokenOne = (int) (Math.random()*9);
		escalator[brokenOne] = false;
	    }
	    System.out.println("Hard");
	}


    }

    public playLevel() {
	System.out.println(lookAround);
	int numOptions = map[floor].length-1;
	for (int option = 0; option < map[floor].length-1; option++) {
	    

}
