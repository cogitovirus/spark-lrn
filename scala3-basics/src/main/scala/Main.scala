import scala.collection.mutable.ListBuffer

@main def hello: Unit = 
  println("Hello scala!")
  println("---------")

  val someNumber: Int = 1 + 1
  println(someNumber)
  println(addOne(2))
  println(addNumbers(1,6))
  println("Adding numbers: " + functionAdd(1,4))
  println("---------")

  val greeter = Greeter("Hello ", " !")
  greeter.greet("Gofer")
  println("---------")

  val point_1 = Point(1,2)
  val point_2 = Point(2,3)
  val point_3 = Point(2,3)
  // key difference with case classes is when you compare two instances,
  // it will compare the content
  def arePointsEqual(x: Point, y: Point) = x == y
  println("point_2 == point_3: " + arePointsEqual(point_2, point_3))
  println("---------")

  // boring way to iterate through a list
  val someNumbers = List(1, 2, 3)
  val newNumbers = double(someNumbers)
  println("newNumbers = " + newNumbers)
  // cool way to do with with higher order functions and lambdas
  // underscore feels strange though
  // it is a short for .map(i => i * 2)
  val newerNumbers = someNumbers.map(_ * 2)
  println("newerNumbers = " + newerNumbers)
  println("---------")




// lambda functions
val addNumbers = (x: Int, y: Int) => x + y
val addOne = (num: Int) => num + 1

// regular functions
// equal sign feels weird
def functionAdd(x: Int, y: Int): Int = x + y

// last statement is automatically a return value?
def double(ints: List[Int]): List[Int] = 
  val buffer = new ListBuffer[Int]()
  for i <- ints do
    buffer += i * 2
  buffer.toList

// regular class
// the primary constructor is in the class signature
// constructors can have default values
// Members are public by default
class Greeter(prefix: String = "Sir", suffix: String):
  def greet(name: String): Unit =
    println(prefix + name + suffix)

// case classes are used to model immutable data
case class Point(x: Int, y: Int)