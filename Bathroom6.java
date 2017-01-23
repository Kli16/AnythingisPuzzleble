public class Bathroom6 extends Activity{
    public void Play(Player p){
	boolean win = Game();
	if(win) {
	    if (p.GPA == 1) {
		System.out.println("You find a key on the ground and remember teh message that was left in the 7th floor bathroom ~ '5th floor bathroom closed until key is found, if found please go to 206, DO NOT OPEN THE DOOR ON YOUR OWN'");
	    }
	    else {
		System.out.println("You find a key on the ground, unsure what you might need it for you keep it on you for safekeeping");
	    }
	    p.GPA += 1;
	}
	else {
	    System.out.println("You leave the 6th floor bathroom empty-handed");
	}
	p.energy += 5;
    }
    public boolean Game() {
	System.out.println("You find yourself in a pristine bathroom, not a scratch on it, Would you like to look around?(Yes or No)");
	String look = Keyboard.ReadString();
	if (look.equals("Yes")) {
		return true;
	    }
	    else {
		System.out.println("Well there seems to be nothing left to do");
		return false;
	    }
    }
}

//CHECK IF GPA IS 1, IF SO REMEMBERS THAT THIS IS THE KEY TO BATHROOM5
