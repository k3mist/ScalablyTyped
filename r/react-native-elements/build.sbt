organization := "org.scalablytyped"
name := "react-native-elements"
version := "1.0.0-9beea2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-8485ec",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-f30dfb",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1a53a",
  "org.scalablytyped" %%% "csstype" % "2.6.2-b36da9",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-417d08",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-0a072d",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20190212Z-20ead5",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f6f25d",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-6fcd2f",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-6cd4e1",
  "org.scalablytyped" %%% "react-native-ratings" % "6.3.0-c90b54",
  "org.scalablytyped" %%% "react-native-status-bar-height" % "2.1-dt-20181024Z-c1d7f6",
  "org.scalablytyped" %%% "react-native-vector-icons" % "4.6-dt-20181108Z-2a7d1d",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        