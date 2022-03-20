/***
Team MontaUK {Fang, Cat, Nicole, Duck}
APCS
HW23 -- What Does Equality Look Like?
2021-10-25
time spent: 1 hr
 ***/

/*
DISCOVERIES
0: ".equals()" is quite neat boolean method for comparing strings.
1: "toString()" allows you to be returned a string with an instance's information by simply calling the instance name.

QCC
- None for now.
*/


public class Coin {

  //attributes aka instance vars
  private double value;
  private String upFace;
  private String name;
  private int flipCtr;
  private int headsCtr;
  private int tailsCtr;
  private double bias = 0.5;


  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
  }

  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin(String denomination) {
    name = denomination;
  }

  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin(String denomination, String currFace) {
    name = denomination;
    upFace = currFace;
  }


  // Accessors...
  // ----------------------------
  public String getUpFace() {
    return upFace;
  }

  public int getFlipCtr() {
    return flipCtr;
  }

  public double getValue() {
    return value;
  }

  public int getHeadsCtr() {
    return headsCtr;
  }

  public int getTailsCtr() {
    return tailsCtr;
  }

  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/

  private double assignValue( String s ) {
    if (s.equals("penny")) {
      value = 0.01;
    } else if (s.equals("nickel")) {
      value = 0.05;
    } else if (s.equals("dime")) {
      value = 0.10;
    } else if (s.equals("quarter")) {
      value = 0.25;
    } else if (s.equals("half dollar")) {
      value = 0.50;
    } else if (s.equals("dollar")) {
      value = 1.00;
    }
    return value;
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
    upFace = s;
    bias = d;
    flipCtr = 0;
    headsCtr = 0;
    tailsCtr = 0;
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
    flipCtr += 1;
    if (Math.random() <= bias) {
      headsCtr += 1;
      upFace = "heads";
      return upFace; 
    } else {
      tailsCtr += 1;
      upFace = "tails";
      return upFace;
    }
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
    if (getUpFace().equals(other.getUpFace())) {
      return true;
    } else {
      return false;
    }
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
    String info = name + " -- " + upFace;
    return info;
  }

}//end class