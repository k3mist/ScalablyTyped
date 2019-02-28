organization := "org.scalablytyped"
name := "constant-case"
version := "2.0.0-f78ee1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-5ec2ad",
  "org.scalablytyped" %%% "no-case" % "2.3.2-c27fc7",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-61023f",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-b3feae")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        