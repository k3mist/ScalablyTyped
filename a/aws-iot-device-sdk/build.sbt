organization := "org.scalablytyped"
name := "aws-iot-device-sdk"
version := "2.2.0-dt-20190223Z-938a75"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-866e05",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-f1ba61",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-74fa1d",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-bc4a14",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-972581",
  "org.scalablytyped" %%% "mqtt" % "2.18.8-73e59f",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-824fe1",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-7cde75",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-999cd8",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-683770",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-dd2660",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-116ab3",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-572ed9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        