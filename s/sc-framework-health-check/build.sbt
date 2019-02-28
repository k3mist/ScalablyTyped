organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20181218Z-2eec65"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-d0311a",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-b2fa11",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190205Z-4f45d6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fbc342",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-b2dd96",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-994326",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-19b575",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-fd0227",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-cd9e85",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-4d709a",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-d72e89",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-f68ff6",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-a0e648",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-37c89f",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-b858ff",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-46bd6e",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-d08afc",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190205Z-726b79",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-116ab3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        