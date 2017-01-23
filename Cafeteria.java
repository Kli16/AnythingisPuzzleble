import cs1.Keyboard;

public class Cafeteria extends Activity{
    public void Play(Player p){
	p.energy -= Game() * 2;
	System.out.println("You feel as though you regained some of the energy you lost throughout the day");
    }
    public int Game() {
	System.out.println("You walk into the cafeteria and have an array of options at your disposal for what to eat, but you've gotta eat fast so you can only choose 3 things to eat, out of these: \n1. Rubbing Alcohol \n2. Pizza \n3. Banana \n4. Heroin \n5. Hot Dog \n6. Celery \n7. Tobacco \n8. Donut \n9. Whole Wheat Bread \nWhich will you choose?");
	System.out.println("Choice 1:");
	int prim = Keyboard.readInt();
	System.out.println("Choice 2:");
	int seg = Keyboard.readInt();
	System.out.println("Choice 3:");
	int ter = Keyboard.readInt();
	return (prim % 3) + (seg % 3) + (ter % 3);
    }
}
