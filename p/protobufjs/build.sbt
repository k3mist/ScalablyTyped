organization := "org.scalablytyped"
name := "protobufjs"
version := "6.8.8-9c6542"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-5e9f6b",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-9f866d",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-a13e18",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-2dee0e",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-f74f18",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-4947e0",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-564771",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-fc0251",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-c2e8d2",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-616f8e",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-b7e8f3",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        