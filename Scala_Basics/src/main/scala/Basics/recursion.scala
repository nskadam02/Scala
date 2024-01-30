package Basics

import scala.annotation.tailrec

object recursion extends App{

//  def fact(n: Int): Int = {
//    if (n == 0 | n == 1) 1
//    else
//      {
//        println("Computing fact of "+n+ "first need fact of "+(n-1))
//        val res :Int= n * fact(n - 1)
//        println("Compiled fact of "+n)
//        res
//      }
//
//  }
//
//  println(fact(10))

  def anotherFactorial (n:Int):BigInt= {
    @tailrec
    def factHelp(x: Int, accumlator: BigInt): BigInt = {
      if (x <= 1) accumlator
      else factHelp(x - 1, x * accumlator)   // we use this as our expression
       // Tail recursion
    }
    factHelp(n,1)
  }
  println(anotherFactorial(1000))

  // WHEN you need loops , Use Tail recursion
}
