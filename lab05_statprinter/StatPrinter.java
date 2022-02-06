// Butterfingers: Melody Lew, Corina Chen, Fang Min Chen
// APCS pd6
// L05 -- pulling it together
// 2022-02-07m
// time spent: 2.0 hrs

import java.util.ArrayList;

public class StatPrinter
{
  // instance variable for frequencies of each integer in input ArrayList
  private ArrayList <Integer> _frequency;


  //*************** QUESTION 02 **************************
  //precond:  data.size() > 0, each entry b/t 0,100 inclusive
  //postcond: _frequency.size() set to max(data) + 1
  //          _frequency.get(i) returns frequency of i in data
  //eg, for data [2,3,2,5,2,3]
  //  _frequency would be [0,0,3,2,0,1]
  public StatPrinter( ArrayList <Integer> data )
  {
    _frequency = new ArrayList <Integer>();
    for (int i = 0; i<=max(data); i++){
      _frequency.add(0);
    }
    for (Integer j : data){
      _frequency.set(j,_frequency.get(j)+1);
    }
  } //big O notation: O(n)


  //*************** QUESTION 01 **************************
  //precond:  data.size() > 0
  //postcond: returns largest integer in data
  public Integer max( ArrayList <Integer> data )
  {
    Integer currentMax = 0;
    for (int i = 0; i<data.size(); i++){
      if (data.get(i).compareTo(currentMax)>0){
        currentMax = data.get(i);
      }
    }
    return currentMax;
  } //big O notation: O(n)


  //*************** QUESTION 03 **************************
  //postcond: returns true if i > 0 and i < _frequency.size() - 1
  //          and _frequency.get( i - 1 ) < _frequency.get( i )
  //          and _frequency.get( i + 1 ) < _frequency.get( i )
  //          Otherwise, returns false
  //eg, for _frequency [1,2,1,5,5,8,2,4]
  //    2 and 8 are local modes, so
  //    isLocalMode(0) -> false
  //    isLocalMode(1) -> true
  //    isLocalMode(5) -> true
  public boolean isLocalMode( int i )
  {
    return (i > 0 && i < _frequency.size() - 1
    && _frequency.get( i - 1 ).compareTo(_frequency.get( i )) < 0
    && _frequency.get( i + 1 ).compareTo(_frequency.get( i )) < 0);
  } //big O notation: O(1)


  //*************** QUESTION 04 **************************
  //postcond: returns list of modes in _frequency
  public ArrayList<Integer> getLocalModes()
  {
    ArrayList<Integer> mode = new ArrayList<Integer>();
    for (int i = 0; i < _frequency.size(); i++){
      if (isLocalMode(i)){
        mode.add(_frequency.get(i));
      }
    } return mode;

  } //big O notation: O(n)


  //*************** QUESTION 05 **************************
  //precond:  longestBar > 0
  public void printHistogram( int longestBar )
  {
    int factor = longestBar / (max(_frequency));
    for (int i = 0; i < _frequency.size(); i++){ //y-axis
      System.out.print("\n" + i + " : ");
      for (int j = 0; j < _frequency.get(i)*factor; j++){
        System.out.print("*");
      }
    } System.out.println();
  } //big O notation: O(n^2)

}//end class StatPrinter
