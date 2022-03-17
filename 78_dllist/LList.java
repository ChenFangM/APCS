// (FA)FSA: Fang, Sophia, Ammer
// APCS pd06
// HW78 -- Double Up
// 2022-03-17
// time spent: .5 hrs

/*

DISCO
-
QCC

*/

/***
 * class LList
 * Implements a linked list of DLLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private DLLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = null; //at birth, a list has no elements
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    DLLNode tmp = _head;
    tmp.setPrev( new DLLNode( null, newVal, tmp ) );
    _head = tmp.getPrev();
    _size++;
    return true;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    String retVal;
    DLLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //check target node's cargo hold
    retVal = tmp.getCargo();
    return retVal;
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    DLLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //store target node's cargo
    String oldVal = tmp.getCargo();

    //modify target node's cargo
    tmp.setCargo( newVal );

    return oldVal;
  }

  public void add(int index, String newVal)
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    DLLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index - 1; i++ )
      tmp = tmp.getNext();

    tmp.setNext( new DLLNode( tmp, newVal, tmp.getNext() ) );
    tmp = tmp.getNext();
    tmp.getNext().setPrev(tmp);
    _size ++;
  }

  public String remove(int index)
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    DLLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index - 1; i++ )
      tmp = tmp.getNext();

    String oldVal = tmp.getNext().getCargo();
    tmp.setNext(tmp.getNext().getNext());
    _size --;

    return oldVal;
  }


  //return number of nodes in list
  public int size() { return _size; }

  //--------------^  List interface methods  ^--------------


  // override inherited toString
  public String toString()
  {
    String retStr = "HEAD->";
    DLLNode tmp = _head; //init tr
    while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
    }
    retStr += "NULL";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();

    System.out.println( james );

    james.add("beat");

    james.add("a");

    james.add("need");

    james.add("I");

    james.set( 1, "got" );

    System.out.println( james );
    System.out.println( james.size() );

    james.add( 3, "blah" );

    System.out.println( james );
    System.out.println( james.size() );

    james.remove( 3 );

    System.out.println( james );
    System.out.println( james.size() );
  }

}//end class LList
