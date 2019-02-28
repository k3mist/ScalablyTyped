organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-25a254"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-b36da9",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-c45b64",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-1ff215",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-6aa1c9",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-bc8fca",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f6f25d",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-6fcd2f",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-6cd4e1",
  "org.scalablytyped" %%% "react-native-svg" % "9.2.4-0aaaf5",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        