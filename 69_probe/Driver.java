public class Driver {

  public static void main(String[] args) {

    int p = 100;
    while ( p > 0 ) {
      for (Integer i = 6; i < 7; i ++) {
        KnightTour KT = new KnightTour();
        System.out.println("for... " + i);
        String[] hi = {i.toString()};
        KT.main(hi);
      }
      p --;
    }

  }

}
