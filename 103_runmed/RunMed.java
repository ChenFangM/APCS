// FIRE: Brianna Tieu, Courtney Huang, Fang Chen
// APCS pd06
// HW103: Erica's Friends, Hugo, and The One in the Middle
// 2022-05-18
// time spent: 0.7 hrs

import java.util.NoSuchElementException;

public class RunMed {

  private ALHeapMax lilVals;
  private ALHeapMin bigVals;

  public RunMed() {
    lilVals = new ALHeapMax();
    bigVals = new ALHeapMin();
  }

  public Integer getMedian() {
    if (lilVals.size() == 0 && bigVals.size() == 0) {
      //if both are empty, no median can be calculated
      throw new NoSuchElementException("no median found");
    }
    else if (lilVals.size() == bigVals.size()) {
      //if they are equal, the mean of roots is the median
      return (lilVals.peekMax() + bigVals.peekMin()) / 2;
    }
    else if (lilVals.size() > bigVals.size()) {
      //if unequal size, larger heap's root is median, lilVals is larger
      return lilVals.peekMax();
    }
    else {
      //bigVals is larger, return its root
      return bigVals.peekMin();
    }
  }

  public void add(Integer newVal) {
    //adds element to a heap if both are empty, avoids null error
    if (lilVals.size() == 0 && bigVals.size() == 0) {
      lilVals.add(newVal);
      return;
    }
    //if value is less than maxheap root, add to maxheap
    else if (newVal < lilVals.peekMax()) {
      lilVals.add(newVal);
    } else {
      bigVals.add(newVal);
    }

  //balances heaps if there is a height difference greater than or equal to 2
    if (bigVals.size() - lilVals.size() >= 2 || lilVals.size() - bigVals.size() >= 2) {
      if (lilVals.size() > bigVals.size()) {
        while (lilVals.size() - bigVals.size() >= 2) {
          bigVals.add(lilVals.removeMax());
        }
      } else if (bigVals.size() > lilVals.size()) {
        while (bigVals.size() > lilVals.size()) {
          lilVals.add(bigVals.removeMin());
        }
      } else {return;}
    }
  }

  }