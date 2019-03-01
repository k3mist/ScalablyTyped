organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-ad4e93"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-0263ab",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-f21d22",
  "org.scalablytyped" %%% "chalk" % "2.4.2-56b83b",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-de57e0",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-6046e2",
  "org.scalablytyped" %%% "grammarkdown" % "2.0.12-9dab2f",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180507Z-b930ab",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-bc2541",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-9c0bc6",
  "org.scalablytyped" %%% "jsdom" % "12.2-dt-20190212Z-68b6d3",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20180214Z-1c7a2f",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180611Z-4ebcd3",
  "org.scalablytyped" %%% "prex" % "0.4.5-2e8b9e",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-e45a81",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-689b26")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        