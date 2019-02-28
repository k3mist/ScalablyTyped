organization := "org.scalablytyped"
name := "angularfire"
version := "0.8.2-dt-20181124Z-5c36b0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-e48e16",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-47481f",
  "org.scalablytyped" %%% "firebase" % "5.8.3-330cc0",
  "org.scalablytyped" %%% "firebase__app" % "0.3.9-e28fd4",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.4-6f89a3",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.3-6469f3",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.2-586e17",
  "org.scalablytyped" %%% "firebase__database" % "0.3.12-c14e75",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.5-d8d175",
  "org.scalablytyped" %%% "firebase__firestore" % "1.0.3-aee207",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.0.2-635ff3",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.7-3c29b3",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.3-11af80",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.6-210350",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.11-879af9",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.5-fe28d3",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.6-521691",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.8-233a60",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.5-b532da",
  "org.scalablytyped" %%% "firebase__util" % "0.2.7-e17424",
  "org.scalablytyped" %%% "grpc" % "1.18.0-76f598",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-5158a9",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-0a072d",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190212Z-4e2ce2",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190212Z-c3efb6",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-5e9f6b",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20190212Z-5ad80f",
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
  "org.scalablytyped" %%% "tslib" % "1.9.3-ca2588")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        