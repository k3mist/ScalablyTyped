organization := "org.scalablytyped"
name := "cypress"
version := "3.1.5-6644e0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-025618",
  "org.scalablytyped" %%% "blob-util" % "1.3-dt-20180214Z-6bda05",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-44daf5",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-1e0f96",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-f4f2e6",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181023Z-adaa34",
  "org.scalablytyped" %%% "chalk" % "2.4.2-763e72",
  "org.scalablytyped" %%% "check-more-types" % "2.24.0-242324",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1a53a",
  "org.scalablytyped" %%% "commander" % "2.19.0-993c01",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181205Z-17aed0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-5ae6cc",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-f64939",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20180310Z-79d752",
  "org.scalablytyped" %%% "extract-zip" % "1.6-dt-20180214Z-7276db",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-b61bd6",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d3c5fa",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180214Z-0bf638",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ad9cd5",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-703bc1",
  "org.scalablytyped" %%% "is-installed-globally" % "0.1-dt-20181212Z-d857d6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-295e43",
  "org.scalablytyped" %%% "lazy-ass" % "1.6.0-c97b80",
  "org.scalablytyped" %%% "listr" % "0.13-dt-20180306Z-a66dc3",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-0a072d",
  "org.scalablytyped" %%% "log-symbols" % "2.0-dt-20180214Z-bfa089",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-337a74",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-972581",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20190212Z-776d4e",
  "org.scalablytyped" %%% "moment" % "2.24.0-c8a799",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20190228Z-815c88",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-98dbaf",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190223Z-56cc8d",
  "org.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181212Z-0358ae",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-c8cc19",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-c3ff6d",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20190212Z-ab60a6",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-93c5ad",
  "org.scalablytyped" %%% "yauzl" % "2.9-dt-20181229Z-be3bb7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        