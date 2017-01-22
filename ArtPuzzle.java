import cs1.Keyboard;

public class ArtPuzzle extends Activity{
    String[][] Grid, originalGrid;
    int totalMoves;

    public ArtPuzzle(){
	String[][] originalGrid = {{"01","02","03"},
		{"04","05","06"},
		{"07","08","  "}};
	String[][] Grid = {{"01","02","03"},
		{"04","05","06"},
		{"07","08","  "}};
	int totalMoves = 0;
    }

    public String moveHorizontal(String direction) {
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
		return "Invalid movement";
	    }
	    Grid[rowNumber][emptyIndex] = Grid[rowNumber][emptyIndex+1];
	    Grid[rowNumber][emptyIndex+1] = "  ";
	}
	else {
	    if (emptyIndex == 0) {
		return "Invalid movement";
	    }
	    Grid[rowNumber][emptyIndex] = Grid[rowNumber][emptyIndex-1];
	    Grid[rowNumber][emptyIndex-1] = "  ";
	}
	return "";
    }

    public String moveVertical(String direction) {
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
		return "Invalid movement";
	    }
	    Grid[emptyIndex][colNumber] = Grid[emptyIndex+1][colNumber];
	    Grid[emptyIndex+1][colNumber] = "  ";
	}
	else {
	    if (emptyIndex == 0) {
		return "Invalid movement";
	    }
	    Grid[emptyIndex][colNumber] = Grid[emptyIndex-1][colNumber];
	    Grid[emptyIndex-1][colNumber] = "  ";
	}
	return "";
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
	int randChoice;
	for (int reps = 0; reps < 20; reps++) {
	    randChoice = (int) (4*Math.random());
	    move(choices[randChoice]);
	}
    }

    public void printGrid() {
	for (String[] row: Grid) {
	    for (String num: row) {
		System.out.print(num+" ");
	    }
	    System.out.println("");
	}
    }
    
    public void Play(Player name) {
	printGrid();
	System.out.println("Input a direction to slide a piece (up, down, left, right)");
	while (!(Grid.equals(originalGrid))) {
	    move(Keyboard.readString());
	    totalMoves += 1;
	}
	name.energy += totalMoves/5;
    }


    /*
    public static void main(String[] args) {
        String[][] Grid = {{"01","02","03"},
		{"04","05","06"},
		{"07","08","  "}};
	printGrid(Grid);
	scramble(Grid);
	printGrid(Grid);
	}*/
}
