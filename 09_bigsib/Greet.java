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
- In order to use the methods in class BigSib, we must create BigSib.java so that BigSib.greet refers to a the BigSib class.
- Importing a package is not necessary to use a method from the same directory.

UNSOLVED QUESTIONS
- Is there another way in which we can use methods/classes from another file in the same directory without creating?
*/
