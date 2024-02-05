package part2.oop

object InheritanceandTraits extends App{

  // single level inheritance
   sealed class Animal{

    val creatureType = "wild"
   def eat = println("nomnom")
  }

  class cat extends Animal
  {

    // we can call protected in class but not outoside
    def crunch={
      eat
      println("crunch crunch")
    }
  }

  val cat = new cat
  cat.crunch

  // constructor
  class Person(name:String, age:Int)
  {
    def this(name:String) = this(name,0) // auxilalry constuctor
  }
  class Adult(name:String,age:Int,idCard:String) extends Person(name)

  // Overriding
  class Dog(override val creatureType:String) extends Animal
  {
    //override val creatureType: String = "Domestic"
    override def eat= {
      super.eat
      println("Crunch, crunch")

    }

  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // type substitution = (Plymorphism)
  val unkownAnimal:Animal = new Dog("K9")
  unkownAnimal.eat

  // overriding vs overloading - same class

  // Super

  // prevent overriding
   // 1 - use final  on member
  // 2- use final on class  - cannot extend
  // 3- seal the class  - extend class in this file prevent from other file

}
