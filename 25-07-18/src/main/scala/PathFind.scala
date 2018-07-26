import java.io.File

import scala.annotation.tailrec
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

class PathFind {
  def findFiles(dir:String):Future[List[File]] = Future{
    val input = List(new File(dir))
    getFiles(input)
  }
@tailrec
  private def getFiles(ip: List[File], result: List[File] = Nil):List[File] ={
    ip match {
      case first :: remaning => getFiles(remaning ::: first.listFiles.filter(_.isDirectory).toList,
        result ::: first.listFiles.filter(_.isFile).toList)
      case _ => result
    }
  }

}

object run extends App{
  val input = new PathFind
  val output =input.findFiles("src/main")

  output onComplete{
    case Success(x) =>println(x)
    case Failure(ex) => println(ex)
  }
  Thread.sleep(5000)
}
