/***
 * Team Hollister {Fang, Cat, Brianna, Pepe, Nicole, Duck}
 * APCS
 * HW31 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
 * 2021-11-04
 * time spent: 0.8 hr
 *
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

/*
DISCOVERIES
0: By adding "AEIOU" to the "aeiou" string, the code will be able to also recognize capital-case letters.

QCC
0: How do we utilize the coding skills from this assignment to analyze, say a larger piece of test?
*/

public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiouAEIOU";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter ) 
  {
    return w.indexOf(letter) > -1;
  } //end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter ) 
  {
    if (!(letter.equals(""))) { 
      return VOWELS.indexOf(letter) > -1;
    }
    return false;
  } //end isAVowel()


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w ) 
  {
    int numOfVowels = 0;
    for (int i = 0; i < w.length(); i++) {
      if (isAVowel(w.substring(i, i + 1))) {
        numOfVowels ++;
      }
    }
    return numOfVowels;
  } //end countVowels()


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w ) 
  {
    return countVowels(w) > 0;
  } //end hasAVowel()


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w ) 
  {
    String pigLatin = "";
    for (int i = 0; i < w.length(); i++) {
      if (isAVowel(w.substring(i, i + 1))) {
        pigLatin += w.substring(i, i + 1);
      }
    }
    return pigLatin;
  } //end allVowels()


  public static void main( String[] args ) 
  {

    System.out.println( 
      hasA("abc", "c") + "\t" +
      hasA("c", "c") + "\t" +
      hasA("def", "c") + "\t" +
      hasA("", "c") + "\t"
    );

    System.out.println(
      isAVowel("o") + "\t" +
      isAVowel("p") + "\t" +
      isAVowel("al") + "\t" +
      isAVowel("") + "\t"
    );

    System.out.println(
      countVowels("oink") + "\t" +
      countVowels("TTTTT") + "\t" +
      countVowels("Aeiou") + "\t" +
      countVowels("")
    );

    System.out.println(
      hasAVowel("oink") + "\t" +
      hasAVowel("TTTTT") + "\t" +
      hasAVowel("Aeiou") + "\t" +
      hasAVowel("")
    );

    System.out.println(
      allVowels("oink") + "\t" +
      allVowels("TTTTT") + "\t" +
      allVowels("Aeiou") + "\t" +
      allVowels("")
    );

  } //end main()

} //end class Pig
