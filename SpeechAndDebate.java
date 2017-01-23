import cs1.Keyboard;
import java.util.Arrays;
public class SpeechAndDebate extends Activity {
    /* TEMPLATE FOR USER INPUT
	ret = "\n0 - \n1 - \n2 - \n3 - ";
	System.out.println(ret);
	respI = Keyboard.readInt();
	
	}

	if (respI == 0) {
	    System.out.println("");
	}
	if (respI == 1) {
	    System.out.println("");
	}
	if (respI == 2) {
	    System.out.println("");
	}
	if (respI == 3) {
	    System.out.println("");
	}
*/
    public int points = 0;
    public void Play(Player p){
	String ret = "";
	ret = "You just walked into Speech and Debate. It's time to answer some questions, to see if you truly are the MASTER DEBATER. Get ready.";
	System.out.println(ret);

	String resp;
	int respI;
        resp = Keyboard.readString();

	//QUESTION 1
	ret = "Which of these is a postmodern philosopher?\n0 - Cheesburgers.\n1 - George Washington.\n2 - Gilles Deleuze\n3 - David Hume.";
	System.out.println(ret);
	respI = Keyboard.readInt();

	if (respI == 0) {
	    System.out.println("Nah. Next question.");
	}
	if (respI == 1) {
	    System.out.println("Nah. Next question.");
	}
	if (respI == 2) {
	    points += 1;
	    System.out.println("Ook. fine. You are doing ok.");
	}
	if (respI == 3) {
	    System.out.println("Nah. Next question.");
	}
	
	//QUESTION 2
	ret = "Trolley Problem Time. There a track and a train approaching a man tied down to the track. You can shift the train off the track and 100 people will die, or you can let it keep going and it will kill the man.\n0 - KILL HIM!!\n1 - Eh, who cares.\n2 - No!! Save him!\n3 - who is this man?";
	System.out.println(ret);
	respI = Keyboard.readInt();
	
	if (respI == 0) {
	    System.out.println("Trick Question. Godzilla comes down and kills everyone.");
	}
	if (respI == 1) {
	    System.out.println("Trick Question. Godzilla comes down and kills everyone.");
	}
	if (respI == 2) {
	    points += 1;
	    System.out.println("Trick Question. Godzilla comes down and kills everyone.");
	}
	if (respI == 3) {
	    System.out.println("Trick Question. Godzilla comes down and kills everyone.");
	}

	//QUESTION 3
	ret = "What is the best method to fight capitalism?\n0 - SEIZE THE MEANS OF PRODUCTION!\n1 - Go to the bank.\n2 - Buy some more Starbucks.\n3 - Pretend it never happened.";
	System.out.println(ret);
	respI = Keyboard.readInt();
	
	if (respI == 0) {
	    points += 1;
	    System.out.println("Always a good idea.");
	}
	if (respI == 1) {
	    System.out.println("YOU CAPITALIST PIG!");
	}
	if (respI == 2) {
	    points += 1;
	    System.out.println("Well, can't go wrong there.");
	}
	if (respI == 3) {
	    System.out.println("Terrible, terrible, terrible.");
	}

	//QUESTION 4
	ret = "How do you feel about animals?\n0 - Eat them all.\n1 - Veganism is a lifestyle.\n2 - I smell bacon!\n3 - Cats?";
	System.out.println(ret);
	respI = Keyboard.readInt();
	
	if (respI == 0) {
	    System.out.println("How would you feel if your dog said that to you?");
	}
	if (respI == 1) {
	    System.out.println("YOLO.");
	}
	if (respI == 2) {
	    points += 1;
	    System.out.println("I smell it too.");
	}
	if (respI == 3) {
	    points += 1;
	    System.out.println("Yes, yes cats.");
	}

	if (points >= 3) {
	    System.out.println("You passed the test!!! A NEW KEY TO SUCCESS!!");
	    p.kts += 1;
	}
	else {
	    System.out.println("agh. You got a " + points + " out of 4. Better luck next time. Maybe you just need more practice.");
	}
	p.energy += 5;
    }

}
