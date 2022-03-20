public class Greet {

	public static void main(String[] args) {

		String greeting;

		//

		BigSib richard = new BigSib("Word up");
		greeting = richard.greet("freshman");
		System.out.println(greeting);

		//

		BigSib doctor = new BigSib("Salutations");
		greeting = doctor.greet("Dr. Spaceman");
		System.out.println(greeting);

		//

		BigSib fooey = new BigSib("Hey ya");
		greeting = fooey.greet("Kong Fooey");
		System.out.println(greeting);

		//

		BigSib mom = new BigSib("Sup");
		greeting = mom.greet("mom");
		System.out.println(greeting);

	} // end main()

} // end Greet
