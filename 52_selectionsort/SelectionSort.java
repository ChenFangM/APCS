// Mykolyk {Fang Chen, Brianna Tieu, Cat, Pepe}
// APCS pd06
// HW52 -- implementing selection sort
// 2022-01-05w
// time spent: 1 hrs

/******************************
 * class SelectionSort -- implements SelectionSort algorithm
 *
 * ALGO:
 * 0: Find the smallest number in the array and move it to the end.
 * 1: Find the next smallest in the array and move it to next-to-end.
 * 2: Repeat until there are no more swaps.
 * 
 * DISCO:
 * 0: Selection sorting works regardless of whether you choose to start from the smallest
 *    values or the largest values. Note: Our algo uses the smallest values, but we
 *    ended up coding with the largest.
 * 1: The AL-returning method is useful for when we want to create an ordered copy of the 
 *    AL without changing the orignal AL.
 * 
 * QCC
 * q0: How many passes to sort n elements?
 * a0: array.length - 1
 * q1: What do you know after pass p?
 * a1: You know that all elements of index p-1 and less are correctly sorted.
 * q2: How do you know if sorted?
 * a2: We know that the array is sorted if every element has been swapped at least once.
 * q3: What does a pass boil down to?
 * a3: A pass boils down to moving the next smallest number into the next smallest index.
 ******************************/


import java.util.ArrayList;

public class SelectionSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi )
  {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;

    for(int pass = data.size() - 1; pass > 0; pass --) {
      System.out.println( "\nbegin pass " + (data.size() - pass) );//diag
      maxPos = 0;

      for(int i = 0; i <= pass; i ++) {
        if ((data.get(i)).compareTo(data.get(maxPos)) > 0) {
          maxPos = i;
        }
      }

      System.out.println( "maxPos: " + maxPos );//diag
      System.out.println( data );//diag

      data.set(pass, data.set( maxPos, data.get(pass) ) );

      System.out.println( "after swap: " +  data );//diag
    }
  }//end selectionSort


  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    return data;
  }//end selectionSort


  public static void main( String [] args )
  {
      /*===============for VOID methods=============

      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "\nArrayList glen before sorting:\n" + glen );
      selectionSortV(glen);
      System.out.println( "\nArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList coco before sorting:\n" + coco );
      selectionSortV(coco);
      System.out.println( "\nArrayList coco after sorting:\n" + coco );
    
      ============================================*/

      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "\nArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = selectionSort( glen );
      System.out.println( "\nsorted version of ArrayList glen:\n"
        + glenSorted );
      System.out.println( "\nArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = selectionSort( coco );
      System.out.println( "\nsorted version of ArrayList coco:\n"
        + cocoSorted );
      System.out.println( "\nArrayList coco after sorting:\n" + coco );
    
      /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class SelectionSort
