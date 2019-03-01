organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20180712Z-809a58"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.9.1-042b8e",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-f21d22",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-91feb1",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-43529f",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-b7cbfb",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-3e62ee",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-8d56ef",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-9c6657",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-c44586",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20190228Z-2dccb2",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-e580c8",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-1afeb4",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-9d5f18",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "objection" % "1.6.2-6a489f",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-782916",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-9f42dc",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-f91d66",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-b7cc8f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        