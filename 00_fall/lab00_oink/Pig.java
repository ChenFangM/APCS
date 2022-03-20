import java.util.Scanner;

// TNPG: UmmmmmV - Fang Chen, Brianna Tieu, Brian Kang
/*
TO-DO LIST:
0: Code isPunc, isUpperCase, hasPunc and beginsWithUpper -- y
1: Debug DemoScanner -- y
2: Incorporate scanner -- y
3: Account for y as a vowel when appropriate -- y
4: Handle multiple consonants -- y
5: Account for capitalization -- y
6: Add punctuation -- y
*/

/*
DISCO: 
0: We can use toUpperCase() and toLowerCase() to turn a string into all capital or lowercase letters.

QCC:  
0: Are there any more efficient ways to splice the string into different words seperated by spaces?

HOW WE UTILIZED SCANNER DEMO (v1): 
We utilized the scanner demo by implementing the code seen in the while loop, which utilizes .next(). In our code, we used .next() to find the next line in file words.in to be translated into Pig Latin.
WHAT CAUSES THE RUNTIME ERROR IN THE SCANNER DEMO:
The error is caused by the while loop running .next(). As a result of the last line of words,in not having the next line present, it prompts an error message, as there is no next line for the while loop to print out.

NEW IN V3: 
Punctuation, Are Y's vowels?, Capitalization
*/

public class Pig {

  private static final String VOWELS = "AEIOUYaeiouy";
  private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String PUNCS = ".,:;!?";

  public static void main( String[] args ) {

    //instantiate a Scanner with STDIN as its bytestream
    Scanner sc = new Scanner( System.in );
    System.out.println( "Pig Latin Translator: ");

    while( sc.hasNext() ) {
      String next = sc.nextLine();
      System.out.println( next + " --> " + engToPig(next));
    }

  }


//============================================//


  /**
    String engToPig(String) -- converts an English word to Pig Latin
    pre:  w.length() > 0
    post: engToPig("apple")  --> "appleway"
    engToPig("strong") --> "ongstray"
    engToPig("java")   --> "avajay"
  **/
  public static String engToPig( String w ) {

    String originalw = w;
    String ans = "";
    String punc = "";

  //spaces/phrases
    if ( w.indexOf(" ") >= 0 ) {
      ans = space(w);
    } else {

    //accounts for cases w/o vowels
      if ( countVowels(w) == 0) {
        ans = w + "ay";
      }

    //punctuation
      if ( hasPunc(w) ) {
        punc = w.substring(w.length() - 1);
        w = w.substring(0, w.length() - 1);
      }

      if ( countVowels(w) == 0) {
        ans = w + "ay";
      } 

      if ( beginsWithVowel(w) ) {
    //y is the first letter
        if ((w.length() > 1) && (w.substring(0, 1).equals("y") || w.substring(0,1).equals("Y"))) {
          w = w.substring(1) + "y";
          if (beginsWithVowel(w)) {
            ans = w + "ay";
          }
        } else {
          ans = w + "way";
        }
      } else {
    //consonants
            while ( beginsWithVowel(w) == false && countVowels(w) > 0 ) {
              if (!(firstVowel(w).equals("y") || firstVowel(w).equals("Y"))) {
                w = w.substring(1) + w.substring(0, 1);
              } else {
                if (!(isAVowel(w.substring((w.indexOf(firstVowel(w)) + 1), w.indexOf(firstVowel(w)) + 2)))) {
                  w = w.substring(1) + w.substring(0, 1);
                } else {
                  w = w.substring(w.indexOf(firstVowel(w)) + 1) + w.substring (0, w.indexOf(firstVowel(w)) + 1);
                }
              }
              
            }

            if ( beginsWithVowel(w) ) {
              ans = w + "ay";
            }
      }
    
    //capitalization
      if ( beginsWithUpper(originalw) ) {
        ans = ans.toLowerCase();
        ans = (ans.substring(0, 1)).toUpperCase() + ans.substring(1);
      }

    }
    
  return ans + punc;
  }


//============================================//


  public static String space( String w ) {
    String pigLatinPhrase = "";
    for (int i = 0; i < w.length(); i++) {
      if (w.substring(i, i+1).equals(" ")) {
        pigLatinPhrase += engToPig(w.substring(0, i)) + " ";          
        w = w.substring(i+1);
        i = 0;
      }
    }
    if (w.length() > 0) {
      pigLatinPhrase += engToPig(w);
    }
    return pigLatinPhrase;
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