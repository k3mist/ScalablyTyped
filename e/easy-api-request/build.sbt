organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20181121Z-f3385a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0020ba",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-bf7784",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-768261",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-de294e",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-921be9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-2cedcf",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-67d3c6",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-56253f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-da54de",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ad4a56",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-0cc572")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        