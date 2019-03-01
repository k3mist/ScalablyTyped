organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-a1e4de"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-2b571e",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-0bce5f",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-680bf6",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-d548c1",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-eff3fe",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-3d4740",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-7115b2",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-059cee",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-a4a8cf",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-83af61",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-c41e67")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        