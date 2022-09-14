# scala-lrn
Learning Spark + Scala

## TODO:
- Run Scala on a databricks ... notebook / cluster ?
- test performance one core vs 8 core , play with "local[*]"
- find an interesting data set

## Build
### option 1 - packaged with scala, no spark
run
```
sbt assembly
```
to create a jar packaged with scala (without spark, assuming it's on the cluster)

## Run
```
spark-submit --class "run" --master local[*] .\target\scala-3.2.0\spark-lrn_3-0.1.0-SNAPSHOT.jar
```

## Windows setup guide
Hadoop - https://medium.com/analytics-vidhya/hadoop-how-to-install-in-5-steps-in-windows-10-61b0e67342f8
Spark - https://phoenixnap.com/kb/install-spark-on-windows-10
Spark + Scala 3 - https://www.47deg.com/blog/using-scala-3-with-spark/

## Junkyard

https://levelup.gitconnected.com/is-python-spark-really-being-10x-slower-than-scala-spark-8a76c907adc8

- Define execution environment (processor/memory/cores/threads/version scala / spark)
- try it out with a simple word count in scala
- measure execution time




Measure test coverage in scala
https://github.com/scoverage/scoverage-maven-plugin
test library:
https://www.scalatest.org/ with funspec https://www.scalatest.org/at_a_glance/FunSpec


Scala 3

pt is Deprecated. Instead use stop-dfs.cmd and stop-yarn.cmd

```
start-dfs.cmd
```

```
spark-shell
```
to launch an interactive spark cluster fuck

