import java.util.Arrays;

public class Battleship {
    static boolean[][] enemymap = new boolean[10][10];
    static boolean[][] hitmap = new boolean[10][10];
    static boolean[][] map = new boolean[10][10];
    static boolean[][] enemyhitmap = new boolean [10][10];
    static int extraship;

    public static void Startup () {
	int x, y;
        boolean orient;
	orient = "vertical".equals("vertical"/*User inputs wanted orientation*/);
	x = 2 /* User inputs leftmost coord*/;
	y = 3 /* User inputs bottommost cord*/;
	Place(orient, x, y, 2);
       	orient = "vertical".equals("swag"/*User inputs wanted orientation*/);
	x = 5/* User inputs leftmost coord*/;
	y = 6/* User inputs bottommost cord*/;
	Place(orient, x, y, 3);
       	orient = "vertical".equals("vertical"/*User inputs wanted orientation*/);
	x = 6/* User inputs leftmost coord*/;
	y = 3/* User inputs bottommost cord*/;
	Place(orient, x, y, 3);
       	orient = "vertical".equals("deeznuts"/*User inputs wanted orientation*/);
	x = 7/* User inputs leftmost coord*/;
	y = 2/* User inputs bottommost cord*/;
	Place(orient, x, y, 4);
       	orient = "vertical".equals("vertical"/*User inputs wanted orientation*/);
	x =  3/* User inputs leftmost coord*/;
	y =  4/* User inputs bottommost cord*/;
	Place(orient, x, y, 5);
       	orient = "vertical".equals("Stressed? Nah Boi"/*User inputs wanted orientation*/);
	x = 1/* User inputs leftmost coord*/;
	y = 1/* User inputs bottommost cord*/;
	Place(orient, x, y, extraship);

	
	//Make the comp randomly choose positions on their map
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
    public static void Place(boolean orient,int x,int y, int size) {
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
	    x = 4 /*User Input Here*/;
	    y = 5 /*User Input Here*/;
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
		System.out.println("God Damn it you moron you shot there already, try again dipshit");
		}
	    }
	    else{
		System.out.println("Hey Dumbass, it's a 10x10 grid. try again");
	    }
	    }
    }
    public static void main(String[] args) {
	System.out.println(Arrays.deepToString(map));
	System.out.println(Arrays.deepToString(enemymap));
	Startup();
       	System.out.println(Arrays.deepToString(map));
	System.out.println(Arrays.deepToString(enemymap));
    }

}
