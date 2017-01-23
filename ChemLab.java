import cs1.Keyboard;
public class ChemLab extends Activity{

    int bucket1 = 0;
    int bucket2 = 0;
    String[] beakerDesc = {"is colorless and odorless", "is colorless and odorless", "smells like vinegar"};
    String[] beakerPHColor = {"purple", "blue", "red"};
    int[] beakerPH = {0,-1,1};
    boolean[] beakers = {true, true, true};
    boolean litmusPaper = false;

    public ChemLab() {
	int bucket1 = 0;
	int bucket2 = 0;
	String[] beakerDesc = {"is colorless and odorless", "is colorless and odorless", "smells like vinegar"};
	String[] beakerPHColor = {"purple", "blue", "red"};
	int[] beakerPH = {0,-1,1};
	boolean[] beakers = {true, true, true};
	boolean litmusPaper = false;
    }

    public void Play(Player name){
	boolean win = Game();
	if (win) {
	    System.out.println("Good Job! You feel that good citizenship is its own reward.");
	    System.out.println("KTS gained");
	    name.kts += 1;
	    name.energy += 5;
	}
	else {
	    System.out.println("The lab specialist bursts in through the door. Oh no, it looks like you might have to spend a lot of energy getting through this talking to.");
	    name.energy += 10;
	}
    }

    public boolean Game() {
	int input1;
	String input2;
	int beakerNum = 0;
	boolean look = true;
	System.out.println("welcome to the chemistry lab! You see a note on the door asking for you to clean some beakers.");
	while (beakers[2] != false) {
	    System.out.println("\n\nOptions:");
	    System.out.println("1: Pick up a beaker (" + (3-beakerNum) + " left)");
	    if (look) {
		System.out.println("2: Look around");
	    }
	    input1 = Keyboard.readInt();
	    if (input1 == 2) {
		look = false;
		System.out.println("There is a sink, two buckets, and three beakers near you. You see a lab manual. Pick it up? (yes/no)");
		input2 = Keyboard.readString().toLowerCase();
		if (input2.equals("yes")) {
		    System.out.println("You see a note and some strips of paper attached to the cover. It says: Use this litmus paper to test the pH of the solutions. Do not mix the acids and bases!");
		    System.out.println("Acid: Red");
		    System.out.println("Neutral: Purple");
		    System.out.println("Base: Blue");
		    litmusPaper = true;
		}
		else {
		    System.out.println("You don't need a manual. You're, like, a smart person. You throw it away.");
		}
	    }
	    else if (input1 == 1) {
		if (!beakerAction(beakerNum)) {
		    return false;
		}
		beakers[beakerNum] = false;
		beakerNum++;
	    }
	    else {
		System.out.println("Invalid input");
	    }
	}
	return true;
    }

    //beakerAction returns the success of the beaker action
    public boolean beakerAction (int beakerNumber) {
	int input;
	boolean done = false;
	boolean paper = litmusPaper || false;
	while (!done) {
	    System.out.println("What do you do with this beaker?");
	    System.out.println("1: Pour it into the sink");
	    System.out.println("2: Pour it into bucket #1");
	    System.out.println("3: Pour it into bucket #2");
	    if (paper) {
		System.out.println("4: Test its contents with litmus paper");
	    }
	    input = Keyboard.readInt();
	    if (input == 4) {
		System.out.println("The litmus paper turns "+beakerPHColor[beakerNumber]+".");
		paper = false;
	    }
	    else if (input == 1) {
		if (beakerNumber == 1) {
		    return false;
		}
		return true;
	    }
	    else if (input == 2) {
		if (bucket1*beakerPH[beakerNumber] < 0) {
		    return false;
		}
		bucket1 += beakerPH[beakerNumber];
		return true;
	    }
	    else if (input == 3) {
		if (bucket2*beakerPH[beakerNumber] < 0) {
		    return false;
		}
		bucket2 += beakerPH[beakerNumber];
		return true;
	    }
	    else {
		System.out.println("Invalid input");
	    }
	}
	return true;
    }


}
