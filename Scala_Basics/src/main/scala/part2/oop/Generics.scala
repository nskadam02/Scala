package part2.oop

object Generics extends App{
class MyList[+A]{
 def add[B>:A](ele:B):MyList[B]= ???
  /*
  A=cat
  B-animal


   */
}
  class MyMap[Key ,Value]

  val listofIntegers= new MyList[Int]
  val liststring= new MyList[String]

  // Generic methods
  object MyList{
    def empty[A] :MyList[A]= ???
  }
  val emptylist = MyList.empty[Int]

  // variance problem
  class Animal
  class cat extends Animal
  class Dog extends Animal

  // list of cat extemds list of animal = covarient list
  class Covarientlist[+A]
  val animal :Animal =new cat
  val animalList :Covarientlist[Animal] =new Covarientlist[cat]
  // animlalist.add(new dog) ??? hard - return list of animal

  //2.No - invariance list
  class InvarientList[A]
  val invarientanimal :InvarientList[Animal] = new InvarientList[Animal]

  //3. hell, no! - CONTRAVARIENCE
  class Trainer[-A]
  val valuetrainer :Trainer[cat]= new Trainer[Animal]


  // Bounded Types
  class Cage [A <: Animal](animal:A)
  {

  }
  val cage = new Cage(new Dog)
//  class car
//  val car=new Cage(new car)

  // lower bounded




}
