import java.nio.file._
import java.nio.file.attribute._

object Test {
  def main(args: Array[String]): Unit = {
    Files.walkFileTree(
      Paths.get(args(0)),
      new SimpleFileVisitor[Path] {
        override def visitFile(file: Path, attrs: BasicFileAttributes): FileVisitResult = {
          println(file)
          FileVisitResult.CONTINUE
        }
      }
    )
  }
}
