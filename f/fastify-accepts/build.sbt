organization := "org.scalablytyped"
name := "fastify-accepts"
version := "0.5-dt-20181119Z-239985"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-c88291",
  "org.scalablytyped" %%% "ajv" % "6.9.1-042b8e",
  "org.scalablytyped" %%% "avvio" % "6.0.1-028d15",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-52e12d",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-b7cbfb",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-3e62ee",
  "org.scalablytyped" %%% "fastify" % "2.0.0-2d5efc",
  "org.scalablytyped" %%% "fastq" % "1.6.0-a0bf56",
  "org.scalablytyped" %%% "find-my-way" % "2.0.1-47d349",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190212Z-596663",
  "org.scalablytyped" %%% "proxy-addr" % "2.0-dt-20180214Z-8b0fe8",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-9f42dc",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-059cee",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-a4a8cf",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-a6c2aa",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-b7cc8f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        