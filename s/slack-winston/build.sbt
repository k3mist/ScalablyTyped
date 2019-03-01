organization := "org.scalablytyped"
name := "slack-winston"
version := "0.0-dt-20180924Z-431e1e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-4e335e",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-cb8620",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-419830",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-bfb7a3",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-059cee",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-a4a8cf",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-b8277f",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-7ffcd8",
  "org.scalablytyped" %%% "winston" % "3.2.1-93c49e",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-24729a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        