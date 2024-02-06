package part2.oop

object AnonymousClass extends App{

  abstract class Animal{
    def eat:Unit
  }



  // anonymous class
  val funanimla:Animal = new Animal{
    override def eat: Unit = println("hahahhahah")
  }
  /*
  class AnonymousClass$$anon$1 extends Animal
  {
    override def eat: Unit = println("hahahhahah")
  }
   */
  println(funanimla.getClass)
  class Person(name:String)
  {
    def say:Unit= println(s"hi $name")
  }
  val jim = new Person("jim"){
    override def say: Unit = println(s"hi jim")
  }

}
