public class code1 {

  public static void main(String[] args) {

    code1 t = new code1();

    // testing site
    System.out.println(t.count7(817237));

  }

/* scoresIncreasing */
  public boolean scoresIncreasing(int[] scores) {
    
    for (int i = 0; i < scores.length - 1; i ++) {
      if (scores[i] > scores[i + 1]) {
        return false;
      } 
    }
    return true;

  }

/* scores100 */
  public boolean scores100(int[] scores) {
    
    for (int i = 0; i < scores.length - 1; i ++) {
      if (scores[i] == 100 && scores[i + 1] == 100) {
        return true;
      } 
    }
    return false;

  }

/* scoresClump */
  public boolean scoresClump(int[] scores) {
    
    for (int i = 0; i < scores.length - 2; i ++) {
      if (scores[i + 2] - scores[i] <= 2) {
        return true;
      }
    }
    return false;

  }

/* scoresAverage */
  public int scoresAverage(int[] scores) {

    int fstAvg = average(scores, 0, (scores.length / 2) - 1);
    int secAvg = average(scores, scores.length / 2, scores.length - 1);
    if (fstAvg > secAvg) {
      return fstAvg;
    } else {
      return secAvg;
    }

  }
  public int average(int[] scores, int start, int end) {

    int sum = 0;
    for (int i = start; i <= end; i ++) {
      sum += scores[i];
    }
    return sum / (end + 1 - start);

  }

/* wordsCount */
  public int wordsCount(String[] words, int len) {

    int count = 0;
    for (String word : words) {
      if (word.length() == len) {
        count ++;
      }
    }
    return count;

  }

/* wordsFront */
  public String[] wordsFront(String[] words, int n) {
    
    String[] newWords = new String[n];
    for (int i = 0; i < n; i ++) {
      newWords[i] = words[i];
    }
    return newWords;

  }

/* wordsWithoutList */
public List wordsWithoutList(String[] words, int len) {

  List<String> newWords = new java.util.LinkedList<String>();
  for (String word : words) {
    if (word.length() != len) {
      newWords.add(word);
    }
  }
  return newWords;

}

/* hasOne */
  public boolean hasOne(int n) {
    
    if (n == 0) {
      return false;
    }
    if (n % 10 == 1) {
      return true;
    }
    return hasOne(n / 10);

  }

/* dividesSelf */
public boolean dividesSelf(int n) {
  
  for (int i = n; i != 0; i = i / 10) {
  
    if (i % 10 == 0) {
      return false;
    }
    if (n % (i % 10) != 0) {
      return false;
    }
  }
  return true;

}

}