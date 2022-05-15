public interface PriorityQueue {

  /**
   * void add(Object)
   * Adds an item to this priority queue
   */
  public void add(int x);

  /**
   * boolean isEmpty()
   * Returns true if this stack is empty
   */
  public boolean isEmpty();

  /**
   * Object peekMin()
   * Returns the smallest item stored in this priority 
   * queue without removing it
   */
  public int peekMin();

    /**
   * Object removeMin()
   * Removes and returns the smallest item stored in 
   * this priority queue.
   */
  public int removeMin();

}