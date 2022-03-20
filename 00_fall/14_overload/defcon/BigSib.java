/* 
"Shoulder Buddies" {Fang, William, and the Duckies Cat and CS5ODDB}
APCS
HW 14 -- Customize Your Creation
2021-10-08
*/

public class BigSib {

	String helloMsg;

	public String greet(String name) {
		String helloMsg = "Hello";

		if (name == "freshman") {
			helloMsg = "Word up";
		} 
		if (name == "Dr. Spaceman") {
			helloMsg = "Salutations";
		} 
		if (name == "Kong Fooey") {
			helloMsg = "Hey ya";
		}
		if (name == "mom") {
			helloMsg = "Sup";
		}

		return helloMsg + " " + name;

	}

}

/*
DISCOVERIES
- I could use "==" to relate two strings and create a boolean value for my conditional.
- This way, depending on the String argument of greet() for each instance, I can return the corresponding greeting.


QCC
- What are other ways that I could've written this code? 

*/