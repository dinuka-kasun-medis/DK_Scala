package main.scala

/**
  * Created by Dinuka on 4/8/2017.
  */
object nCr extends App{
  print("Please input n value :")
  val n = scala.io.StdIn.readInt()
  print("Please input r value :")
  val r = scala.io.StdIn.readInt()

  def factorial(n: Int):Int = {
    if (n == 0)
      1
    else
      n * factorial(n-1)
  }

  var answer=factorial(n)/(factorial(n-r)*factorial(r))

  println("Answer of "+n+"C"+r+" = "+answer)
}
