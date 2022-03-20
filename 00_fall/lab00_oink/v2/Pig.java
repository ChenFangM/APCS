import java.util.Scanner;

// TNPG: UmmmmmV - Fang Chen, Brianna Tieu, Brian Kang
/*
TO-DO LIST:
0: Code isPunc, isUpperCase, hasPunc and beginsWithUpper -- y
1: Debug DemoScanner -- y
2: Incorporate scanner -- y
3: Account for y as a vowel when appropriate -- n
4: Handle multiple consonants -- y
5: Account for capitalization -- n
6: Add punctuation -- n
*/

/*
DISCO:
0: We can utilize a while loop to account for the consonants that must be consistently moved to the end of the word.

QCC:
0: How may we consider numbers in our Pig Latin translator?

NEW IN V2:
We have coded the file to now handle multiple consonants at the beginning of the word. We also have accounted for words that don't have any vowels present.
*/

public class Pig {

  private static final String VOWELS = "aeiouy";
  private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String PUNCS = ".,:;!?";

  public static void main( String[] args ) {
    //instantiate a Scanner with STDIN as its bytestream
    Scanner sc = new Scanner( System.in );
    System.out.println( "Pig Latin Translator: ");

    while( sc.hasNext() ) {
      String next = sc.next();
      System.out.println( next + " --> " + engToPig(next));
    }

    for( String word : args ) {
      System.out.println( "allVowels \t" + allVowels(word) );
      System.out.println( "firstVowels \t" + firstVowel(word) );
      System.out.println( "countVowels \t" + countVowels(word) );
      System.out.println( "engToPig \t" + engToPig(word) );
      System.out.println( "---------------------" );
    }
  }

  /**
    String engToPig(String) -- converts an English word to Pig Latin
    pre:  w.length() > 0
    post: engToPig("apple")  --> "appleway"
    engToPig("strong") --> "ongstray"
    engToPig("java")   --> "avajay"
  **/
  public static String engToPig( String w ) {

    String ans = "";
    if ( countVowels(w) == 0) {
      ans = w + "ay";
    }

    if ( beginsWithVowel(w) ) {
      ans = w + "way";
    } else {
  //consonants
          while (beginsWithVowel(w) == false && countVowels(w) > 0) {
            w = w.substring(1) + w.substring(0, 1);
          }
          if ( beginsWithVowel(w) ) {
            ans = w + "ay";
          }
    }

  /*
  //spaces / phrases
    if ( w.indexOf(" ") >= 0 ) {
    }
  */

  //considering capitalization
    if ( beginsWithUpper(w) ) {
      w = w.toLowerCase();
      ans = (ans.substring(0, 1).toUpperCase()) + ans.substring(1);
    }

  //considering y as a vowel
  /*
      if (hasPunc(w) == true) {
        for (int i = 0; i < w.length(); i++) {
          if ((isPunc(w.substring(i, i+1))) == true) {
            String newString = w.substring (0, i);
            ans = newString + ans + w.substring(i, i+1);
          }
        }
      }
    */
    return ans;
  
  }

  /**
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p") -> false
  **/
  public static boolean hasA( String w, String letter ) {
    return w.indexOf(letter) != -1;
  }


  /**
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
  **/
  public static boolean isAVowel( String letter ) {
    return VOWELS.indexOf(letter) != -1;
  }


  /**
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
  **/
  public static int countVowels( String w ) {
    return allVowels(w).length();
  }


  /**
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz") -> false
  **/
  public static boolean hasAVowel( String w ) {
    return w.indexOf(VOWELS) >= 0;
  }


  /**
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
  **/
  public static String allVowels( String w ) {

    String ans = ""; //init return String

    for( int i = 0; i < w.length(); i++ ) {

      if ( isAVowel( w.substring(i,i+1) ) )
        ans += w.substring( i, i+1 ); //grow the return String
    }
    return ans;
  }


  /**
    String firstVowel(String) -- returns first vowel in a String
    pre:  w != null
    post: firstVowel("") --> ""
    firstVowel("zzz") --> ""
    firstVowel("meatball") --> "e"
  **/
  public static String firstVowel( String w ) {

    String ans = "";

    if ( hasAVowel(w) )
      ans = allVowels(w).substring(0,1);

    return ans;
  }


  /**
    boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
    pre:  w != null and w.length() > 0
    post: beginsWithVowel("apple")  --> true
    beginsWithVowel("strong") --> false
  **/
  public static boolean beginsWithVowel( String w ) {
    return isAVowel( w.substring(0,1) );
  }

  /*
    =====================================
    boolean isPunc(String) -- tells whether a character is punctuation
    pre:  symbol.length() == 1
    post: isPunc(".") -> true
          isPunc("b") -> false
    =====================================
  */
  public static boolean isPunc( String symbol ) {
    return (PUNCS.indexOf( symbol ) >= 0);
  }


  /*
    =====================================
    boolean isUpperCase(String) -- tells whether a letter is uppercase
    pre:  letter.length() == 1
    post: isUpperCase("a") -> false
          isUpperCase("A") -> true
    =====================================
  */
  public static boolean isUpperCase( String letter ) {
    for (int i = 0; i < CAPS.length(); i++) {
      if (letter.equals(CAPS.substring(i, i+1))) {
        return true;
    }
  }
    return false;
  }

  /*
  =====================================
    boolean hasPunc(String) -- tells whether a String contains punctuation
    pre:  w != null
    post: hasPunc("cat.") -> true
          hasPunc("cat") -> false
    =====================================
  */
  public static boolean hasPunc( String w ) {
    for (int i = 0; i < PUNCS.length(); i++) {
      if (w.indexOf( PUNCS.substring(i, i+1) ) >= 0) {
        return true;
  }
}
return false;
}

  /*
    =====================================
    boolean beginsWithUpper(String) -- tells whether 1st letter is uppercase
    pre:  w != null and w.length() > 0
    post: beginsWithUpper("Apple") -> true
          beginsWithUpper("apple") -> false
    =====================================
  */
  public static boolean beginsWithUpper( String w ) {
    return isUpperCase(w.substring(0, 1));
  }

}//end class Pig