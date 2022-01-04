/*
Maybe I'll finish this one day
*/

public class Game {

  public static void main(String[] args) {
    for (int i = 1; i <= 40; i ++) {
      System.out.println(i + ": " + expression(i));
    }
  }

  public static String expression(int target) {
    double value = 0;
    String s = "";

    while (true) {



      if ((double) target == value) {
        return s;
      }

    }

  }


}
