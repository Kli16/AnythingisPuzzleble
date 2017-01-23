import cs1.Keyboard;
import java.util.Arrays;

public class Volleyball extends Activity {

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
    public static void Play(Player p){
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

	if((opppts <= 25) && (points <= 25)){

	//QUESTION 1
	ret = "The whistle just blew. The score is 10-11 . Get ready. What do you do?\n0 - Stand and Look around.\n1 - Sit down.\n2 - get ready and stare deeply at the server on the other side.\n3 - Cry?";
	System.out.println(ret);
	respI = Keyboard.readInt();

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
	}
	
	if((opppts <= 25) && (points <= 25)){

	//QUESTION 2
	ret = "The ball is coming to you again.\n0 - continue crying.\n1 - set the ball!\n2 - do some jumping jacks.\n3 - Cheer on teammates.";
	System.out.println(ret);
	respI = Keyboard.readInt();
	
	if (respI == 0) {
	    opppts += 7;
	    System.out.println("Crying is for the weak. They just won 7 points. The score is now " + points + "-" + opppts + ".");
	}
	if (respI == 1) {
	    points += 6;
	    System.out.println("Hmm. Ok. Seems legit. You got your team some points. The score is now " + points + "-" + opppts + ".");
	}
	if (respI == 2) {
	    opppts += 3;
	    System.out.println("You tripped and twisted your ankle. Mr. Choubaralian shakes his head. They just got 3 points. The score is now " + points + "-" + opppts + ".");
	}
	if (respI == 3) {
	    points += 10;
	    System.out.println("There is no I in TEAM!! You just got 10 straight points. The score is now " + points + "-" + opppts + ".");
	}
	}

	if((opppts <= 25) && (points <= 25)){

	//QUESTION 2
	ret = "It's time to serve.\n0 - eat the ball\n1 - serve the ball\n2 - read a book.\n3 - Give it to someone else.";
	System.out.println(ret);
	respI = Keyboard.readInt();
	
	if (respI == 0) {
	    points += 5;
	    System.out.println("Always a good idea. Stay hungry. You just won 5 points. The score is now " + points + "-" + opppts + ".");
	}
	if (respI == 1) {
	    opppts += 7;
	    System.out.println("That's ridiculous. The score is now " + points + "-" + opppts + ".");
	}
	if (respI == 2) {
	    opppts += 5;
	    System.out.println("Nerd. They just got 5 points. The score is now " + points + "-" + opppts + ".");
	}
	if (respI == 3) {
	    points += 9;
	    System.out.println("Always blame it on other people. You just got 9 straight points. The score is now " + points + "-" + opppts + ".");
	}
	}
	if((opppts < 25) && (points < 25)){
	    System.out.println("Welp. Coach took you out of the game. Sorry.");
	}
	if (opppts >= 25){
	    System.out.println("Hah. you lost.");
	}
	else {
	    System.out.println("YOU WON!! YOU GOT A KEY TO SUCCESS!!");
	    p.kts += 1;
	}
	p.energy += 5;
    
    }

    public static void main (String[] args){
	Play();
    }
}
