organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20181022Z-4c9057"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-a82f0a",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-b2fa11",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-cccbef",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-08277f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fbc342",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-156a02",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-994326",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-19b575",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-3f8a4b",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-dedaab",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-ccf972",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-22b526",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-5cc1e5",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-dcd80f",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-f2cef2",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-770cba",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-4d709a",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-92508b",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-997a4d",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-13b19c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-d72e89",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-46bd6e",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-19b1df",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        