package main.scala

/**
  * Created by Dinuka on 4/8/2017.
  */
object SumBetween extends App{
  print("Please insert start No :")
  val start = scala.io.StdIn.readInt()
  print("Please insert end No :")
  val end = scala.io.StdIn.readInt()

  def sum(start:Int,end:Int): Int ={
    var sumOfNums = 0
    for (i <- start+1 until end){
      sumOfNums += i*i//(i^2)+((i+1)^2)+((i+2)^2)+((i+3)^2)+.......
    }
    sumOfNums
  }

  println(sum(start,end))
}
/**
def sum(): Unit ={
    print("Please insert start No :")
    val start = scala.io.StdIn.readInt()
    print("Please insert end No :")
    val end = scala.io.StdIn.readInt()
    var sumOfNums = 0
    for (i <- start+1 until end){
      sumOfNums += i*i
    }
    println(sumOfNums)
  }

**/
