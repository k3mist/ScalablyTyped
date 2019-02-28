organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.1-7f5c1b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.9.1-ac751e",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-44daf5",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-413f1c",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-2284e3",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-066466",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-b4e1d0",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-79aadb",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d3c5fa",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-3b61c9",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-6fcdd9",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-a0ae92",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-f36d8d",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-49ea08",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-b2f4a2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        