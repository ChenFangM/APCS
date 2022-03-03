public class Driver {

  public static void main(String[] args) {

    int p = 100;
    while ( p > 0 ) {
      for (Integer i = 5; i < 6; i ++) {
        KnightTour KT = new KnightTour();
        System.out.println("for... " + i);
        String[] hi = {i.toString()};
        KT.main(hi);
      }
      p --;
    }

  }

}
