import scala.collection.mutable
import scala.io._
object FirstApp extends App {
  val bufferedSourceOne = Source.fromFile("C:/Users/admin/Desktop/card.csv")
  var value: Double = 0.0
  var countLine: Int = 0
  val foo = "foo"

  //How much lines in file
  for (line <- bufferedSourceOne.getLines) {
    countLine += 1
  }
  bufferedSourceOne.close

  //Add ID to lines
  val bufferedSourceTwo = Source.fromFile("C:/Users/admin/Desktop/card.csv")
  var countToRows: Int = 0
  val nrows = countLine
  val ncols = countLine
  val rows = Array.ofDim[String](nrows, ncols)

  for (line <- bufferedSourceTwo.getLines) {
    rows(countToRows) = line.split(",").map(_.trim)
    countToRows += 1
  }
  bufferedSourceTwo.close

  val Result = mutable.Map(foo -> value)
  for (i <- 0 until nrows) {
    value += rows(i)(2).toDouble
     Result += (rows(i)(0) -> value)

  }
  println(Result)
print((s"Lines: $countLine"))



  /*

  for (line <- str.getLines) {
    countLine += 1
   val cols = line.split(",").map(_.trim)
    value += cols(2).toDouble

   // println(s"${cols(0)}")
  }

*/
  }






