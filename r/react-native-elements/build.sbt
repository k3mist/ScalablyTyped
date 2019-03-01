organization := "org.scalablytyped"
name := "react-native-elements"
version := "1.0.0-550a95"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-11998f",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-4dc0aa",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-de57e0",
  "org.scalablytyped" %%% "csstype" % "2.6.2-4dc439",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-834e25",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-e580c8",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20190212Z-2c1026",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-9bad87",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-e01ec8",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-dd29e5",
  "org.scalablytyped" %%% "react-native-ratings" % "6.3.0-24b79a",
  "org.scalablytyped" %%% "react-native-status-bar-height" % "2.1-dt-20181024Z-263367",
  "org.scalablytyped" %%% "react-native-vector-icons" % "4.6-dt-20181108Z-808260",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        