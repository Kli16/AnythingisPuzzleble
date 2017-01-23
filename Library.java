import cs1.Keyboard;

public class Library extends Activity{

    int tries;
    
    public void Play(Player p){
	boolean win = Game();
	if(win) {
	    System.out.println("You find the Hobbit in place 3101 of all of the books, a certain line catches your eye, 'What have I got in my pocket?' which was said by Bilbo to during his riddle battle with Gollum, having the one ring in his pocket");
	    
	}
	else {
	    System.out.println("You leave the library Hobbitless and a little weaker than when you came in");
	}
	p.energy += tries;
    }
    public boolean Game() {
	System.out.println("You find yourself in the renouned Stuyvesant library. You remember that you have assigned reading for english class for The Hobbit by J.R.R Tolkien, you need to find a copy of it in the library but you can't waste too much energy: try to find it with as little tries as possible, all of the books are in order of last name and there are 10000 books/n");
	while (0 == 0) {
	System.out.println("Do you want to try to find the book?");
	System.out.println("yes or no?");
	String ans = Keyboard.readString();
	if (ans.equals("yes")); {
		tries++;
		System.out.println("Where do you think it is? Pick something from 0 to 10000");
		int num = Keyboard.readInt();
		if(num > 3101) {
		    System.out.println("too high!");
		}
		if (num < 3101) {
		    System.out.println("too low!");
		}
		if (num == 3101) {
		    System.out.println("Good Job! you got it!");
		    //energy -= tries
		    return true;
		}
	    }
	     {
		//energy -= tries
		return false;
	    }
	}

    }
    public static void main(String[] args) {
    }
}
