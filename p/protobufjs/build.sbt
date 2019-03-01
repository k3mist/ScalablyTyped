organization := "org.scalablytyped"
name := "protobufjs"
version := "6.8.8-8496ed"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-6ab5a5",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-bae077",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-84ba05",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-d9dc31",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-53b004",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-04e6d0",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-f4b201",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-f265c3",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-fe7254",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-fca593",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-105200",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        