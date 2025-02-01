class GFG {
  var name :String = "Abhishek Nangare"
  var age = 20
  var branch = "Computer Science"

  def show(): Unit = {
    println("Hello! my name is " + name + " and my age is " + age)
    println("My branch name is " + branch)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val ob = new GFG()
    ob.show()
  }
}
