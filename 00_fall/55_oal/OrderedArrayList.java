// Mykolyk -- Brianna Tieu and Fang Chen
// APCS pd06
// HW55 -- Never Fear, Big Oh Is Here!
// 2021-01-11

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 *
 * typed for Integers
 *
 * ArrayList spec at
 * https://www2.cs.duke.edu/csed/ap/subset/doc/ap/java/util/ArrayList.html
 **********************************************/

/**********************************************
 * DISCO
 * 0: Big Oh is quite useful to consider when optimizing your code, making 
 * sure it runs under all reasonable conditions and to compare efficiencies. 
 * 1: All O(1) methods in OrderedArrayList are data-insensitive, but certainly
 * not the other way around.
 * 
 * QCC
 * 0: Should we strive to write data-sensitive (efficiency for low n) or 
 * data-insensitive (more consistency) code?
 **********************************************/

import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;


  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
    _data = new ArrayList<Integer>();
  }


  //pass-tru functionality
  /*
    - No best or worst case -- data-insensitive
    - O(n) / linear runtime -- elements added to the string one by one, the
    longer the Arraylist, the more elements that need to be appended
  */
  public String toString()
  {
    return _data.toString();
  }


  //pass-tru functionality
  /*
    - Best Case -- The element that is removed is at the end of the array, so
    there is no need to shift -> O(1) or constant
    - Worst Case -- The element is not at the end, requiring a shift of all
    elements to the left. All elements are copied one by one into temporary
    array, so the bigger the array, the longer time to copy -> O(n) or linear
  */
  public Integer remove( int index )
  {
    return _data.remove(index);
  }


  //pass-tru functionality
  /*
    - No best or worst case -- data-insensitive
    - O(1) / constant runtime -- size simply returns # of meaningful elements,
    runtime doesn't change as array size changes, only one operation required
  */
  public int size()
  {
    return _data.size();
  }


  //pass-tru functionality
  /*
    - No best or worst case -- data-insensitive
    - O(1) / constant runtime -- get returns an element at a specified index,
    the size should not affect the runtime, only one operation required
  */
  public Integer get( int index )
  {
    return _data.get(index);
  }


  //modified functionality
  //insert at appropriate location to maintain sortedness
  /*
    - No best or worst case -- data-insensitive
    - O(1) / constant runtime -- appends the desired int to the end of the
    array, only performs one operation
  */
  public boolean add( Integer newVal )
  {
    addLinear(newVal);
    //addBinary(newVal);
    return true;
  }


  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  /*
    - No best or worst case -- data-insensitive b/c the index must always be
    found linearly
    - O(n) / linear runtime -- each element must be compared to input newVal,
    the longer the array, the longer amount of time that is required to find
    the appropriate index for newVal
  */
  public void addLinear(Integer newVal)
  {
    for( int p = 0; p < _data.size(); p++ ) {
      if ( newVal.compareTo( _data.get(p) ) < 0 ) {
        //newVal < oal[p]
        _data.add( p, newVal );
        return; //Q:why not break?
      }
    }
    _data.add( newVal ); //newVal > every item, so add to end
  }


  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  /*
    - Best Case -- The appropriate index for newVal is in the middle of the
    array. This is the best case b/c addBinary always searches in the middle
    first.
    - Worst Case -- The appropriate index for newVal is 0. This is b/c the index
    is at the beginning of the array, which will take binary search the longest
    to find (as long as the array has an odd # of elements). Then, b/c the
    index is 0, everything must be shifted to the right, making it the worst
    case.
    - O(n) / linear runtime -- addBinary implements binary search, which has
    a logarithmic runtime and method add, with O(n) runtime. O(n) overpowers
    logarithmic runtime. 
  */
  public void addBinary(Integer newVal)
  {
    //initialize high, low, midpt indices
    int lo = 0;
    int med = 0;
    int hi = _data.size()-1;

    while ( lo <= hi ) { //running until target is found or bounds cross

      med = (lo + hi) / 2;
      int x = _data.get(med).compareTo( newVal );

      if ( x == 0 ) {
        //equal value found, insert here
        _data.add( med, newVal );
        return;
      }
      else if ( x > 0 )
        //newVal < med, so look at lower half of data
        hi = med - 1;
      else
        //newVal > med, so look at upper half of data
        lo = med + 1;
    }
    // If you made it this far, newVal is not present.
    // So insert at lo.
    _data.add( lo, newVal );
    //Q: How do you know lo is correct insertion index?
  }


  // main method solely for testing purposes
  public static void main( String[] args )
  {

    OrderedArrayList franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ )
      franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( franz );

    // testing binary search
    franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( franz );

    /*-----v-------move-me-down-----------------v--------
      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList