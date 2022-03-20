// Mykolyk {Fang, Brianna, Weichen}
// APCS pd06
// HW53 -- implementing insertion sort
// 2022-01-06r
// time spent: 1 hr

/******************************
 * class InsertionSort -- implements InsertionSort algorithm
 *
 * ALGO:
 * 0: Use the "partition" to create sorted and unsorted areas of the array.
   1: Expand the partition by one element at a time.
   2: Compare the element at the index of the partition with the preceding ones,
      swapping as necessary.
   3: Repeat steps 1-2 until the array is fully sorted.
 * DISCO
 * 0: We can understand InsertionSort not only through Thinkeren being sorted by
     	height, but also through Romanian folk dance.
 * QCC
 * q0: How many passes to sort n elements?
 * a0: n-1 passes
 * q1: What do you know after pass p?
 * a1: We know that all elements of indices p-1 and less are correctly sorted.
 * q2: How will you know when sorted?
 * a2: The array is sorted once the partition reaches the end of the array.
 * q3: What constitues a pass?
 * a3: A pass is defined by the movement of a partition by one element to the
       right and the elements before the partition being correctly sorted.
 * q4: What must you track?
 * a4: We must track the movement of the partition.
 ******************************/


import java.util.ArrayList;

public class InsertionSort
{
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of InsertionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void insertionSortV( ArrayList<Comparable> data )
  {
    for( int partition = 0 ; partition < data.size() ; partition ++ ) {
      //partition marks first item in unsorted region

      System.out.print( "\npartition: " + partition + "\tdataset: "); //diag
      System.out.println( data );

      //traverse sorted region from right to left
      for( int i = partition ; i > 0 ; i -- ) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( (data.get(i)).compareTo(data.get(i-1)) < 0  ) {

          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          data.set(i-1, data.set(i, data.get(i-1)));

        } else {
        	break;
        }
      }
    }
  }//end insertionSortV


  // ArrayList-returning insertionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable>
    insertionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    insertionSortV( data );

    //return working ArrayList
    return data;
  }//end insertionSort


  public static void main( String [] args )
  {
    /*===============for VOID methods=============
      System.out.println("\n*** Testing sort-in-place (void) version... *** ");
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "\nArrayList glen before sorting:\n" + glen);
      insertionSortV(glen);
      System.out.println( "\nArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList coco before sorting:\n" + coco );
      insertionSortV(coco);
      System.out.println( "\nArrayList coco after sorting:\n" + coco );
      ============================================*/

      System.out.println( "*** Testing non-void version... *** " );
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "\nArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = insertionSort( glen );
      System.out.println( "\nsorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "\nArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = insertionSort( coco );
      System.out.println( "\nsorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "\nArrayList coco after sorting:\n" + coco );
    /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class InsertionSort