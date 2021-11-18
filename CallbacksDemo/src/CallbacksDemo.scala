import scala.util.{Success, Failure}
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object CallbacksDemo extends App {
  val fVal = Future {
    "Hello, the Future is now!"
    throw new Exception("There is no Future")
  }

  fVal onComplete {
    case Success(s) => {
      println(s)
    }
    case Failure(e) => {
      println("Error: " + e.getMessage)
    }
  }

  if (fVal.isCompleted == false) Thread.sleep(1000)

}