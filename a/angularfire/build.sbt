organization := "org.scalablytyped"
name := "angularfire"
version := "0.8.2-dt-20181124Z-ebb1d1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-26b312",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-9cf379",
  "org.scalablytyped" %%% "firebase" % "5.8.3-7fd1c6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.9-d31df3",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.4-0f94e3",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.3-4584cd",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.2-65fa0b",
  "org.scalablytyped" %%% "firebase__database" % "0.3.12-ecf2db",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.5-704acb",
  "org.scalablytyped" %%% "firebase__firestore" % "1.0.3-4cd92f",
  "org.scalablytyped" %%% "firebase__firestore-types" % "1.0.2-b73e0b",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.7-8541f4",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.3-d5a966",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.6-330caf",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.11-1c90f5",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.5-b5efa3",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.6-f835d1",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.8-a5c2b7",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.5-010674",
  "org.scalablytyped" %%% "firebase__util" % "0.2.7-1b50d4",
  "org.scalablytyped" %%% "grpc" % "1.18.0-d87fc5",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-52a44d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-e580c8",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190212Z-be3405",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190212Z-647534",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-6ab5a5",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20190212Z-b7dc3d",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-8496ed",
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
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9b6ae7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        