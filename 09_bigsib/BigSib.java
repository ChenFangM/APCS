package bigsibs;

public class BigSib {

	public static void main(String[] args) {
		greet("[name]");
	}

	public static void greet(String name) {
		String greeting = "Good morning! How has your day been, ";
		System.out.println(greeting + name + "?");
	}

}

