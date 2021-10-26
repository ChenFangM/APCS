// Team: MontaUK (Fang, Cat, Nicole, Duck)
// APCS
// HW24 -- Get It While You Can
// 2021-10-26
// time spent: 0.7 hr

/*
DISCO:
0: While commands can terminate once conditions are met or run on forever if conditions aren't met (i.e. as long as BE is true)
1: getFlipCtr is useful since it is a public method that returns the private instance variable flipCtr. Without getFlipCtr, Driver.java is unable to retrieve this private value.

QCC:
0: I vaguely remember "for" commands from the summer prework; how do we utilize them? 
*/

public class Driver {

  public static void main(String[] args) {
    Coin montaUK = new Coin("half dollar");
    Coin duck = new Coin("dollar");
    Coin cat = new Coin("penny");

    // Flip until x heads have come up
    int xHeads = 3500;
    while (montaUK.getHeadsCtr() < 3500) {
      montaUK.flip();
    } 
    System.out.println("Flip until you have 3500 heads: \n");
    System.out.println(montaUK.summary());


    // Flip until y matches have occurred
    int yMatches = 3500;
    while (duck.getFlipCtr() < 3500) {
      duck.flip();
    }
    System.out.println("Flip until you have 3500 matches: \n");
    System.out.println(duck.summary());

    // Flip until 65536 matches have come up and the number of matches is divisible by 2005
    int zMatches = 65536;
    while (!((cat.getFlipCtr() >= zMatches) && (cat.getFlipCtr() % 2005 == 0))) {
      cat.flip();
    }
    System.out.println("Flip until you have at least 65536 matches and match count is divisible by 2005: \n");
    System.out.println(cat.summary());

  }// end main()

}// end class
