organization := "org.scalablytyped"
name := "mongoose-deep-populate"
version := "2.0.3-dt-20180214Z-dbc6a3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-d9373e",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-38ba87",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190224Z-f55580",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        