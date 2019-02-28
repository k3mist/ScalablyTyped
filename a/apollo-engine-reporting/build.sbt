organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "1.0.4-9ce1e1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.1-f7054e",
  "org.scalablytyped" %%% "apollo-graphql" % "0.1.1-43848b",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-3a467a",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180601Z-962d78",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-3f8a4b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-0a072d",
  "org.scalablytyped" %%% "lodash_dot_sortby" % "4.7-dt-20190212Z-024766",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-5e9f6b",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-39a899",
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
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-efe8c4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        