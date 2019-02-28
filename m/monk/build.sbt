organization := "org.scalablytyped"
name := "monk"
version := "6.0.6-8a2969"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-d9373e",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-5ae6cc",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-38ba87",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180214Z-9dd8c0",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        