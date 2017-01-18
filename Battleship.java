import cs1.Keyboard;
import java.util.Arrays;

public class Battleship {
    static boolean[][] enemymap = new boolean[10][10];
    static boolean[][] hitmap = new boolean[10][10];
    static boolean[][] map = new boolean[10][10];
    static boolean[][] enemyhitmap = new boolean [10][10];
    static int extraship;
    static String[] enemypatrol, patrol = new String[2];
    static String[] enemydestroyer,destroyer,submarine,enemysubmarine = new String[3];
    static String[] enemybattleship,battleship = new String[4];
    static String[] enemycarrier,carrier = new String[5];
    

    public static void Startup () {
	Place(2);
	Place(3);
	Place(3);
	Place(4);
	Place(5);
	Place(extraship);

	
	//Make the comp randomly choose positions on their map
	boolean orient;
	int x,y;
       	orient = 1 == ((int) (2 * Math.random()));
       	x = (int) (8 * Math.random());
	y = (int) (8 * Math.random());
	EnemyPlace(orient, x, y, 2);
       	orient = 1 == ((int) (2 * Math.random()));
	x = (int) (7 * Math.random());
	y = (int) (7 * Math.random());
	EnemyPlace(orient, x, y, 3);
       	orient = 1 == ((int) (2 * Math.random()));
	x = (int) (7 * Math.random());
	y = (int) (7 * Math.random());
	EnemyPlace(orient, x, y, 3);
       	orient = 1 == ((int) (2 * Math.random()));
	x = (int) (6 * Math.random());
	y = (int) (6 * Math.random());
	EnemyPlace(orient, x, y, 4);
       	orient = 1 == ((int) (2 * Math.random()));
	x = (int) (5 * Math.random());
	y = (int) (5 * Math.random());
	EnemyPlace(orient, x, y, 5);

	//Later make an if statement so that it chooses x or y to limit
}
    public static void Place(int size) {
	System.out.println("Placing the ship with size "+size);
	System.out.println("Direction? (Horizontal or Vertical): ");
	boolean orient;
	orient = "horizontal".equals(Keyboard.readString().toLowerCase());
	System.out.println("Bottom-most coordinate? (1-10): ");
	int x = Keyboard.readInt();
	System.out.println("Leftmost coordinate? (1-10): ");
	int y = Keyboard.readInt();
	if (orient) {
	    for(int i = 0; i < size; i++) {
		map[x - 1][y - 1 + i] = true;
		//figure out how you want to track if a ship is sunk
	    }
	}
	else {
	    for(int i = 0; i < size; i++) {
		map[x - 1 + i][y - 1] = true;
		//^^look up^^
	    }
	}
	userscreen();
    }
    public static void EnemyPlace(boolean orient,int x,int y, int size) {
	if (orient) {
	    for(int i = 0; i < size; i++) {
		enemymap[x][y+ i] = true;
		//figure out how you want to track if a ship is sunk
	    }
	}
	else {
	    for(int i = 0; i < size; i++) {
		enemymap[x + i][y] = true;
		//^^look up^^
	    }
	}
    }
    public static void hit() {
	System.out.println("Where do you want to shoot?");
	int x;
	int y;
        while(0 == 0) {
	    x = Keyboard.readInt();
	    y = Keyboard.readInt();
	    if(x > 0 && x < 11 && y > 0 && y < 11) {
		if(!(hitmap[x - 1][y - 1])) {
		    hitmap[x - 1][y - 1] = true;
		    if (enemymap[x - 1][y - 1]) {
			System.out.println("HIT!!!");
			enemymap[x - 1][y - 1] = false;
		    }
		    else {
			System.out.println("Miss...");
			break;
		    }
		}
		else {
		System.out.println("Stop beating a dead horse. It's time to move on.");
		}
	    }
	    else{
		System.out.println("It's a 10x10 grid. You fell off the universe. Try Again");
	    }
	    }
    }
    public static void enemyhit() {
	int x = (int)(Math.random() * 10);
	int y = (int)(Math.random() * 10);
	if(map[x][y]) {
	    System.out.println("Mr.Brown got a hit on (" + (10 - x) + "," + (10 - y) + "), tough luck...");
	    map[x][y] = false;
	}
	else {
	    System.out.println("MR.BROWN MISSED!!");
	}
    }
	    
	
    public static void userscreen() {
	System.out.println("~~~~~~~~~~~~~HITMAP~~~~~~~~~~~~~");
	System.out.println("|------------------------------|");
	String curline;
	for(int i = 0; i < 10; i++) {
	    curline = "|";
	    for(int j = 0; j < 10; j++) {
	        if(hitmap[map.length - 1 - i][j]) {
		    curline += " 1 ";
		}
		else {
		    curline += " 0 ";
		}
	    }
	    curline += "|";
	    System.out.println(curline);
	}
	System.out.println("|------------------------------|");
		System.out.println("\n~~~~~~~~~~~~YOUR MAP~~~~~~~~~~~~");
	System.out.println("|------------------------------|");
	for(int i = 0; i < 10; i++) {
	    curline = "|";
	    for(int j = 0; j < 10; j++) {
	        if(map[map.length - 1 - i][j]) {
		    curline += " 1 ";
		}
		else {
		    curline += " 0 ";
		}
	    }
	    curline += "|";
	    System.out.println(curline);
	}
	System.out.println("|------------------------------|");
	
	    
    }

    public static boolean gameisover() {
	for(int i = 0; i < 10; i++) {
	    for(int j = 0; j < 10; j++) {
		if(map[i][j]) {
		    return false;
		}
		if(enemymap[i][j]){
		    return false;
		}
	    }
	}
	return true;
	//later make it figure out who won and print a statement
    }

    public void Play() {
	//System.out.println(Arrays.deepToString(map));
	//System.out.println(Arrays.deepToString(enemymap));
	Startup();
       	//System.out.println(Arrays.deepToString(map));
	//System.out.println(Arrays.deepToString(enemymap));
	userscreen();
	while (! gameisover()) {
	    userscreen();
	    hit();
	    enemyhit();
	}
    }
    
    public static void main(String[] args) {
	//System.out.println(Arrays.deepToString(map));
	//System.out.println(Arrays.deepToString(enemymap));
	Startup();
       	//System.out.println(Arrays.deepToString(map));
	//System.out.println(Arrays.deepToString(enemymap));
	userscreen();
	while (! gameisover()) {
	    userscreen();
	    hit();
	    enemyhit();
	}
    }

}
