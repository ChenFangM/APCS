/*
Hollister - Brianna, Pepe, Fang, Cat, Nicole, Duck
APCS
HW 21 - STAtisTically Speaking...
2021-10-20
*/

/*
DISCOVERIES
0: When your input parameters for mean or geoMean are both integers, it will return an int value rounded instead of a double, even if the expected answer is a double because java recognizes which method to use based on its parameter type.
1: You can use Math.round() to convert the numerical primitive data type to another numerical primitive data type with half the number of bits. 

QCC
0: How do we resolve the problem mentioned in DISCOVERY 0?
*/

public class StatsDriver {
  public static void main(String[] args) {
    
    //testing mean
    System.out.println("Expected output: 2.5\t"+ "Output: " + Stats.mean(2, 3));
    System.out.println("Expected output: 3\t" + "Output: " + Stats.mean(1, 5));
    System.out.println("Expected output: 17\t" + "Output: " + Stats.mean(17, 17));
    System.out.println("Expected output: -17\t" + "Output: " + Stats.mean(-17, -17));
    System.out.println("Expected output: 8.0\t" + "Output: " + Stats.mean(0.0, 16.0));
    System.out.println("Expected output: -3.0\t" + "Output: " + Stats.mean(-8.0, 2));

    //testing max
    System.out.println("Expected output: 1\t" + "Output: " + Stats.max(0, 1));
    System.out.println("Expected output: 0\t" + "Output: " + Stats.max(0, -1));
    System.out.println("Expected output: 1\t" + "Output: " + Stats.max(1, 1));
    System.out.println("Expected output: -1\t" + "Output: " + Stats.max(-5, -1));
    System.out.println("Expected output: 4.5\t" + "Output: " + Stats.max(2.5, 4.5));
    System.out.println("Expected output: 1.6\t" + "Output: " + Stats.max(-3.7, 1.6));
    //  max with 3 parameters
    System.out.println("Expected output: 1\t" + "Output: " + Stats.max(0, 1, 0));
    System.out.println("Expected output: 0\t" + "Output: " + Stats.max(0, -1, -2));
    System.out.println("Expected output: -1\t" + "Output: " + Stats.max(-5, -1, -4));
    System.out.println("Expected output: 7.8\t" + "Output: " + Stats.max(2.5, 4.5, 7.8));
    System.out.println("Expected output: 1.6\t" + "Output: " + Stats.max(-3.7, 1.6, -4.3));
    System.out.println("Expected output: -1.6\t" + "Output: " + Stats.max(-3.7, -1.6, -4.3));

    //testing geoMean
    System.out.println("Expected output: 2\t" + "Output: " + Stats.geoMean(2, 2));
    System.out.println("Expected output: 0\t" + "Output: " + Stats.geoMean(0, 2));
    System.out.println("Expected output: 6\t" + "Output: " + Stats.geoMean(3, 12));
    System.out.println("Expected output: 9\t" + "Output: " + Stats.geoMean(-3, -27));
    System.out.println("Expected output: 3.87\t" + "Output: " + Stats.geoMean(5, 3));
    System.out.println("Expected output: 3.87298...\t" + "Output: " + Stats.geoMean(5.0, 3.0));
    System.out.println("Expected output: 2.0\t" + "Output: " + Stats.geoMean(0.25, 16));
    //  geoMean with 3 parameters
    System.out.println("Expected output: 0\t" + "Output: " + Stats.geoMean(0, 2, 2));
    System.out.println("Expected output: 2\t" + "Output: " + Stats.geoMean(2, 2, 2));
    System.out.println("Expected output: 3\t" + "Output: " + Stats.geoMean(1, -3, -9));
    System.out.println("Expected output: 2.0\t" + "Output: " + Stats.geoMean(0.25, 16.0, 2.0));
    

  }
}
