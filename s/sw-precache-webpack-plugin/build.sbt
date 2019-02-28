organization := "org.scalablytyped"
name := "sw-precache-webpack-plugin"
version := "0.11-dt-20180507Z-eb7125"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-900497",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "path-to-regexp" % "3.0.0-0ffab3",
  "org.scalablytyped" %%% "source-map" % "0.7.3-f37bcc",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "sw-precache" % "5.2-dt-20180504Z-2dc9a3",
  "org.scalablytyped" %%% "sw-toolbox" % "3.6.0-5976d1",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-710a09",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-13f33e",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-34d921")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        