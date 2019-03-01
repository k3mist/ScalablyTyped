organization := "org.scalablytyped"
name := "typed-github-api"
version := "1.2.6-f2012b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-4e335e",
  "org.scalablytyped" %%% "blow-http-statuses" % "0.2.4-f0395f",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-84f3c2",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-25bc6e",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180725Z-32b236",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-de2fa5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-512e8c",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-cb8620",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-419830",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-785d4d",
  "org.scalablytyped" %%% "moment" % "2.24.0-142af7",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-a70bf3",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-bfb7a3",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-4a1bde",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-059cee",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-a4a8cf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-9f2cda",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-b8277f",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-7ffcd8",
  "org.scalablytyped" %%% "typescript-event-handler" % "1.0.0-666b33",
  "org.scalablytyped" %%% "winston" % "3.2.1-93c49e",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-24729a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        