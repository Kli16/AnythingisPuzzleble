import cs1.Keyboard;

public class Drafting extends Activity{
    public void Play(Player p){
	System.out.println("You walk into Mr.Flothenbergs room knowing that you haven't done your drafting project, you need to find some way to get on his good side");
	boolean win = Game();
	if (win) {
	    System.out.println("Good Job!, now he'll let you have an extension for sure!");
	    System.out.println("KTS gained");
	    p.kts += 1;
	    p.energy += 5;
	}
	else {
	    System.out.println("Well, looks like your going to have to sink a lot of energy to redo that drafting project...");
	    p.energy += 25;
	}
    }
    public boolean Game() {
	System.out.println("Mr Flothenberg: Why're you late?");
	String irrelevant = Keyboard.readString();
	System.out.println("Mr Flothenberg: Well thats not gonna cut it, you're gonna need to give me a 40 on the way out if you know whats good for ya");
	System.out.println("Laugh? Yes or No");
	String laugh = Keyboard.readString();
	if (laugh.equals("yes")) {
	    System.out.println("Mr.Flothenberg: You got that, I can't believe it! Scott give him a double plus");
	}
	else {
	    System.out.println("Mr.Flothenberg: That bad, huh?");
	}
	System.out.println("Nows the time, give him a reason for why you need an extension");
	String excuse = Keyboard.readString();
	if(laugh.equals("yes")){
	    System.out.println("Mr.Flothenberg: Yeah that's fine, just bring it to me next week");
	    return true;
	}
	else {
	    System.out.println("well I can't just give you an extension, how is that fair to everyone else?");
	    return false;
	}
    }
		
}
