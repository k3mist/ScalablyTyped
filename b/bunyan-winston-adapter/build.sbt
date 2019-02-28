organization := "org.scalablytyped"
name := "bunyan-winston-adapter"
version := "0.2-dt-20181017Z-198b1b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-d0311a",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-8b4f5d",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-18705e",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-f457c4",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-d8ee11",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-999cd8",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-683770",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-3cdf03",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-e01e73",
  "org.scalablytyped" %%% "winston" % "3.2.1-e997a6",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-b3ef96")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        