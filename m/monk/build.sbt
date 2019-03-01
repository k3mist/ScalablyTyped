organization := "org.scalablytyped"
name := "monk"
version := "6.0.6-461dd7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-ced375",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-52e12d",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-635b14",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180214Z-a86c85",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        