package Basics

object Stringops extends App {

  val str:String = "Hello,  i am ready"

  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumerString = "45"
  println(aNumerString.toInt)
  println('a'+:aNumerString:+'z')
  println(str.reverse)
  println(str.take(2))

  //SCALA SPECIFIC

  // string interpolator
  // s- interpolator

  val name = "David"
  val age =12
  val grret = s"Hello, m name is $name and i am $age years old"
  val grret2 = s"Hello, m name is $name and i am turning ${age+1} years old"

  // F- interpolator - format

  val speed = 1.2f
  val myth = f"$name can eat speed of $speed%2.2f burgers per minute"
  println(myth)

//   val x= 2.2f
//  val y = f"$x%3d"

  // raw - interpolator
  println(raw"this is \n newline")
  val escaped = "this is \n newline"
  println(escaped)






}
