package Basics

object Factorial extends App {

  def fact(n:Int):Int=
    {
      if (n==0 | n==1) 1
      else n* fact(n-1)
    }
    println(fact(4))
}
