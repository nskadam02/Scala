package part2.oop

import scala.language.postfixOps

object MethodNotation extends App {

  class Person( val name:String, favouriteMovie:String, val age:Int = 0)
  {
    def likes(movie:String):Boolean= movie==favouriteMovie

    def +(person:Person):String = s"${this.name} is hang out with ${person.name}"

    def +(nickname:String):Person = new Person(s"$name ($nickname)",favouriteMovie)

    def unary_! : String = s"$name what the heck !"
    def unary_+ : Person = new Person(name,favouriteMovie,age+1)

    def isAlive:Boolean = true

    def apply():String = s"My name is $name and i like $favouriteMovie"

    def apply(no:Int):String = s"$name watch movie $no times"

    def learns(thing:String)=s"$name learns $thing"
    def learnScala = this learns "Scala"
  }

  val mary=new Person("Mary","Inception")
  println(mary.likes("Inception"))

  // Infix notation = operator notation only single paramter (Syntactic sugar)
  println(mary likes "Inception")

  //Operators in scala
  val tom = new Person("Tom","Fight")
  println(mary + tom)
  println(mary.+( tom))

// All operators are methods

  // Prefix notations - uniry opertaor
  val x = -1
  val y = 1.unary_-

  // unary_ prefix only work with - + ~ !
  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary()) // equivalent always looks for defination of apply with no paramter

  /*
  1. Overload + operator
  mary + " the rocksatar" => new person "mary the rockstar"

  2. Add an age to person class
  Add unary + opertaor => new person with the age +1
  + may with age incrementa

  3. adda "learns " methods in person class => mary learns sclaa
  4. learnsclaa methos , calls learn method "scala " as paramter use it in postfix

  5. overload apply method to receive no and retunr string
   */
  println((mary+ "rcckstar")())
  println((+mary).age)
  println(mary learnScala)
  println(mary (2))  // call apply method
}
