import java.io.File

import scala.concurrent.Future
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global

class DirectoryProblem {
 // val fileStucture: Future[String] = Future {

    def pathExtractor(directoryPath: String) = Future{
      val folder = new File(directoryPath)
      if (folder.exists() && folder.isDirectory)
           folder.listFiles()
          .toList
             .map(file => file.getName)
    }
  }

