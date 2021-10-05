/*
Team Not-In-Service {Fang Chen, nada Hameed, Prattay Dey, and Ducky Cat}
APCS
HW 09 -- Using BigSib class in Greet class
2021-10-01
*/

public class BigSib {

	public static void main(String[] args) {
		greet("[name]");
	}

	public static void greet(String name) {
		String greeting = "Good morning! How has your day been, ";
		System.out.println(greeting + name + "?");
	}

}

/*
DISCOVERIES
- In order to use the methods in class BigSib, we must create BigSib.java with a greet method so that BigSib.greet will know where to refer to.
- Importing a package is not necessary to use a method from a file in the same directory.

UNSOLVED QUESTIONS
- Is there another way in which we can use methods/classes from another file in the same directory or even different directories?
*/
