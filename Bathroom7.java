import cs1.Keyboard;

public class Bathroom7 extends Activity{
    public void Play(Player p){
	boolean win = Game();
	if(win) {
	    System.out.println("You find a strange note that seems to have been posted on the front of the door, it reads '5th floor bathroom closed until key is found, if found please go to 206, DO NOT OPEN THE DOOR ON YOUR OWN'.");
	    p.GPA += 1;
	    p.energy += 5;
	}
	else {
	    System.out.println("You leave the bathroom empty handed, maybe for the best");
	    p.energy += 5;
	}
    }
    public boolean Game() {
	System.out.println("You walk into the 7th floor bathroom and you find it completely ransacked, look around?(y or n)");
	String look = Keyboard.readString();
	if (look.equals("y")) {
	    System.out.println("You look around and see the mirror smashed to bits, the trash can toppled down, and a piece of paper on the ground, what would you like to do?");
	    System.out.println("what do you want to observe?");
	    String thing = Keyboard.readString();
	    for(int i = 0; i < thing.length() - 4; i++) {
		if (thing.substring(i, i + 5).equals("paper")) {
		    return true;
		}
	    }
	    System.out.println("You find nothing of particular importance");
	    return false;
	}
	return false;
    }
    
}
