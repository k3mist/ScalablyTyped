organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.4.2-493f91"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.2-62fcfc",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-95d235",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-4e335e",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-6f978c",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-576c77",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180214Z-6391c6",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-0bce5f",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-0c1bb4",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-42813f",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-95aa73",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-759791",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-6e0d0d",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-8e192a",
  "org.scalablytyped" %%% "gaxios" % "1.7.0-ae87c9",
  "org.scalablytyped" %%% "gcp-metadata" % "0.9.3-4d0c6f",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "0.14.1-334db9",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.0-e30e30",
  "org.scalablytyped" %%% "google-cloud__common" % "0.31.0-61265d",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.1.2-a05308",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-d0b9a4",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-54b96f",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-41d20d",
  "org.scalablytyped" %%% "gtoken" % "2.3.2-9a3711",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-81586c",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-c4938b",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-4fa72b",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-8ec692",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-785d4d",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180214Z-b969f4",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-a70bf3",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-975431",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180214Z-07b892",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-783f38",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-157a84",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-627e8d",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-b40020",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-a04248",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-c64776",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-05b0d4",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-d14da1",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-05726a",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-689b26",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-93f367",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180214Z-61ed0a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        