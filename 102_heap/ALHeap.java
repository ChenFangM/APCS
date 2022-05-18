// FIRE -- Brianna Tieu, Courtney Huang, Fang Chen
// APCS pd06
// HW102 -- Heap On Heapin' On
// 2022-05-17
// time spent: 1.0 hrs

/**
 * class ALHeap
 * SKELETON
 * Implements a min heap using an ArrayList as underlying container
 */

 /*
 DISCO:
- Given x is an index of a given node,
  - the parent is located at (x - 1) / 2
  - the left child is located at 2x + 1
  - the right child is located at 2x + 2
 QCC:
 */

import java.util.ArrayList;

public class ALHeap
{

  //instance vars
  private ArrayList<Integer> _heap;

  /**
   * default constructor  ---  inits empty heap
   */
  public ALHeap()
  {
    _heap = new ArrayList<Integer>();
  }



  /**
   * toString()  ---  overrides inherited method
   * Returns either
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   */
  public String toString()
  {
    String ret = "[";
    for (int i : _heap) {
      ret += i + " ";
    }
    ret = ret.substring(0, ret.length() - 1) + "]";
    return ret;
  }//O(?)


  /**
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   */
  public boolean isEmpty()
  {
    return _heap.size() == 0;
  }//O(1)


  /**
   * Integer peekMin()
   * Returns min value in heap
   * Postcondition: Heap remains unchanged.
   */
  public Integer peekMin()
  {
    return _heap.get(0);
  }//O(1)


  /**
   * add(Integer)
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   * ALGO:
   * 1) Add addVal to the end of the ArrayList
   * 2) While addVal is less than its parent, swap addVal and its parent in
   *    the array. (The parent's position is given by addVal's index minus 1
   *    divided by 2.)
   */
  public void add( Integer addVal )
  {
    _heap.add( addVal );
    while (addVal < _heap.get( ( _heap.indexOf( addVal ) - 1) / 2) ) {
      swap( _heap.indexOf(addVal), ( _heap.indexOf( addVal ) - 1) / 2 );
    }
  }//O(log n)

  /**
   * removeMin()  ---  means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   * ALGO:
   * 1) Overwrite root with lowest leaf
   * 2) Sift leaf down the tree
   */
   public Integer removeMin()
   {
     if (_heap.size() == 0){
       return null;
     }
     if (_heap.size() == 1){
       return _heap.remove(0);
     }
     Integer pop = _heap.get(0);
     _heap.set(0, _heap.size()-1);
     _heap.remove(_heap.size()-1);
     int moo = 0;
     while (minChildPos(moo) != -1){
       swap(moo, minChildPos(moo));
       moo = minChildPos(moo);
     }
     return pop;
   }//O(?)


  /**
   * minChildPos(int)  ---  helper fxn for removeMin()
   * Returns index of least child, or
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   */
  private int minChildPos( int pos )
  {
    if ( 2 * pos + 1 < _heap.size() && 2 * pos + 2 < _heap.size() ) {
      if ( (_heap.get( 2 * pos + 1 )) < ( _heap.get( 2 * pos + 2 )) ) {
        return 2 * pos + 1; //if left child is less, return left
      } else {
        return 2 * pos + 2;//else, return right child
      }
    }
    else if ( (2 * pos + 1)  < _heap.size()) { //only left child
      return 2 * pos + 1;
    } else if ( (2 * pos + 2) < _heap.size()) { //only right child
      return 2 * pos + 2;
    } else {
      return -1; //no other conditions met, return -1
    }
  }//O(?)


  //~~~~~~~~~~~~~ aux helper fxns ~~~~~~~~~~~~~~
  private Integer minOf( Integer a, Integer b )
  {
    if ( a.compareTo(b) < 0 )
      return a;
    else
      return b;
  }

  //swap for an ArrayList
  private void swap( int pos1, int pos2 )
  {
    _heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  //main method for testing
  public static void main( String[] args )
  {
      ALHeap pile = new ALHeap();

      pile.add(2);
      System.out.println(pile);
      pile.add(4);
      System.out.println(pile);
      pile.add(6);
      System.out.println(pile);
      pile.add(8);
      System.out.println(pile);
      pile.add(10);
      System.out.println(pile);
      pile.add(1);
      System.out.println(pile);
      pile.add(3);
      System.out.println(pile);
      pile.add(5);
      System.out.println(pile);
      pile.add(7);
      System.out.println(pile);
      pile.add(9);
      System.out.println(pile);

      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class ALHeap