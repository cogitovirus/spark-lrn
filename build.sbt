val scala3Version = "3.2.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "spark-lrn",
    version := "0.1.3-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies += ("org.apache.spark" %% "spark-sql" % "3.2.0" % "provided").cross(CrossVersion.for3Use2_13),

    assembly / mainClass := Some("run")

  )

// include the 'provided' Spark dependency on the classpath for `sbt run`
Compile / run := Defaults
  .runTask(
    Compile / fullClasspath,
    Compile / run / mainClass,
    Compile / run / runner
  )
  .evaluated
