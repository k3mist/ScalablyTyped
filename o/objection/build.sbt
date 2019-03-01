organization := "org.scalablytyped"
name := "objection"
version := "1.6.2-6a489f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.9.1-042b8e",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-f21d22",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-b7cbfb",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-3e62ee",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20190228Z-2dccb2",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-e580c8",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-9f42dc",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-b7cc8f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        