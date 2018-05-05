name := "WordCount"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.5.2"

addCommandAlias("make-idea", "update-classifiers; update-sbt-classifiers; gen-idea sbt-classifiers")

addCommandAlias("generate-project",
  ";update-classifiers;update-sbt-classifiers;gen-idea sbt-classifiers")