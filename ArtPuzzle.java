import cs1.Keyboard;

public class ArtPuzzle extends Activity{
    String[][]Grid;
    int totalMoves;

    public ArtPuzzle(){
	String[][] Grid = {{"01","02","03"},
		{"04","05","06"},
		{"07","08","  "}};
	int totalMoves = 0;
    }

    public void moveHorizontal(String direction) {
	//find empty row
	int rowNumber = 0;
	for (int row = 1; row < Grid.length; row++) {
	    for (String val: Grid[row]) {
		if (val.equals("  ")) {
		    rowNumber = row;
		    break;
		}
	    }
	}
	int emptyIndex = 0;
	for (int index = 1; index < Grid[0].length; index++) {
	    if (Grid[rowNumber][index].equals("  ")) {
		emptyIndex = index;
		break;
	    }
	}
	if (direction.toLowerCase().equals("left")) {
	    if (emptyIndex == 2) {
		System.out.println("Invalid movement");
	    }
	    Grid[rowNumber][emptyIndex] = Grid[rowNumber][emptyIndex+1];
	    Grid[rowNumber][emptyIndex+1] = "  ";
	}
	else {
	    if (emptyIndex == 0) {
		System.out.println("Invalid movement");
	    }
	    Grid[rowNumber][emptyIndex] = Grid[rowNumber][emptyIndex-1];
	    Grid[rowNumber][emptyIndex-1] = "  ";
	}
    }

    public void moveVertical(String direction) {
	//find empty column
	int colNumber = 0;
	for (int col = 1; col < Grid[0].length; col++) {
	    for (int row = 0; row < 3; row++) {
		if (Grid[row][col].equals("  ")) {
		    colNumber = col;
		    break;
		}
	    }
	}
	//find empty space
	int emptyIndex = 0;
	for (int index = 1; index < Grid[0].length; index++) {
	    if (Grid[index][colNumber].equals("  ")) {
		emptyIndex = index;
		break;
	    }
	}

	//move accordingly
	if (direction.toLowerCase().equals("up")) {
	    if (emptyIndex == 2) {
		System.out.println("Invalid movement");
	    }
	    Grid[emptyIndex][colNumber] = Grid[emptyIndex+1][colNumber];
	    Grid[emptyIndex+1][colNumber] = "  ";
	}
	else {
	    if (emptyIndex == 0) {
		System.out.println("Invalid movement");
	    }
	    Grid[emptyIndex][colNumber] = Grid[emptyIndex-1][colNumber];
	    Grid[emptyIndex-1][colNumber] = "  ";
	}
    }

    public void move(String direction) {
	String lowercasedirection = direction.toLowerCase();
	if (lowercasedirection.equals("up") || lowercasedirection.equals("down")) {
	    moveVertical(direction);
	    totalMoves++;
	    return;
	}

	if (lowercasedirection.equals("left") || lowercasedirection.equals("right")) {
	    moveHorizontal(direction);
	    totalMoves++;
	    return;
	}
	System.out.println("Invalid Input");
    }



    public void scramble() {
	String[] choices = {"up","down","left","right"};
	for (int reps = 0; reps < 20; reps++) {
	    move(choices[(int)(4*Math.random())]);
	}
    }


    public void Play(Player name) {
    }



    public static void main(String[] args) {
    }
}
