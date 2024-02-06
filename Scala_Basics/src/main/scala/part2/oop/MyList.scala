package part2.oop

abstract class MyList {
/*
 head - > first element
 tail - remainder of list
 isEmpty - boolean is this list empty
 add(int) -> new lis with this element added
 toString =>string representation
 */

  def head :Int
  def tail:MyList
  def isEmpty:Boolean
  def add(ele:Int):MyList
  def printElement:String

  //polymorphism
  override def toString: String = "[" + printElement +"]"


}
object Empty extends MyList{
  def head: Int = throw new NoSuchElementException // return nothing

  def tail: MyList = throw new NoSuchElementException

  def isEmpty: Boolean = true

  def add(ele: Int): MyList= new Cons(ele,Empty)

  override def printElement: String = ""
}

class Cons(h:Int,t:MyList) extends MyList{
  def head: Int = h

  def tail: MyList = t

  def isEmpty: Boolean= false

  def add(ele: Int): MyList= new Cons(ele , this)

  override def printElement: String = {
    if(t.isEmpty) ""+h
    else h+""+t.printElement
  }
}

object ListTest extends App{
  val list = new Cons(1,new Cons(2,new Cons(3,Empty)))
  println(list.tail.head)
  println(list.add(4).head)
  println(list.isEmpty)

  println(list.toString)
}