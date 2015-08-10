

def countChange ( money: Int, coins: List[Int] ) : Int = {
  if (money == 0)                           1
  else if (money < 0)                       0
  else if (coins.isEmpty && money >= 1)     0
  else
    countChange(money, coins.tail) + countChange( money-coins.head,coins )
}



println(countChange(4,List(2,1,3)))

