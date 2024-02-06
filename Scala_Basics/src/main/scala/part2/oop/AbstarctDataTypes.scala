package part2.oop

object AbstarctDataTypes extends App{

  // abstarct - unimplemeted field

  abstract class Animal{
    val creatureType :String ="wild"
    def eat:Unit
  }
  class Dog extends Animal{
    override val creatureType: String = "canins"

    // for abstract class override is not mandatory to mention
    def eat: Unit = println("crunch")
  }

  //traits - abstract datatype - can be inherited
  trait Carnivore{
    def eat (animal:Animal):Unit
    val meal="meat"
  }

  class Crocodile extends Animal with Carnivore{
    override val creatureType: String = "croc"

    override def eat: Unit = println("nomnom")

    override def eat(animal: Animal): Unit = println(s"eating ${animal.creatureType}")
  }
  val dog= new Dog
  val croc = new Crocodile
  croc.eat(dog)

  //traits vs abstract
  //1- traits do not have constuctor like Carnivore()
  //2- multiple traits may be inherited by same class
  //3- traits is about behaviour class isthing

  // acala any reference anyref



}
