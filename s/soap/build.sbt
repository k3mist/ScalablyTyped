organization := "org.scalablytyped"
name := "soap"
version := "0.26.0-cd6dee"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-f21d22",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-576c77",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-0bce5f",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-52e12d",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-02ae4e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-512e8c",
  "org.scalablytyped" %%% "finalhandler" % "0.0-unknown-dt-20180924Z-5f6e7c",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-8e192a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-e580c8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-785d4d",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-4a1bde",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-627e8d",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-0a2fa3",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-9f2cda",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "strip-bom" % "3.0-dt-20180214Z-e55f40",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-689b26",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-93f367")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        