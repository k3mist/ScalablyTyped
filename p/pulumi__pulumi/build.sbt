organization := "org.scalablytyped"
name := "pulumi__pulumi"
version := "0.16.14-a09531"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-95d235",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-d6cf3b",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-92e5f2",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180214Z-004e6f",
  "org.scalablytyped" %%% "grpc" % "1.18.0-d87fc5",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-e580c8",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190212Z-be3405",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190212Z-647534",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-6ab5a5",
  "org.scalablytyped" %%% "make-error" % "1.3.5-241cca",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-eff3fe",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-d3cd55",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-185854",
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
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180512Z-e3fc93",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180214Z-f53348",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-ccf7da",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-76b593",
  "org.scalablytyped" %%% "typescript" % "3.3.3-a1b20b",
  "org.scalablytyped" %%% "upath" % "1.1.0-976cf5",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-485802")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        