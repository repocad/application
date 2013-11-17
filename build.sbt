name := "Siigna applet"

version := "1.0"

scalaVersion := "2.10.0"

organization := "com.siigna"

crossScalaVersions := Seq("2.10.0", "2.9.2")

seq(LWJGLPlugin.lwjglSettings: _*)

resolvers += "Siigna repository" at "http://rls.siigna.com"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-actors" % "2.10.0",
  "org.scala-lang" % "scala-library" % "2.10.0",
  "org.scala-lang" % "scala-reflect" % "2.10.0",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test",
  "junit" % "junit" % "4.11" % "test",
  "com.itextpdf" % "itextpdf" % "5.4.2" % "runtime",
  "com.itextpdf" % "itextpdf" % "5.4.2" % "compile",
  "com.siigna" % "siigna-main_2.10" % "stable"
)