organization := "org.scalablytyped"
name := "protractor-browser-logs"
version := "1.0-dt-20190212Z-c8fc2b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "0.4-dt-20190202Z-968d3f",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-025618",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-c9addf",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-1e0f96",
  "org.scalablytyped" %%% "chalk" % "2.4.2-763e72",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1a53a",
  "org.scalablytyped" %%% "del" % "3.0-dt-20180311Z-d47d2f",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-f64939",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-b61bd6",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ad9cd5",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-cdacd7",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20190212Z-438409",
  "org.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181026Z-259adf",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-337a74",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-972581",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180214Z-4e3064",
  "org.scalablytyped" %%% "protractor" % "5.4.2-a13a20",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-73b39d",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-98dbaf",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-a084a9",
  "org.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20190212Z-28bce6",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-041927",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-1767b4",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-c3ff6d",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-93c5ad",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-5008b0",
  "org.scalablytyped" %%% "webdriver-manager" % "12.1.1-293889",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-2680aa")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        