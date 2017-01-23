import cs1.Keyboard;
import java.util.Arrays;

public class Volleyball {

/* TEMPLATE FOR USER INPUT
	ret = "The whistle just blew. The score is 10-11 . Get ready. What do you do?\n0 - Stand and Look around.\n1 - Sit down.\n2 - get ready and stare deeply at the server on the other side.\n3 - Cry?";
	System.out.println(ret);
	respI = Keyboard.readInt();
	
	}

	if (respI == 0) {
	    opppts += 5;
	    System.out.println("Bad idea. The ball just hit you in the head. They just won 5 points. The score is now" + points + "-" + opppts + ".");
	}
	if (respI == 1) {
	    points += 3;
	    System.out.println("Nice. You found your zen. You got your team some points. The score is now" + points + "-" + opppts + ".");
	}
	if (respI == 2) {
	    opppts += 3;
	    System.out.println("You stared too hard. They just got 3 points. The score is now" + points + "-" + opppts + ".");
	}
	if (respI == 3) {
	    points += 10;
	    System.out.println("Crying is the best way to release your emotions. You just got 10 straight points. The score is now" + points + "-" + opppts + ".");
	}
*/
    public static int points = 10;
    public static int opppts = 11;
    public static void Play(){
	String ret = "";
	ret = "Uh oh. You've walked into the Gym. Mr. Choubaralian gives you a questioning look. 'What are you doing here?' he asks.";
	System.out.println(ret);

	String resp;
	int respI;
        resp = Keyboard.readString();

	ret = "'That's silly. Why don't you play some Volleyball.'";
	System.out.println(ret);

        resp = Keyboard.readString();

	ret = "'The team is there waiting for you.'";
	System.out.println(ret);
        resp = Keyboard.readString();
	
	ret = "Get on the court?\n0 - Yeah.\n1 - Nah.";
	System.out.println(ret);
	respI = Keyboard.readInt();

	while ((opppts <= 25) && (points <= 25)){

	ret = "The whistle just blew. The score is 10-11 . Get ready. What do you do?\n0 - Stand and Look around.\n1 - Sit down.\n2 - get ready and stare deeply at the server on the other side.\n3 - Cry?";
	System.out.println(ret);
	respI = Keyboard.readInt();

	//QUESTION 1
	if (respI == 0) {
	    opppts += 5;
	    System.out.println("Bad idea. The ball just hit you in the head. They just won 5 points. The score is now " + points + "-" + opppts + ".");
	}
	if (respI == 1) {
	    points += 3;
	    System.out.println("Nice. You found your zen. You got your team some points. The score is now " + points + "-" + opppts + ".");
	}
	if (respI == 2) {
	    opppts += 3;
	    System.out.println("You stared too hard. They just got 3 points. The score is now " + points + "-" + opppts + ".");
	}
	if (respI == 3) {
	    points += 10;
	    System.out.println("Crying is the best way to release your emotions. You just got 10 straight points. The score is now " + points + "-" + opppts + ".");
	}

	//QUESTION 1
	if (respI == 0) {
	    opppts += 5;
	    System.out.println("Bad idea. The ball just hit you in the head. They just won 5 points. The score is now " + points + "-" + opppts + ".");
	}
	if (respI == 1) {
	    points += 3;
	    System.out.println("Nice. You found your zen. You got your team some points. The score is now " + points + "-" + opppts + ".");
	}
	if (respI == 2) {
	    opppts += 3;
	    System.out.println("You stared too hard. They just got 3 points. The score is now " + points + "-" + opppts + ".");
	}
	if (respI == 3) {
	    points += 10;
	    System.out.println("Crying is the best way to release your emotions. You just got 10 straight points. The score is now " + points + "-" + opppts + ".");
	}
	
	//QUESTION 2
	if (respI == 0) {
	    opppts += 5;
	    System.out.println("Bad idea. The ball just hit you in the head. They just won 5 points. The score is now " + points + "-" + opppts + ".");
	}
	if (respI == 1) {
	    points += 3;
	    System.out.println("Nice. You found your zen. You got your team some points. The score is now " + points + "-" + opppts + ".");
	}
	if (respI == 2) {
	    opppts += 3;
	    System.out.println("You stared too hard. They just got 3 points. The score is now " + points + "-" + opppts + ".");
	}
	if (respI == 3) {
	    points += 10;
	    System.out.println("Crying is the best way to release your emotions. You just got 10 straight points. The score is now " + points + "-" + opppts + ".");
	}
	
	points = 100;
	System.out.println("Welp. Guess you lost");
	}

	if (points != 100){
	    System.out.println("YOU WON!! YOU GOT A KEY TO SUCCESS!!");
	}
    
    }

    public static void main (String[] args){
	Play();
    }
}
