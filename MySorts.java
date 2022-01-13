import java.util.ArrayList;

public class MySorts {

/*	Bubble Sort
	ALGO:
	0) (Begin at index 0) Compare the element at index with the element at index+1 and swap the two if the latter is greater
 	1) Repeat with index+1 as index
 	2) Traverse the list arraylength-1 times
*/

	public void bubbleSort(ArrayList<Comparable> data) {

		for( int passCtr = 1; passCtr < data.size(); passCtr++ ) {

		    //iterate thru first to next-to-last element, comparing to next
		    for( int i = 0; i < data.size()-1; i++ ) {

	        	//if element at i > element at i+1, swap
	        	if ( data.get(i).compareTo(data.get(i+1) ) > 0 )
		        data.set( i, data.set(i+1,data.get(i)) );

	      	}

    	}

	}

/* 	Selection Sort
	ALGO:
	0) Find the smallest number in the array and move it to the end.
	1) Find the next smallest in the array and move it to next-to-end.
	2) Repeat until there are no more swaps.
*/

	public void selectionSort(ArrayList<Comparable> data) {

		//maxPos will point to position of SELECTION (greatest value)
    	int maxPos;

	    for( int pass = data.size()-1; pass > 0; pass-- ) {

		    maxPos = 0;
		    
		    for( int i = 1; i <= pass; i++ ) {
		        if ( data.get(i).compareTo( data.get(maxPos) ) > 0 )
		          maxPos = i;
		    }
		    
		    data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
    	
    	}

	}

/*	Insertion Sort
	ALGO:
	0) Use the "partition" to create sorted and unsorted areas of the array.
   	1) Expand the partition by one element at a time.
   	2) Compare the element at the index of the partition with the preceding ones,
      swapping as necessary.
   	3) Repeat steps 1-2 until the array is fully sorted.

*/

	public void insertionSort(ArrayList<Comparable> data) {

		for( int partition = 1; partition < data.size(); partition++ ) {
      	//partition marks first item in unsorted region

	      	//traverse sorted region from right to left
	      	for( int i = partition; i > 0; i-- ) {

		        // "walk" the current item to where it belongs
		        // by swapping adjacent items
		        if ( data.get(i).compareTo( data.get(i-1) ) < 0 ) {
		        	data.set( i, data.set( i-1, data.get(i) ) );
		        } else {
		        	break;
		        }

		    }

		}
    }

}