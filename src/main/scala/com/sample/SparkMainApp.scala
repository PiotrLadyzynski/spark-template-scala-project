package com.sample



import org.apache.spark.{Logging, SparkContext, SparkConf}

/**
 * This main function runs cluster spark application.
 *
 * Build:
 * $ sbt clean assembly
 *
 * Run:
 * $ spark-submit   --class com.sample.SparkMainApp   --executor-cores 10   --num-executors 7 --executor-memory 8G --driver-memory 4G  --master yarn   --deploy-mode cluster   spark-template-scala-project.jar
 *
 * @author Piotr Ladyzynski
 */
object SparkMainApp extends App with Logging {

  override def main(args: Array[String]) = {


    val sparkConf = new SparkConf()
      .setAppName("spark-template-scala-project")


    val sc = new SparkContext(sparkConf)

    logInfo("DUPA!!!!")

    val data = sc.textFile("hdfs:///user/cloudera/example.dat")
    val result = data.filter(x => x.contains("WARSZAWA")).count()


    logInfo("Number of Spark word in input file: "+result )
    logInfo("Spark App End " )


  }


}
