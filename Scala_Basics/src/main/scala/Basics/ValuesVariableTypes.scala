package Basics

object ValuesVariableTypes extends App {

  val x: Int = 42
  println(x);

  // x=2
  // VALS are immutable / constant
  //compiler can infer type
  val aString: String = "Hello string" ; // not necessary if write in same line then necessary
  val aBoolean: Boolean= false;
  val aChar :Char = 'a'
  val aShort :Short = 435 // 2 byte
  val aLong: Long = 7642384927392390934L // L for long
  val aFloat :Float = 2.0f
  val aDouble:Double= 3.147898


  //Variables  they are muttable
  var aVariable:Int = 4;
  aVariable = 5   // side effects / change of variable

  // use val instead of var
}
