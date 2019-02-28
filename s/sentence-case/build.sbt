organization := "org.scalablytyped"
name := "sentence-case"
version := "2.1.1-75043e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-5ec2ad",
  "org.scalablytyped" %%% "no-case" % "2.3.2-c27fc7",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-b3feae",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-a0b83b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        