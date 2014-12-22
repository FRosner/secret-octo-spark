package de.frosner.sos

import org.apache.spark.{SparkConf, SparkContext}

object Tryout {

  val conf = new SparkConf().setAppName("Tryout").setMaster("local")

  val spark = new SparkContext(conf)

  def main(args: Array[String]): Unit = {

    val text = spark.textFile("build.sbt")
    text.collect().foreach(println)

  }
}
