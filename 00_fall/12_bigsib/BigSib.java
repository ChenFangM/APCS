/* 
Team Dynastic Duo of Destiny {Fang, Ducky Cat, William, and Ducky CS5ODDB}
APCS
HW 12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021-10-26
*/

public class BigSib {

	String helloMsg;

	public void setHelloMsg(String msg) {
		helloMsg = msg;
	}

	public String greet(String name) {
		String greeting = helloMsg + " " + name;
		return greeting;
	}

}

/*
DISCOVERIES
The class BigSib is a blueprint for instances that are defined by "BigSib instanceName = new BigSib();" 
The instance created, instanceName, will have the attribute String helloMsg and now the methods in class BigSib can be used with a dot operator.
An important thing to note is that the methods do not have the keyword static so that it can be used with instances.
When the code runs, instanceName.setHelloMsg() will set helloMsg to the string input.
And instanceName.greet() will return a string that combines helloMsg and the name which is the string input. 
Once the method greet returns a string, the main method of the class greet will print the entire greeting.

QCC
- What else could you do with instances?
*/
