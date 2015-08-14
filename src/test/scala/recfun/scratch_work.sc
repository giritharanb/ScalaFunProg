type Set = Int => Boolean
def contains(s: Set, elem: Int): Boolean = s(elem)
//def singletonSet(elem: Int): Set = elem


// FROM WEEK 2-2
def sum(f: Int => Int, a: Int, b: Int): Int =
  if (a > b) 0
  else f(a) + sum(f, a + 1, b)
def sumInts(a: Int, b: Int) =  sum(id, a, b)
def sumCubes(a: Int, b: Int) = sum(cube, a, b)
def sumFactorials(a: Int, b: Int) = sum(fact, a, b)
def id(x: Int): Int = x
def cube(x: Int): Int = x * x * x
def fact(x: Int): Int =
  if (x == 0)   1
  else          x*fact(x - 1)
//print (sumCubes(5,5))
//print (sumFactorials(4,5))

// ANONYMOUS FUNCTIONS
def sumIntsAnonymous(a: Int, b: Int) =
  sum(x => x, a, b)
def sumCubesAnonymous(a: Int, b: Int) =
  sum(x => x * x * x, a, b)
print (sumIntsAnonymous(5,5))


/*
Write a product function that calculates the product of the
  values of a function for the points on a given interval.
2. Write factorial in terms of product.
3. Can you write a more general function, which generalizes both
sum and product?
*/
def prod ( s:Int, f:Int) :Int = {
  if ( s==f )       s
  else              f*prod(s,f-1)
}
def factUsingProd ( n:Int ) : Int = prod (1,n)
print ( factUsingProd(6))


def sum(f: Int => Int): (Int, Int) => Int = {
  def sumH(a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sumH(a + 1, b)
  sumH
}
def sumIntsShort = sum(x => x)
def sumCubesShort = sum(x => x * x * x)
def sumFactorialsShort = sum(fact)

print( sumCubesShort(1, 3) + sumFactorialsShort(4, 6) )










