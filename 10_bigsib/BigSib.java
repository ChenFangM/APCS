/*
Team Not-in-Service {Fang Chen, Nada Hameed, Prattay Dey, Ducky Cat}
APCS
HW 10 -- Having BigSib.greet return a string instead of printing
2021-10-05
*/

public class BigSib {

	public static void main(String[] args) {
		System.out.println( greet("Testing"));
	}

	public static String greet(String name) {
		String greeting = "Good morning! How has your day been, " + name + "?";
		return greeting;
	}

}

/*
DISCOVERIES
- To have greet(String) return a string, we have to replace the keyword "void" when defining the method with the keyword "String".
- When defining an object (e.g. greeting) as a string, the "S" in "String" is capitalized, unlike "int," "double," or "boolean."
- To use a method from another class (BigSib), you must javac Bigsib.java before you can javac Greet.java because the BigSib class referred to in the Greet.java code could not be found otherwise.

UNSOLVED QUESTIONS
- What does the keywords "public" and "static" mean when defining a class or method?

*/
