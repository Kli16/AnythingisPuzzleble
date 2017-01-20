import cs1.Keyboard;

public class EngPuzzle {
    int energy;
    public static int puzzle() {
	System.out.println("I see you decided to show up to class, you did the assigned reading, right?");
	System.out.println("1. Of course I have, ma'am");
	System.out.println("2. Well I was on the train and then I spilled coffee all over myself and then I had to go to my Grandparents place to...");
	int didreading = Keyboard.readInt();
	if (didreading == 1) {
	    System.out.println("Well then I'm sure you'll do fine on today's reading quiz!\n");
	    System.out.println("~~~~~~~~~~~~~~~~~~~Reading Quiz for The Hobbit by J.R.R. Tolkien~~~~~~~~~~~~~~~~~~~\n");
	    System.out.println("1. What was in Bilbo's pocket during the riddle battle?\n");
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    String pocket = Keyboard.readString();
	    for(int i = 0; i < pocket.length() - 3; i++) {
		if(pocket.substring(i, i + 4).equals("ring")) {
		    System.out.println("Wow, I'm genuinely impressed. Sorry for ever doubting you, here, take this; just want you're classmates to see what happens when you're honest and hard-working!");
		    System.out.println("You recieved a Key to Success! Mindreader");
		    //Change one of the KTS flags on player to true
		    //Add 5 energy used to the playersh
		    return 2;
		}
	    }
	    System.out.println("You do realize that I can figure out when you're lying, right?");
	    //Add 10 energy used to the player
	    return 3;
	}
	else {
	    System.out.println("Well at least you're honest! Get out of my sight!");
	    return 1;
	    //add 5 energy used to the player
	}
    }
    public int Play(Player p) {
	int result = puzzle();
	if (result == 1) {
	    System.out.println("You couldn't even bluff?");
	    return 10;
	}
	if (result == 2) {
	    System.out.println("You're lucky we didn't quiz you on The Complete Works");
	    return 5;
	}
	if(result == 3) {
	    System.out.println("Honesty is the best policy!");
	    return 5;
	}
    }
}
