/*
Hollister - Brianna, Pepe, Fang, Cat, Nicole, Duck
APCS
HW 21 - STAtisTically Speaking...
2021-10-20

TASK:
Implement each method without typecasting.

xtra: harmonic mean is the reciprocal of the
arithmetic mean of the reciprocals
*/

public class Stats {

  public static int mean(int a, int b) {
    return (a + b) / 2;
  }

  public static double mean(double a, double b) {
    return (a + b) / 2;
  }

  public static int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
        return b;
  }
}

  public static double max(double a, double b) {
    if (a > b) {
      return a;
    } else {
        return b;
  }
}

  public static int geoMean(int a, int b) {
    double frac = (double) 1/2;
    int product = a * b;
    double meanD = Math.pow(product, frac); 
    long meanL = Math.round(meanD);
    int meanI = Math.round(meanL);
    return meanI;
  }

  public static double geoMean(double a, double b) {
    double frac = (double) 1/2;
    double product = a * b;
    return Math.pow(product, frac);
  }

  public static int max(int a, int b, int c) {
    if ((a > b) && (a > c)) {
      return a;
    } else {
        if ((b > a) && (b > c)) {
          return b;
        } else {
            return c;
        }
     }
  }

  public static double max(double a, double b, double c) {
    if ((a > b) && (a > c)) {
      return a;
    } else {
        if ((b > a) && (b > c)) {
          return b;
        } else {
            return c;
        }
     }
  }

  public static int geoMean(int a, int b, int c) {
    double frac = (double) 1/3;
    int product = a * b * c;
    double meanD = Math.pow(product, frac); 
    long meanL = Math.round(meanD);
    int meanI = Math.round(meanL);
    return meanI;
  }

  public static double geoMean(double a, double b, double c) {
    double frac = (double) 1/3;
    double product = a * b * c;
    return Math.pow(product, frac);
  }

  //main method for testing functionality
  public static void main( String[] args ) {
  }

}//end class
