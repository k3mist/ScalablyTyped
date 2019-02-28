organization := "org.scalablytyped"
name := "pulumi__cloud"
version := "v0.16.2-a777e0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-2ccb0a",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-e2634c",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-f1230c",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180214Z-c8521c",
  "org.scalablytyped" %%% "grpc" % "1.18.0-76f598",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-0a072d",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190212Z-4e2ce2",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190212Z-c3efb6",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-5e9f6b",
  "org.scalablytyped" %%% "make-error" % "1.3.5-93d40b",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-972581",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-22a450",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-b2ef73",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-9c6542",
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
  "org.scalablytyped" %%% "pulumi__pulumi" % "0.16.14-bb0255",
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180512Z-7b1212",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180214Z-69468f",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-1767b4",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-9b781e",
  "org.scalablytyped" %%% "typescript" % "3.3.3-010c4f",
  "org.scalablytyped" %%% "upath" % "1.1.0-174f93",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-cc5a63")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        