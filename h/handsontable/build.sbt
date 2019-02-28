organization := "org.scalablytyped"
name := "handsontable"
version := "6.2.2-6bdb52"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bignumber_dot_js" % "8.0.2-38ff83",
  "org.scalablytyped" %%% "moment" % "2.24.0-c8a799",
  "org.scalablytyped" %%% "numbro" % "2.1.2-6d1b7e",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20190224Z-d50082",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        