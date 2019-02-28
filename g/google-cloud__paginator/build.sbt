organization := "org.scalablytyped"
name := "google-cloud__paginator"
version := "0.1.2-d140ca"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-2ccb0a",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-80fafa",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-b47e4a",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-ed870f",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-e5e2f4",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-48996e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        