
name := "spark-template-scala-project"

version := "1.0"

scalaVersion := "2.11.7"

mainClass in Compile := Some("com.sample.SparkMainApp")

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0"

libraryDependencies += "com.github.nscala-time" %% "nscala-time" % "2.2.0"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.6.4"

libraryDependencies ++= Seq(
  ("org.apache.spark" % "spark-core_2.10" % "1.3.1" % "provided").
    exclude("org.mortbay.jetty", "servlet-api").
    exclude("commons-beanutils", "commons-beanutils-core").
    exclude("commons-collections", "commons-collections").
    exclude("commons-logging", "commons-logging").
    exclude("com.esotericsoftware.minlog", "minlog").
    exclude("com.google.guava", "guava").
    exclude("org.slf4j", "slf4j-log4j12").
    exclude("org.apache.hadoop", "hadoop-yarn-api").
    exclude("org.apache.spark", "spark-network-common_2.10").
    exclude("org.spark-project.spark", "unused").
    exclude("org.apache.spark", "spark-network-shuffle_2.10")
)

/*libraryDependencies ++= Seq(
  ("org.apache.spark" % "spark-mllib_2.10" % "1.3.1").
    exclude("org.mortbay.jetty", "servlet-api").
    exclude("commons-beanutils", "commons-beanutils-core").
    exclude("commons-collections", "commons-collections").
    exclude("commons-logging", "commons-logging").
    exclude("com.esotericsoftware.minlog", "minlog").
    exclude("com.google.guava", "guava").
    exclude("org.slf4j", "slf4j-log4j12").
    exclude("org.apache.hadoop", "hadoop-yarn-api").
    exclude("org.apache.spark", "spark-network-common_2.10").
    exclude("org.spark-project.spark", "unused").
    exclude("org.apache.spark", "spark-network-shuffle_2.10")
)*/

parallelExecution in Test := false

test in assembly := {}







