import java.nio.file.Files
import java.nio.file.Paths

object Test {
  def main(args: Array[String]): Unit = {
    import scala.collection.JavaConverters._
    Files.walk(Paths.get(args(0))).iterator.asScala.foreach(println)
  }
}
