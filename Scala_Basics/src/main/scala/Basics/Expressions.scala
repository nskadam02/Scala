package Basics

object Expressions extends App{

  val x = 1+2;  // Expression
  println(x)

  println(2+3*4)

  // + , - , * / & | ^ << >> >>>(right shift with zero extension)

  // == != > >= < <=
  println(!(1==x))

  // ! && ||

  var aVariable = 2
  aVariable +=3  // short hand operator only work with variables

  // Instructions (Do) Vs Expression (value)

  // IF expression
  val aCondition = true
  val aConditionVale = if(aCondition) 5 else 3  // IF expression
  println(aConditionVale)

  var i=0
  while (i<10)
    {
      println(i)
      i+=1
    }

  // NEVER WRITE THIS loops used in imperative

  // Everything is an expression

  val aWeiredValue = (aVariable=3)   // Unit ===  Void
  println(aWeiredValue)

  // side effects = println() , while , reaasigning

  // code blocks start with braces and value is equal to last expression
  val aCodeBlock ={
    val y=2
    val z=y+1
    if(z>2) "hello" else "goodbye"
  }

  // "hello world " = string
  // println("hello world") = Unit
}
