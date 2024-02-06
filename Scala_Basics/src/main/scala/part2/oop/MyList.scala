package part2.oop

abstract class MyList[+A] {
/*
 head - > first element
 tail - remainder of list
 isEmpty - boolean is this list empty
 add(int) -> new lis with this element added
 toString =>string representation
 */

  def head :A
  def tail:MyList[A]
  def isEmpty:Boolean
  def add[B>:A](ele:B):MyList[B]
  def printElement:String

  //polymorphism
  override def toString: String = "[" + printElement +"]"


}
object Empty extends MyList[Nothing]{
  def head: Nothing = throw new NoSuchElementException // return nothing

  def tail: MyList[Nothing] = throw new NoSuchElementException

  def isEmpty: Boolean = true

  def add[B>:Nothing](ele: B): MyList[B]= new Cons(ele,Empty)

  override def printElement: String = ""
}

class Cons[+A](h:A,t:MyList[A]) extends MyList[A]{
  def head: A = h

  def tail: MyList[A] = t

  def isEmpty: Boolean= false

  def add[B>:A](ele: B): MyList[B]= new Cons(ele , this)

  override def printElement: String = {
    if(t.isEmpty) ""+h
    else h+""+t.printElement
  }
}

object ListTest extends App{
  val lisINt:MyList[Int]=new Cons[Int](1,new Cons[Int](2,new Cons[Int](3,Empty)))
  val listStirn : MyList[String]=new Cons[String]("hi",new Cons[String]("hello",new Cons[String]("scala",Empty)))
//  val list = new Cons(1,new Cons(2,new Cons(3,Empty)))
//  println(list.tail.head)
//  println(list.add(4).head)
//  println(list.isEmpty)
//
//  println(list.toString)
println(listStirn.toString)
  println(lisINt.toString)
}