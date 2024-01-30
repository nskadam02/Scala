package Basics

import scala.annotation.tailrec

object Functions extends App{

  def  aFunction (a:String , b:Int) =
    {
      a+ " "+ b
    }
    println(aFunction("Helo",3))

  def aParameterless():Int = 42 // we can call withut ()
  println(aParameterless)
  println(aParameterless())

  def aRepeatedFunction(aString : String , n:Int):String=
    {
      if (n==1) aString
      else aString+ aRepeatedFunction(aString, n-1)
    }

  println(aRepeatedFunction("Hello",3))

  // WHEN you need loops use recursion
  //return type is mndatory for recursive function

  def aFuntionwithSideEffect(aString:String):Unit =
    {
      println(aString)
    }

  def aBigFunction(n:Int):Int={
  def aSmallerFunction(a:Int , b:Int):Int = a+b
    aSmallerFunction(n,n-1)
  }

  def greeting(name:String, n:Int):Unit=
    {
      println(s"Hi my name is $name and I am $n years old");
    }
    greeting("rohan",1)

  @tailrec
  def concteTrailRec(aString:String , n:Int , accumlator:String):String=
    if(n<=0) accumlator
    else concteTrailRec(aString, n-1 , aString+ accumlator)

}
