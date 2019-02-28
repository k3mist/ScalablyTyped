organization := "org.scalablytyped"
name := "google-auth-library"
version := "3.1.0-e73c0e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.2-51ad52",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-5f5199",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-c3941c",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-80fafa",
  "org.scalablytyped" %%% "gaxios" % "1.7.0-59789f",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-068b9e",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-abdd7d",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-8eb2a9",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-9624e2",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-dcc8fc",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-4d709a",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-39a899",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-4e3891",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-e2de55",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-041927",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        