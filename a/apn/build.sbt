organization := "org.scalablytyped"
name := "apn"
version := "2.2.0-83971c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-10f26a",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "node-forge" % "0.8.1-dt-20190318Z-cf8294",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "verror" % "1.10-dt-20180214Z-d348e8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        