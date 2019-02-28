organization := "org.scalablytyped"
name := "vue-server-renderer"
version := "2.6.6-cfa4cc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-025618",
  "org.scalablytyped" %%% "chalk" % "2.4.2-763e72",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1a53a",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-f64939",
  "org.scalablytyped" %%% "hash-sum" % "1.0-dt-20180822Z-3818b4",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180507Z-a33ba5",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-0a072d",
  "org.scalablytyped" %%% "lodash_dot_template" % "4.4-dt-20190212Z-8d3b3a",
  "org.scalablytyped" %%% "lodash_dot_uniq" % "4.5-dt-20190212Z-722c43",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-8e8420",
  "org.scalablytyped" %%% "serialize-javascript" % "1.5-dt-20181015Z-360542",
  "org.scalablytyped" %%% "source-map" % "0.7.3-f37bcc",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-c3ff6d",
  "org.scalablytyped" %%% "vue" % "2.6.6-9d786e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        