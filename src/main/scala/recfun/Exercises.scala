package recfun

object Exercises {

  def main(args: Array[String]): Unit = {
    println( "Hello", factorialTail(5))
    }

  def factorial(n: Int): Int =
    if  (n == 0) 1
    else         n * factorial(n - 1)


  def factorialTail(n:Int)= {
    def factorialHelper (n:Int, acc:Int) :Int = {
      if (n == 0)       acc
      else              factorialHelper(n-1, n*acc)
    }
    factorialHelper(n, 1)
  }

}