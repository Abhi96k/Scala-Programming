class Name {
  val name: String = "Abhishek"
}

class Age extends Name {
  val age: Int = 23
  

  def displayInfo(): Unit = {
    println("Name is: " + name + " and Age is: " + age)
  }
}

object Inheritance {
  def main(args: Array[String]): Unit = {
    val a = new Age()
    a.displayInfo() 
  }
}
