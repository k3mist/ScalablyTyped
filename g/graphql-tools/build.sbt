organization := "org.scalablytyped"
name := "graphql-tools"
version := "4.0.4-717cdf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-fc0551",
  "org.scalablytyped" %%% "apollo-utilities" % "1.1.3-c830fb",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-a14ca5",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-79aadb",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-3f8a4b",
  "org.scalablytyped" %%% "iterall" % "1.2.2-4267a6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "tslib" % "1.9.3-ca2588",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-c103ca",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-eee2a8",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-569cf7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        