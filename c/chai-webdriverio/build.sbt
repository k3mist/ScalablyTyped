organization := "org.scalablytyped"
name := "chai-webdriverio"
version := "0.4-dt-20190128Z-24610d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-1e0f96",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-f4f2e6",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-6ad3bc",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-b61bd6",
  "org.scalablytyped" %%% "grapheme-splitter" % "1.0.4-d72a4b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-0a072d",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20190212Z-20ead5",
  "org.scalablytyped" %%% "lodash_dot_zip" % "4.2-dt-20190212Z-ab99ff",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-98dbaf",
  "org.scalablytyped" %%% "serialize-error" % "2.1-dt-20180607Z-b570d3",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-93c5ad",
  "org.scalablytyped" %%% "webdriver" % "5.6.0-60178d",
  "org.scalablytyped" %%% "webdriverio" % "5.6.0-d6139b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        