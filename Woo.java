/*
Anything is Puzzleble
APCS1 pd4
Updated: 2017-1-12
*/

/*=============================================
  class Woo -- Driver file for Trapped Instuyde
  all ASCII art originates from http://ascii.co.uk/art/
  =============================================*/

import cs1.Keyboard;

public class Woo
{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  

    public static void main( String[] args )
    {
	String ret = "";
	ret = "Welcome to Stuyvesant High School. Your Helicopter has dropped you off on the roof for school this morning.";
	ret += "\nDifficulty?\n1 = Easy\n2 = Normal\n3 = Hard";
	System.out.println(ret);

	int difficulty; 
	difficulty = Keyboard.readInt();
	if (difficulty == 1) {
	    System.out.println("Easy");
	}
	else if (difficulty == 2) {
	    System.out.println("Normal");
	}
	else {
	    System.out.println("Hard");
	}

	ret = "You have reached the BOSS LEVEL.";
	System.out.println(ret);
	Battleship.Startup();
	Battleship.userscreen();
    }//end main

}//end class Woo


