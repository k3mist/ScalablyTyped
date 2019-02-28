organization := "org.scalablytyped"
name := "swagger-express-mw"
version := "0.7-dt-20181022Z-126451"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-b2fa11",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-cccbef",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-8b4f5d",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-08277f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fbc342",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-994326",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-19b575",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-dedaab",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-22b526",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-5cc1e5",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-4d709a",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-92508b",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-997a4d",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-13b19c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-d72e89",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190212Z-7273d8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-46bd6e",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-19b1df",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-8e6767",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.6-dt-20190212Z-c0b8fb",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20190220Z-bdd642")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        