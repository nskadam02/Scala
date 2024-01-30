package Basics

import scala.annotation.tailrec

object fibonacci extends App{
  def fibonacci( n:Int):Int={
    if (n<=2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }
  println(fibonacci(12))


  @tailrec
  def fibonacciTailrec(n: Int , last :Int , nextLast:Int): Int = {
    if (n <= 2) last
    else fibonacciTailrec(n-1 ,last+ nextLast,last)
  }

  println(fibonacciTailrec(12,1,1))
}

// 8

//1 1 2 3 5 8 13 21
//
//fibonacci(7,2,1)
//(6,3,2)
//(5,5,3)
//(4,8,5)
//(3,13,8)
//(2,21,13)

