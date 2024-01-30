package Basics

object defaultArg extends App{


  // deafult parameters should be at last
  // pass every lead argument
  // name args
  def trFact(n:Int ,acc:Int = 1): Int = {
    if (n<=1) acc
    else trFact(n-1,n*acc)
  }



}
