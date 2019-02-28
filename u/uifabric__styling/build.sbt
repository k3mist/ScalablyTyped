organization := "org.scalablytyped"
name := "uifabric__styling"
version := "6.41.0-8ee04c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-b36da9",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.60-b27d49",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f6f25d",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-6fcd2f",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-6749e4",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "tslib" % "1.9.3-ca2588",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.15.2-5bbc3a",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-bc8550",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.29.2-348669")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        