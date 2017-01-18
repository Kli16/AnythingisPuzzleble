public class ArtPuzzle extends Activity{
    //initialize grid
    String[][] Grid = new String[3][3];
    Grid = [["01","02","03"],
	    ["04","05","06"],
	    ["07","08","  "]];

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
	if (direction.toLowerCase().equals("left")) {
	    int emptyIndex = 0;
	    for (int index = 1; index < Grid[0].length; index++) {
		if (Grid[rowNumber][index].equals("  ")) {
		    emptyIndex = index;
		    break;
		}
	    }
	    if (emptyIndex == 2) {
		System.out.println("Invalid movement");
	    }
	    Grid[rowNumber][emptyIndex] = Grid[rowNumber][emptyindex+1];
	    Grid[rowNumber][emptyIndex+1] = "  ";
	}
	else {
	    int emptyIndex = 0;
	    for (int index = 1; index < Grid[0].length; index++) {
		if (Grid[rowNumber][index].equals("  ")) {
		    emptyIndex = index;
		    break;
		}
	    }
	    if (emptyIndex == 0) {
		System.out.println("Invalid movement");
	    }
	    Grid[rowNumber][emptyIndex] = Grid[rowNumber][emptyindex-1];
	    Grid[rowNumber][emptyIndex-1] = "  ";
	}
    }

    public void moveVertical(String direction) {
	//find empty row
	int colNumber = 0;
	for (int col = 1; col < Grid[0].length; col++) {
	    for () {
		if (val.equals("  ")) {
		    rowNumber = row;
		    break;
		}
	    }
	}
	if (direction.toLowerCase().equals("up")) {
	    int emptyIndex = 0;
	    for (int index = 1; index < Grid[0].length; index++) {
		if (Grid[rowNumber][index].equals("  ")) {
		    emptyIndex = index;
		    break;
		}
	    }
	    if (emptyIndex == 2) {
		System.out.println("Invalid movement");
	    }
	    Grid[rowNumber][emptyIndex] = Grid[rowNumber][emptyindex+1];
	    Grid[rowNumber][emptyIndex+1] = "  ";
	}
	else {
	    int emptyIndex = 0;
	    for (int index = 1; index < Grid[0].length; index++) {
		if (Grid[rowNumber][index].equals("  ")) {
		    emptyIndex = index;
		    break;
		}
	    }
	    if (emptyIndex == 0) {
		System.out.println("Invalid movement");
	    }
	    Grid[rowNumber][emptyIndex] = Grid[rowNumber][emptyindex-1];
	    Grid[rowNumber][emptyIndex-1] = "  ";
	}
    }

    public static void main(String[] args) {
        String [][] Grid = {{"01","02","03"},
			    {"04","05","06"},
			    {"07","08","  "}};
	System.out.println(Grid);
	System.out.println(Grid[1].toString());
    }
}
