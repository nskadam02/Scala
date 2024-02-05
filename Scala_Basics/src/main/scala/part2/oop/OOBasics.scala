package part2.oop

object OOBasics extends App{

val person = new Person("john",25)
println(person.age)
  person.greet("Daniel")
  person.greet()

  val author= new Writer("Charles","Dicken",1812)
  val novel = new Novel("Gret exper",1861,author)

  println(novel.authorAge())
  println(novel.isWrittenBy(author))

  val counter = new Counter
  counter.inc.print
  


}

// constructor
class Person(name:String , val age:Int=0)
{
  //body
  //val/var
  val x=2   // field
  println(1+3) // all code get executed

  def greet(name:String):Unit= println(s"${this.name} syas: hi ,$name")

  //Overloading - not include different output - different no of parameter
  def greet():Unit=println(s"Hi I am $name")    // always this.name

  //multiple consuctor
  def this(name:String)=this(name,0)
  def this() = this("JOhn doe")

}

// class parameter are not class members use val / var to parameter

/*novel and writer
 Writer - first name surname year
  - method full name

 NOvel - name year of relese , authhor
  - authorage
  -iswritten by (author)
  - copy (new year of release)= new instance of novel
  */

  class Writer(firstName:String,surname:String,val year:Int)
{
  def fullName:String = firstName+""+surname
}
class Novel(name:String,year:Int,author:Writer)
{
  def authorAge():Int =year - author.year
  def isWrittenBy(author:Writer)=author==this.author
  def copy(newYear:Int):Novel = new Novel(name,newYear,author)
}
  /*
  counter class
  -receive int value
  method curren count
  increment decrement by =>new counter
  oveload inc dec to receive an amount
 */

class Counter(val count:Int=0){
  def inc = {
    println("Incrementing")
    new Counter(count+1)}  // immutability if you want to chnge the content use another instance
  def dec =
    {
      println("Decrementing")
      new Counter(count-1)
    }

  def inc(n:Int) : Counter=
  {
    if (n<=0) this
    else inc.inc(n-1)
  }
  def dec(n:Int):Counter =
    {
      if(n<=0) this
      else dec.dec(n-1)

    }
  def print =println(count)
}




