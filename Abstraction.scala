abstract class MyAuthor {
  def myname(): Unit
  def myage(): Unit
}

class Author extends MyAuthor {
  def myname(): Unit = {
    println("My name is Abhishek")
  }

  def myage(): Unit = {
    println("My age is 23")
  }
}

object Abstraction {
  def main(args: Array[String]): Unit = {
    val a = new Author()
    a.myname()
    a.myage()
  }
}
