import scala.concurrent.Future
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global

object Run extends  App {

  val directoryaccessor= new DirectoryProblem

 // println(directoryaccessor.pathExtractor("/home/knoldus/folder1"))
  Thread.sleep(7000)
  val  listOfFiles=directoryaccessor.pathExtractor("/home/knoldus/folder1")
   println(s".....$listOfFiles")
  /*listOfFiles.onComplete {
    case Success(result) => println(result)
    case Failure(ex) => print(ex.getMessage)
  }
*/

}
