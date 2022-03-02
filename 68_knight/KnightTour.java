// Butterfinger: Melody Lew, Fang Min Chen, Corina Chen
// APCS pd6
// HW68 -- recursively probing for a closed cycle
// 2022-03-01w
// time spent: 1 hrs

/***
 * ALGO
 * With a starting position of the knight, moving in every possible position the
 * knight can go, recursively. Possible combinations "branch" out until a branch
 * is deemed not a winning combination in which case, the move is retracted --
 * replaced by a 0.
 *
 * DISCO
 * 0: You could write two classes in one java file!
 * 1: Recalling a function in itself multiple times consecutively is really neat
 * for branching because if the recursions previously called yield no result,
 * it just tries the next possible choice without having to write a "go back"
 * method.
 *
 * QCC
 * 0: Is starting at the corner of the board always ideal? Why?
 *
 * Mean execution times for boards of size n*n: (no delay)
 * n=5   __s    across __ executions
 * n=6   __s    across __ executions
 * n=7   __s    across __ executions
 * n=8   __s    across __ executions
 *
 * POSIX PROTIP: to measure execution time from BASH, use time program:
 * $ time java KnightTour 5
 *
 ***/


import java.io.*;
import java.util.*;


public class KnightTour
{
  public static void main( String[] args )
  {
    int n = 8;

    try {
      n = Integer.parseInt( args[0] );
    } catch( Exception e ) {
      System.out.println( "Invalid input. Using board size "
                          + n + "..." );
    }

    TourFinder tf = new TourFinder( n );

    //clear screen using ANSI control code
    System.out.println( "[2J" );

    //display board
    System.out.println( tf );

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for fixed starting location, use line below:
    tf.findTour( 2, 2, 1 );
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for random starting location, use lines below:
    //int startX = //YOUR MATH CONSTRUCT FOR GENERATING A RANDOM LEGAL X VALUE
    //int startY = //YOUR MATH CONSTRUCT FOR GENERATING A RANDOM LEGAL X VALUE
    //tf.findTour( startX, startY, 1 );   // 1 or 0 ?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // PUSHING FARTHER...
    // Systematically attempt to solve from every position on the board?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  }//end main()

}//end class KnightTour


class TourFinder
{
  //instance vars
  private int[][] _board;
  private int _sideLength; //board has dimensions n x n
  private boolean _solved = false;

  //constructor -- build board of size n x n
  public TourFinder( int n )
  {
    _sideLength = n;

    //init 2D array to represent square board with moat
    _board = new int[n+4][n+4];

    //SETUP BOARD --  0 for unvisited cell
    //               -1 for cell in moat
    //---------------------------------------------------------
    for (int i = 0; i < _board.length; i++) {
      // listing out everywhere that has to be -1
      _board[0][i] = -1;
      _board[1][i] = -1;
      _board[i][0] = -1;
      _board[i][1] = -1;
      _board[i][n + 2] = -1;
      _board[i][n + 3] = -1;
      _board[n + 2][i] = -1;
      _board[n + 3][i] = -1;
    }
    //---------------------------------------------------------

  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, then press ESC
    //emacs shortcut: M-x quoted-insert, then press ESC

    int i, j;
    for( i=0; i < _sideLength+4; i++ ) {
      for( j=0; j < _sideLength+4; j++ )
        retStr = retStr + String.format( "%3d", _board[j][i] );
      //"%3d" allots 3 spaces for each number
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void findTour(int x,int y,int moves) -- use depth-first w/ backtracking algo
   * to find valid knight's tour
   * @param x      starting x-coord
   * @param y      starting y-coord
   * @param moves  number of moves made so far
   **/
  public void findTour( int x, int y, int moves )
  {
    delay(0); //slow it down enough to be followable

    //if a tour has been completed, stop animation
    if ( _solved == true ) System.exit(0);

    //primary base case: tour completed
    if ( moves == _board.length * _board.length ) { //start from 1
      _solved = true;
      System.out.println( this ); //refresh screen
      return;
    }
    //other base case: stepped off board or onto visited cell
    if ( _board[x][y] != 0 ) {
      return;
    }
    //otherwise, mark current location
    //and recursively generate tour possibilities from current pos
    else {

      //mark current cell with current move number
      _board[x][y] = moves; //numbering the moves as the path

      System.out.println( this ); //refresh screen

      //delay(1000); //uncomment to slow down enough to view

      /******************************************
       * Recursively try to "solve" (find a tour) from
       * each of knight's available moves.
       *     . e . d .
       *     f . . . c
       *     . . @ . .
       *     g . . . b
       *     . h . a .
      ******************************************/
      //let's just bash - list out all possible ways the knight can move
      findTour(x+1, y+2, moves+1);
      findTour(x+1, y-2, moves+1);
      findTour(x+2, y+1, moves+1);
      findTour(x+2, y-1, moves+1);
      findTour(x-1, y+2, moves+1);
      findTour(x-1, y-2, moves+1);
      findTour(x-2, y+1, moves+1);
      findTour(x-2, y-1, moves+1);

      //If made it this far, path did not lead to tour, so back up...
      // (Overwrite number at this cell with a 0.)
      _board[x][y] = 0;

      System.out.println( this ); //refresh screen
    }

  }//end findTour()

}//end class TourFinder
