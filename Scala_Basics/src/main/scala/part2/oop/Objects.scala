package part2.oop

object Objects extends App{

  // Scala Does not have class-level functionality like static

  // object do not receive paramaters
  object Person{ // type + its only instnace

    // static / class level functionality
    val N_EYS = 2
    def canFly:Boolean = false
  }
  class Person{
    // instance level functionality
  }

  // COMPANIONS


  println(Person.N_EYS)
  println(Person.canFly)

  // Scala object = SINGLETON INSTANCE
  val mary = Person
  val john = Person
  println(mary==john)

}
