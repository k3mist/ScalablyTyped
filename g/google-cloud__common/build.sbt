organization := "org.scalablytyped"
name := "google-cloud__common"
version := "0.31.0-645200"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.2-51ad52",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-2ccb0a",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-5f5199",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-1e0f96",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-a01e01",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-bda119",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-c3941c",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-80fafa",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-b61bd6",
  "org.scalablytyped" %%% "gaxios" % "1.7.0-59789f",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-068b9e",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.0-e73c0e",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-90faa6",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-a1ab24",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-abdd7d",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-8eb2a9",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-9624e2",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-dcc8fc",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-4d709a",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-39a899",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-4e3891",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-e2de55",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-98dbaf",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-8d2931",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-041927",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-468d45",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-93c5ad")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        