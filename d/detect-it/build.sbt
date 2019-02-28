organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-d3a693"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-61d271",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-0629ce",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-55fc9f",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-67cccc",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        