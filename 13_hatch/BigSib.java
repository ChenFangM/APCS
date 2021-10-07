/* 
"Shoulder Buddies" {Fang, William, and Duckies Cat and CS5ODDB}
APCS
HW 13 -- Where do BigSibs Come From?
2021-10-07
*/

public class BigSib {

	String helloMsg;

	BigSib(String msg) {
		this.helloMsg = msg;
	}

	public String greet(String name) {
		return helloMsg + " " + name;
	}

}

/*
DISCOVERIES
- You can use a contructor to assign values/strings to attributes by adding parameters to said constructor.
- A constructor exists without any return types and have the same name as the class.

QCC
- Can attributes be modified after original assignment of values with the constructor?
*/