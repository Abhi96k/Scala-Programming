object Rose {
  def unapply(s: String): Boolean = s == "rose"
}

object Violet {
  def unapply(s: String): Boolean = s == "violet"
}

object MatchKeyWordApp {
  def main(args: Array[String]): Unit = {
    val flower = "rose"
    flower match {
      case Rose() => println("It's a rose!")
      case Violet() => println("It's a violet!")
      case _ => println("It's something else")
    }
  }
}