organization := "org.scalablytyped"
name := "ink-spinner"
version := "2.0-dt-20190225Z-ba2b9d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-025618",
  "org.scalablytyped" %%% "chalk" % "2.4.2-763e72",
  "org.scalablytyped" %%% "cli-spinners" % "1.3-dt-20190118Z-f240a5",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1a53a",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-f64939",
  "org.scalablytyped" %%% "ink" % "0.5-dt-20190126Z-8184a1",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f6f25d",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-c3ff6d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        