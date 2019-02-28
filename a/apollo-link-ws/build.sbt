organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.14-52c048"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-fc0551",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-cdd1a3",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-a47a6d",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-3f8a4b",
  "org.scalablytyped" %%% "iterall" % "1.2.2-4267a6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-bb8015",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-7a8914",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-116ab3",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-eee2a8",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-569cf7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        