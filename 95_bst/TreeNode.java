// FIRE: Fang Chen, Courtney Huang, Brianna Tieu
// APCS pd06
// HW 95 -- Algorithm as Data Structure 
// 2022-05-09
// time spent: 0.5 hrs

/**
 * class TreeNode
 * SKELETON
 * Implements a node for use in a binary tree.
 * Only holds int cargo.
 */

public class TreeNode
{

  //instance variables / attributes of a TreeNode:
  private int _cargo;        //this node's data
  private TreeNode _lt, _rt; //pointers to left, right subtrees


  /**
   * default constructor
   * Construct a tree node with specified value,
   * with null left and right subtrees.
   */
  public TreeNode( int initValue )
  {
    _cargo = initValue;
  }


  /**
   * overloaded constructor
   * Construct tree node w specified value, left, and right subtrees.
   */
  public TreeNode( int initValue, TreeNode initLeft, TreeNode initRight )
  {
    this(initValue);
    _lt = initLeft;
    _rt = initRight;    
  }


  /**
   * Returns the left subtree of this node.
   */
  public TreeNode getLeft()
  {
    return _lt;
  }


  /**
   * Returns the right subtree of this node.
   */
  public TreeNode getRight()
  {
    return _rt;
  }


  /**
   * Returns the value stored in this tree node.
   */
  public int getValue()
  {
    return _cargo;
  }


  /**
   * Sets the value of the left subtree of this node.
   */
  public void setLeft( TreeNode theNewLeft )
  {
    _lt = theNewLeft;
  }


  /**
   * Sets the value of the right subtree of this node.
   */
  public void setRight( TreeNode theNewRight )
  {
    _rt = theNewRight;
  }


  /**
   * Sets the value of this tree node.
   */
  public void setValue( int theNewValue ) 
  {
    _cargo = theNewValue;
  }

}//end class
