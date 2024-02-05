package part2.oop

object Objects extends App{

  // Scala Does not have class-level functionality like static

  // object do not receive paramaters
  object Person{ // type + its only instnace

    // static / class level functionality
    val N_EYS = 2
    def canFly:Boolean = false

    // factory method
    def apply(mother:Person , father :Person):Person= new Person("Bobie")
  }
  class Person(val name:String){
    // instance level functionality
  }
  // COMPANIONS


  println(Person.N_EYS)
  println(Person.canFly)

  // Scala object = SINGLETON INSTANCE
  val mary = new Person("Mary")
  val john = new Person("John")
  val bobbie = Person(mary,john)

  // Scala applictions = scala objects


}
