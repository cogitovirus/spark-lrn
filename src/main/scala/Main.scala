import org.apache.spark.sql.SparkSession


@main def run: Unit = 
  println("Hello world!")
  val spark = SparkSession.builder()
    .appName("Hello Spark")
    .master(sys.env.getOrElse("SPARK_MASTER_URL", "local[*]"))
    .getOrCreate()

  import spark.implicits._

  val df = List("hello", "world").toDF 
  df.show()

  spark.stop()

