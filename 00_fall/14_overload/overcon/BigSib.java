public class BigSib {

	String helloMsg;

	BigSib(String msg) {
		this.helloMsg = msg;
	}

	public String greet(String name) {
		return helloMsg + " " + name;
	}

}