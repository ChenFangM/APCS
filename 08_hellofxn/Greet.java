public class Greet {

    public static void main(String [] args) {
        greet("Mr. Mykolyk");
	greet("Nada");
	greet("Brianna");
    }
    
    public static void greet(String name) {
    	String greeting = "Good morning! How has your day been, ";
	System.out.println(greeting + name + "?");
    }

}

/*

DISCOVERIES
- I learned to use the command "nano [fileName.java]" to open a text editor through ssh.
- Certain error messages I received in writing this code were syntax errors like forgetting the semicolon after every line.

UNSOLVED QUESTIONS
- For the main() method and the greet(String) methods, I used the key words public and static, but I don't know the specifics of their usage.

*/
