organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-3b77e6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-025618",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-44daf5",
  "org.scalablytyped" %%% "chalk" % "2.4.2-763e72",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1a53a",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-f64939",
  "org.scalablytyped" %%% "grammarkdown" % "2.0.12-ae69b2",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180507Z-a33ba5",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-a1aa06",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-6fcdd9",
  "org.scalablytyped" %%% "jsdom" % "12.2-dt-20190212Z-e19639",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20180214Z-536394",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180611Z-fb61bd",
  "org.scalablytyped" %%% "prex" % "0.4.5-f81cb6",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-c3ff6d",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-93c5ad")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        