import cs1.Keyboard;

public class Bathroom5 extends Activity{
    public void Play(Player p){
	boolean win = Game(p);
	if(win) {
	    System.out.println("The magical spell filled your mind with tremendous power and makes you feel invigourated, you can feel your GPA going up as I narrarate this to you");
	    p.GPA  += 2;
	    p.energy += 5;
	}
	else {
	    System.out.println("You leave the bathroom empty handed");
	    p.energy += 5;
	}
    }
    public boolean Game(Player p) {
	System.out.println("You walk up to the 5th floor bathroom but it seems to be locked");
	if (p.GPA == 0) {
	    System.out.println("It's clear that if you want to get throught this door you're going to need to find the key");
	    return false;
	}
	if (p.GPA >= 1) {
	    System.out.println("What do you do?");
	    String action = Keyboard.readString();
	    for(int i = 0; i < action.length() - 2; i++) {
		if (action.substring(i , i + 3).equals("key")) {
		    System.out.println("You walk into the bathroom to a strange sight, a tiny man standing with a harmless look, 'I will give you the knowledge you seek good sir, just answer me one question: What is it that no man ever yet did see, which never was, but always will be?");
		    String riddle = Keyboard.readString();
		    for (int j = 0; j > riddle.length() - 5; j++) {
			if (riddle.substring(j, j + 6).equals("morrow") || (riddle.substring(j, j + 6).equals("future"))) {
				System.out.println("OF COURSE! ah you're a genius, I've been in here since September trying to figure that one out, here, I now bestow upon you my knowledge, and with it I wish you the greatest luck against that man that has binded me here.");
				return true;
			}
		    }
		    System.out.println("No, no, no, thats not right at all! Leave Me! I don't need your gibberish ruining my concentration, LEAVE!");
		    return false;
		}
	    }
	    System.out.println("It seem's like you have no use for this place");
	    return false;
	}
	return false;
    }
}

