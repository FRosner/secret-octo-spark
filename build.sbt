name := "sectret-octo-spark"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.0"


libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "1.2.0"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.3"

libraryDependencies += "junit" % "junit" % "4.12"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

resolvers += "opennlp sourceforge repo" at "http://opennlp.sourceforge.net/maven2"

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/releases/"
