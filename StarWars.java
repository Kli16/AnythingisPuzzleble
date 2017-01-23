public class StarWars extends Activity{


    public void Play(Player p){
	System.out.println("You see a deck of cards from the Star Wars CCG (Customizable Card Game). Unfortunately, you don't know how to play.");
	System.out.println("You do the next best thing. You solve the problem taped above the table.\n");
	System.out.println("Han Solo is trying to evade bounty hunters and get to the entrance of Jabba the Hutt's palace. He starts at one vertex of a regular dodecahedron (twelve pentagonal faces, twenty vertices, 30 edges). Han Solo must only follow the edges of this polyhedra on his route. Knowing that the enemy's gate is down, in how many ways can he get to his destination as quickly as possible? (enter -1 to give up)");
	int answer = Keyboard.readInt();
	if (answer == 10) {
	    System.out.println("Good job! You are awarded with 1 out of 1254 from the LEGO build of the Millenium Falcon");
	    p.energy += 5;
	    p.kts += 1;
	    return;
	}
	if (answer == -1) {
	    System.out.println("You think to yourself 'No bounty hunter could catch him!' and walk away");
	    p.energy += 2;
	    return;
	}
	else {
	    System.out.println("Good try. Unfortunately, because of your answer, Han Solo was captured.");
	    p.energy += 5;
	    return;
	}
	
    }
}
