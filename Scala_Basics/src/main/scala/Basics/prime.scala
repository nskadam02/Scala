package Basics

import scala.annotation.tailrec

// Auxillary function
object prime extends App{
 def isPrime(n:Int):Boolean= {
   def isPrimeUntil(t: Int): Boolean = {
     if (t <= 1) true
     else n % t != 0 && isPrimeUntil(t - 1)

   }
   isPrimeUntil(n / 2)
 }
  println(isPrime(8))


  def isPrimeTrail(n:Int):Boolean={
    @tailrec
    def isPrimeUntiltrail(t:Int , isStillPrime:Boolean):Boolean={
      if (!isStillPrime) false
      if(t<=1) true
      else isPrimeUntiltrail(t-1, n%t!=0 && isStillPrime)

    }
    isPrimeUntiltrail(n/2 , true)
  }
  println(isPrimeTrail(2004))

}
