organization := "org.scalablytyped"
name := "mongoose-simple-random"
version := "0.4-dt-20180723Z-266e11"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-ced375",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-635b14",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190224Z-0618f0",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        