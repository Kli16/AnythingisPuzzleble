public class Location {

    public String name, narration;
    public Action interaction;

    public Location(){}

    public Location(String given, String information, Action event) {	
	name = given;
	narration = information;
	interaction = event;
    }

    public static void main(String[] args) {
	System.out.println("You are in "+name);
	System.out.println(narration);
	interaction();
    }
}
