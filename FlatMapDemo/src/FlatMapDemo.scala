// Using FlatMap with List of List collection

object FlatMapDemo {
  def main(args: Array[String]) {
    // list of list
    val numStrings = List(List("1"), List("2", "3"), List("4"), List("5"))
    
    val numInts = numStrings.flatMap(x => x.map(_.toInt))
    // val slowInts = numStrings.flatten.map(_.toInt) //less efficient!
    
    println(numInts)
    println("-----")
    numInts.map(println)
    println("-------")
    numStrings.flatMap(x => x.map(y => y.toInt * y.toInt)).map(println)
  }
}