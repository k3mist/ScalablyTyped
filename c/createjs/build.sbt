organization := "org.scalablytyped"
name := "createjs"
version := "0.0-unknown-dt-20180214Z-6f85ac"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "createjs-lib" % "0.0-unknown-dt-20180214Z-b0f79c",
  "org.scalablytyped" %%% "easeljs" % "1.0.0-dt-20181116Z-67a86a",
  "org.scalablytyped" %%% "preloadjs" % "0.6.2-dt-20180214Z-4f0b02",
  "org.scalablytyped" %%% "soundjs" % "0.6.0-dt-20180214Z-11d3bf",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "tweenjs" % "1.0.2-dt-20180517Z-856b54")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        