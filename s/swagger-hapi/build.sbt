organization := "org.scalablytyped"
name := "swagger-hapi"
version := "0.7-dt-20181022Z-2d87d2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-84f3c2",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-91feb1",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-3a2da2",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-43529f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-25bc6e",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-de2fa5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-512e8c",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-8d56ef",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-9c6657",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-c44586",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-785d4d",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-1afeb4",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-9d5f18",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-782916",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-4a1bde",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190212Z-4478e3",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-9f2cda",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-f91d66",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-69aa42",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-3f7670",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190220Z-c8efd9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        