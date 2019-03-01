organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.1-424be2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.9.1-042b8e",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-f21d22",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-5f51f6",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-de8c8d",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-00a9a4",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-b7cbfb",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-3e62ee",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d0d477",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-b358cc",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-9c0bc6",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-7cf881",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-37676e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-9f42dc",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-b7cc8f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        