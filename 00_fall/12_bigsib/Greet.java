public class Greet {

	public static void main(String[] args) {

		String greeting;

		//

		BigSib richard = new BigSib();
		richard.setHelloMsg("Word up");
		
		greeting = richard.greet("freshman");
		System.out.println(greeting);

		//

		BigSib doctor = new BigSib();
		doctor.setHelloMsg("Salutations");

		greeting = doctor.greet("Dr. Spaceman");
		System.out.println(greeting);

		//

		BigSib fooey = new BigSib();
		fooey.setHelloMsg("Hey ya");

		greeting = fooey.greet("Kong Fooey");
		System.out.println(greeting);

		//

		BigSib mom = new BigSib();
		mom.setHelloMsg("Sup");

		greeting = mom.greet("mom");
		System.out.println(greeting);

	} // end main()

} // end Greet
