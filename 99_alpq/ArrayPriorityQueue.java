import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {

  ArrayList<Integer> _guillotine;

  public ArrayPriorityQueue() {
    _guillotine = new ArrayList<Integer>();
  }

  /**
   * void add(Object)
   * Adds an item to this priority queue
   */
  public void add(Integer x) {
    if (isEmpty()) {
      _guillotine.add(x);
      return;
    }
    Integer index = _guillotine.size() - 1;
    while (_guillotine.get(index) < x) {
      index ++;
    }
    _guillotine.add(index + 1, x);
  }

  /**
   * boolean isEmpty()
   * Returns true if this stack is empty
   */
  public boolean isEmpty() {
    return _guillotine.size() == 0;
  }

  /**
   * Object peekMin()
   * Returns the smallest item stored in this priority 
   * queue without removing it
   */
  public Integer peekMin() {
    return _guillotine.get(0);
  }

    /**
   * Object removeMin()
   * Removes and returns the smallest item stored in 
   * this priority queue.
   */
  public Integer removeMin() {
    return _guillotine.remove(0);
  }

// HAHAHAHAHAHAHA
  public String toString() {
    String s = "";
    for (int i = 0; i < _guillotine.size(); i++) {
      s += _guillotine.get(i) + ", ";
    }
    return s;
  }

// HEHEHEHEHEHEHE

  public static void main(String[] args) {

    ArrayPriorityQueue chopper = new ArrayPriorityQueue();
    chopper.add(4);
    chopper.add(9);
    chopper.add(7);
    System.out.println(chopper);
    chopper.add(20);
    chopper.add(1);
    chopper.add(3);
    chopper.add(9);
    chopper.removeMin();
    System.out.println(chopper);

  }

}