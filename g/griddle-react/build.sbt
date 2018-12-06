organization := "com.scalablytyped"
name := "griddle-react"
version := "1.13.1-f5786c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-eccde3",
  "com.scalablytyped" %%% "immutable" % "3.8.2-2cc47a",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-7b533e",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181122Z-2ddd12",
  "com.scalablytyped" %%% "react-redux" % "6.0-dt-20181121Z-bf3be2",
  "com.scalablytyped" %%% "recompose" % "0.30-dt-20181120Z-3d64cf",
  "com.scalablytyped" %%% "redux" % "4.0.1-d3681d",
  "com.scalablytyped" %%% "reselect" % "4.0.0-c2ed2f",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-e6336c",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        