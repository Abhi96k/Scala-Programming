class MatchKeyWord {
  def test(x: Int): String = x match {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case _ => "Something else"
  }
}

object MatchKeyWordApp {
  def main(args: Array[String]): Unit = {
    val matcher = new MatchKeyWord
    println(matcher.test(1))
    println(matcher.test(2))
    println(matcher.test(3))
    println(matcher.test(4))
    //for loop
    for (i <- 1 to 5) {
      println(i)
    }
  }
}
