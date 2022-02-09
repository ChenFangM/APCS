/*  Butterfi {Fang Chen, Corina Chen}
    apcs pd06
    HW 61 -- mergesort
    2022-02-09
    time spent:
*/

/***
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:
  Given an array, split the array into two arrays.
  Until all the sub-arrays have a length of 1...
    For each of the sub-arrays, (recursively call the method again) split them
    into two arrays as well
  Merge the subarrays from the previeous recursions until the original array
  is returned sorted.

***/

/***
  DISCO
  0: merge() can be coded recursively

  QCC
  0: How can we write merge() iteratively?
  1: What is the time complexity of this algorithm?
  1.1: Is this more or less efficient than bubbleSort, selectionSort, and
      insertionSort?

***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int[] c = new int[a.length + b.length];
    int aInd = 0;
    int bInd = 0;
    int cInd = 0;
    int aVal = 0;
    int bVal = 0;

    while (cInd < c.length) { // while c not populated

      if (aInd == a.length) {
        aVal = b[bInd] + 1; // to make sure comparison with b[bInd] is always >
      } else {
        aVal = a[aInd];
      }

      if (bInd == b.length) {
        bVal = a[aInd] + 1; // to make sure comparison with a[aInd] is always >
      } else {
        bVal = b[bInd];
      }

      if (aVal < bVal) {
        c[cInd] = aVal;
        aInd ++;
        cInd ++;
      } else {
        c[cInd] = bVal;
        bInd ++;
        cInd++;
      }

    } // ending while

    return c;
  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {
    int[] arr1 = new int[arr.length / 2];
    int[] arr2 = new int[arr.length - arr1.length];

    if (arr.length == 1) {
      return arr;
    }

    for (int i = 0; i < arr1.length; i ++) {
      arr1[i] = arr[i];
    }
    arr1 = sort(arr1);

    for (int i = 0; i < arr2.length; i ++) {
      arr2[i] = arr[i + arr1.length];
    }
    arr2 = sort(arr2);


    return merge(arr1, arr2);
  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays ploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {
      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );

      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );

      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );

      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
