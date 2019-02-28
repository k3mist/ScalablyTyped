organization := "org.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-813d15"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-5ae6cc",
  "org.scalablytyped" %%% "es6-promise" % "4.2.6-7b4ce5",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-6fcdd9",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-45a78a",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "ono" % "4.0.11-9aa024",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20180214Z-be34fc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        