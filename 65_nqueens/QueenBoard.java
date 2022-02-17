/*
Butterfingers: Melody Lew, Corina Chen, Fang Chen
APCS pd 06
HW65 -- How Many Queens Can a Thinker Place, If a Thinker Can Place Queens...
2022-02-17r
time spent: 1.0 hr
*/

public class QueenBoard
{

  private int[][] _board;

  public QueenBoard( int size ) //constructor
  {
    _board = new int[size][size];
    for (int col = 0; col < size; col++){
      for (int row = 0; row < size; row++){
        _board[row][col] = 0;
      }
    }
  }


  /***
   * precondition: board is filled with 0's only.
   * postcondition:
   * If a solution is found, board shows position of N queens,
   * returns true.
   * If no solution, board is filled with 0's,
   * returns false.
   */
   public boolean solve()
 {
   boolean isSolvable = solveH(0);
   // if (!isSolvable) {
   //   for (int c = 0; c < _board.length; c++){
   //     for (int r = 0; r < _board.length; r++){
   //       _board[r][c] = 0;
   //     }
   //   }
   // }
   return isSolvable;
 }


 /**
  *Helper method for solve.
  */
 private boolean solveH(int col)
 {
   if (col >= _board.length) {
     return true; // comes to end of all recursions;
   }
   for (int row = 0; row < _board.length; row++) {
     if (addQueen(row, col)) { // adds queen if no queen
       if (solveH(col + 1)) {
         return true;
       } // removes queen that crosses path
       removeQueen(row, col);
     }
   }
   return false;
  }


  public void printSolution()
  {
    /** Print board, a la toString...
        Except:
        all negs and 0's replaced with underscore
        all 1's replaced with 'Q'
    */
    String board = "";
    for (int row = 0; row < _board.length; row++){
      for (int col = 0; col < _board.length; col++){
        if (_board[row][col] <= 0){
          board += "_ ";
        }
        else{
          board += "Q ";
        }
      }
      board += "\n";
    }
    System.out.println(board);
 }



  //================= YE OLDE SEPARATOR =================

  /***
   * "adds" a Queen by setting the element at a fixed position on the board to
   1 and marking all positions (to the right of the Queen) the Queen can capture
   with by decreasing the elements ints by 1.
   * precondition: board populated with ints
   row, col are within board size
   * postcondition: updated board maked with 1 where the Queen is placed and
   a negative int where the Queen can capture to the right of her
   */
  private boolean addQueen(int row, int col)
  {
    if(_board[row][col] != 0){
      return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
      _board[row][col+offset]--;
      if(row - offset >= 0){
        _board[row-offset][col+offset]--;
      }
      if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
      }
      offset++;
    }
    return true;
  }


  /***
   * "removes" a Queen by replacing the 1 in a given position on the board with
   0 and unmarking capturable positions to the right of the removed Queen by
   increasing the ints by 1.
   * precondition: board populated with ints
   row, col are within board size
   * postcondition: updated board to remove the Queen (1 -> 0) and unmark the
   ints (+1) where the removed Queen marked initially (-1)
   */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
      return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
      _board[row][col+offset]++;
      if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
      }
      if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
      }
      offset++;
    }
    return true;
  }


  /***
   * Returns _board as a String
   * precondition: _board is populated with int values
   * postcondition: String with characters in rows and columns resembling a
   chess board
   */
  public String toString()
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        ans += _board[r][c]+"\t";
      }
      ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {
    // QueenBoard b = new QueenBoard(5);
    // System.out.println(b);
    // /** should be...
    //    0	0	0	0	0
    //    0	0	0	0	0
    //    0	0	0	0	0
    //    0	0	0	0	0
    //    0	0	0	0	0
    // */
    //
    // b.addQueen(3,0);
    // b.addQueen(0,1);
    // System.out.println(b);
    // /** should be...
    //    0	1	-1	-2	-1
    //    0	0	-2	0	0
    //    0	-1	0	-1	0
    //    1	-1	-1	-1	-2
    //    0	-1	0	0	0
    // */
    //
    // b.removeQueen(3,0);
    // System.out.println(b);
    // /** should be...
    //    0	1	-1	-1	-1
    //    0	0	-1	0	0
    //    0	0	0	-1	0
    //    0	0	0	0	-1
    //    0	0	0	0	0
    // */

    QueenBoard a = new QueenBoard(5);
    System.out.println(a.solve());
    System.out.println(a);
    a.printSolution();

  }

}//end class
