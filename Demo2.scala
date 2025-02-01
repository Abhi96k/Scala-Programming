class GFG(val name: String = "Abhishek Nangare", 
          val age: Int = 24, 
          val branch: String = "Computer Science", 
          val roll: Int = 57, 
          val college: String = "PCCOE") {

  def display(): Unit = {
    println(s"Name: $name")
    println(s"Age: $age")
    println(s"Branch: $branch")
    println(s"Roll: $roll")
    println(s"College: $college")
  }
}

object Obj {
  def main(args: Array[String]): Unit = {
    val obj = new GFG()
    obj.display()
  }
}
