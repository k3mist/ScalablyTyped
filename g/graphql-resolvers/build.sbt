organization := "org.scalablytyped"
name := "graphql-resolvers"
version := "0.2-dt-20181024Z-fa6a84"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-58ff0d",
  "org.scalablytyped" %%% "apollo-utilities" % "1.1.3-01635a",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-8615a2",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-3e62ee",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-461334",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-63b587",
  "org.scalablytyped" %%% "iterall" % "1.2.2-e3b0e9",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9b6ae7",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-93f367",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-76a7e1",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-a00444")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        