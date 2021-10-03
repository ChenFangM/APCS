/*
Team Not-In-Service {Fang Chen, Nada Hameed, Prattay Dey, and Cat}
APCS
HW09 -- Using BigSib class in Greet class
2021-10-01
*/

public class Greet {

    public static void main(String [] args) {
        BigSib.greet("Mr. Mykolyk");
	BigSib.greet("Nada");
	BigSib.greet("Brianna");
    }
    
}

/*
DISCOVERIES
- In order to use the methods in class BigSib, we need to have a way to refer to another file (i.e. via packages).
- Before we can import BigSib, we can create a package using the "package" command in BigSib.java.

UNSOLVED QUESTIONS
- Is there another way in which we cna use methods/classes from another file in the same directory without creating a package?
*/
