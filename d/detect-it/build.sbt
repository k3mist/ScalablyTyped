organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-c10666"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-5d9d2a",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-d2aabe",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-feb83d",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-7dc81d",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        