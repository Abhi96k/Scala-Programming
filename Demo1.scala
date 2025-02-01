object Demo1 {

  def add(a: Int, b: Int): Int = {
    a + b
  }

  def sub(a: Int, b: Int): Int = {
    a - b
  }

  def mul(a: Int, b: Int): Int = {
    a * b
  }
  def  div(a:Int ,b:Int):Int={
    a/b
  }
  def main(args: Array[String]): Unit = {
    println("Hello, World!")
    println("Addition of 5 and 3: " + add(5, 3))
    println("Subtraction of 5 and 3: " + sub(5, 3))
    println("Multiplication of 5 and 3: " + mul(5, 3))
  }

  
}
