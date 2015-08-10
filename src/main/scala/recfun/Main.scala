package recfun

import common._

object Main {
  def main(args: Array[String]) {


    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + "  ")
      println()
    }
    //println(pascal(0,0))
    //println("\n1,1",pascal(1,1))
    //println(pascal(0,0))

  }

  /**  Exercise 1 */
  def pascal ( col:Int, row:Int ):Int =
  {
    if ((row == 0)  || (col==0))  {
      //def myStr = "ROW-0 [%d,%d]".format( row, col);  println (myStr)
      1
    }
    else if ((row==1) && ((col==0) || (col==1)))
    {
      //def myStr = "ROW-1 [%d,%d]".format( row, col);println (myStr)
      1
    }
    else if (row<=col)
    {
      //def myStr = "[%d,%d]".format( row, col)  ;print (myStr)
      1
    }
    else {
      //def myStr = "[%d,%d]".format( row, col); print (myStr)
      pascal(col-1,row-1) + pascal (col,row-1)
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean =  { false }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = 20
}
