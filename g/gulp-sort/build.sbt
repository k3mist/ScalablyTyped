organization := "org.scalablytyped"
name := "gulp-sort"
version := "0.0-unknown-dt-20180214Z-975ae5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-025618",
  "org.scalablytyped" %%% "chalk" % "2.4.2-763e72",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1a53a",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-f64939",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20180315Z-1cea64",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-c3ff6d",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-468d45",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-4ed116")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        