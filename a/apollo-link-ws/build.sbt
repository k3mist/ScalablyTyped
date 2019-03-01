organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.14-5049f2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-58ff0d",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-cb601f",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-d2edcd",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-461334",
  "org.scalablytyped" %%% "iterall" % "1.2.2-e3b0e9",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-cbe6bf",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1c07bd",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-5993e1",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-76a7e1",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-a00444")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        