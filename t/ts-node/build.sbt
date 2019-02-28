organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-9b781e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-2ccb0a",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-e2634c",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-f1230c",
  "org.scalablytyped" %%% "make-error" % "1.3.5-93d40b",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-972581",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-22a450",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-1767b4",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "typescript" % "3.3.3-010c4f",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-cc5a63")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        