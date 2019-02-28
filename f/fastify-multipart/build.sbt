organization := "org.scalablytyped"
name := "fastify-multipart"
version := "0.7.0-583bd5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.9.1-ac751e",
  "org.scalablytyped" %%% "avvio" % "6.0.1-24495d",
  "org.scalablytyped" %%% "busboy" % "v0.2.13-dt-20180214Z-b18363",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-5ae6cc",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-6ad3bc",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-74fa1d",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-b4e1d0",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-79aadb",
  "org.scalablytyped" %%% "fastify" % "2.0.0-a43550",
  "org.scalablytyped" %%% "fastify-plugin" % "1.5.0-623ae6",
  "org.scalablytyped" %%% "fastq" % "1.6.0-9c7476",
  "org.scalablytyped" %%% "find-my-way" % "2.0.1-e4f607",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190212Z-ddd9f9",
  "org.scalablytyped" %%% "proxy-addr" % "2.0-dt-20180214Z-46534e",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-49ea08",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-999cd8",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-683770",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-041927",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-7b316e",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-b2f4a2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        