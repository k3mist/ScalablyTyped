organization := "org.scalablytyped"
name := "objection"
version := "1.6.2-2e5949"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.9.1-ac751e",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-44daf5",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-b4e1d0",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-79aadb",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20190228Z-b3374a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-0a072d",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-49ea08",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-b2f4a2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        