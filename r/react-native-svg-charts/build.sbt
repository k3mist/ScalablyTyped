organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-41600d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-4dc439",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-02a040",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-57c830",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-1af412",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-f3d17f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-9bad87",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-e01ec8",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-dd29e5",
  "org.scalablytyped" %%% "react-native-svg" % "9.2.4-7704a2",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        