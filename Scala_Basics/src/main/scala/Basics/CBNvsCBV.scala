package Basics

object CBNvsCBV extends App{

  def callByValue(x:Long):Unit ={
    println("by value"+x)
    println("by value"+x)

  }

  // delay the evaluation
  def callByName(x: =>Long) :Unit={
    println("by name"+x)
    println("by name"+x)
  }

  callByName(System.nanoTime())
  callByValue(System.nanoTime())

}
