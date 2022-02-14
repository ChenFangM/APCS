import java.util.*;

public class Activity5 {

  private int _turns = 0;
  private String _word = "words";
  private boolean _isWin = false;
  private ArrayList<String> _letters = new ArrayList<String>();
  private String[] _check = new String[5];

  public Activity5(String newWord) {
    _word = newWord.toLowerCase();
    for (int i = 0; i < 5; i ++) {
      _letters.add(_word.substring(i, i + 1));
      _check[i] = "-";
    }
  }

  public static void main(String[] args) {

    if (args.length != 1) {
      System.out.println("Invalid number of inputs.");
      return;
    }

    String word = args[0];

    if (word.length() != 5) {
      System.out.println("Not a 5 letter word :(");
    }

    Activity5 game = new Activity5(word);

    game.play();

  }


  public void play() {
    System.out.println("\nWelcome to Rip-Off Wordle! Guess 5-letter words to play!");
    Scanner s = new Scanner(System.in);
    String tempGuess = "";
    String tempLetter = "";

    while (_turns < 6) {
        System.out.print("\nGuess: ");
        tempGuess = (s.nextLine()).toLowerCase();

        if (tempGuess.length() != 5) {
          System.out.print("       Invalid Guess. Try again!");

        } else {

          System.out.print("       ");
          _turns ++;
          if (tempGuess.compareTo(_word) == 0) {
            _isWin = true;
            break;
          }

          for (int i = 0; i < 5; i ++) {
            tempLetter = tempGuess.substring(i, i + 1);
            if (tempLetter.compareTo(_word.substring(i, i + 1)) == 0) {
              _check[i] = "+";
              _letters.remove(_letters.indexOf(tempLetter));
            }
          }
          for (int i = 0; i < 5; i ++) {
            tempLetter = tempGuess.substring(i, i + 1);
            if (isIn(tempLetter) && (_check[i].compareTo("+") != 0)) {
              _check[i] = "?";
              _letters.remove(_letters.indexOf(tempLetter));
            }
          }

          displayCheck();
          for (int i = 0; i < 5; i ++) {
            _letters.add(_word.substring(i, i + 1));
            _check[i] = "-";
          }
        }
    }

    if (_isWin) {
      System.out.println("\nCongrats! It took " + _turns + " turn(s).");
    } else {
      System.out.println("\n\nUnfortunate.");
    }
  }

  public boolean isIn(String tempLetter) {
    for (int i = 0; i < _letters.size(); i ++) {
      if (tempLetter.compareToIgnoreCase(_letters.get(i)) == 0) {
        return true;
      }
    }
    return false;
  }

  public void displayCheck() {
    for (int i = 0; i < 5; i ++) {
      System.out.print(_check[i]);
    }
  }

}
