organization := "org.scalablytyped"
name := "xhr"
version := "2.5.0-f33902"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "is-function" % "1.0-dt-20190123Z-4fcb73",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-572ed9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        