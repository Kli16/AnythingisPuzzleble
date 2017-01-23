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
	System.out.println("What is your name?");
	String name = Keyboard.readString();
	Player player1 = new Player(name);
	player1.Play();
    }//end main

}//end class Woo


