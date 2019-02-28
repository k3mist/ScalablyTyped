organization := "org.scalablytyped"
name := "blueprintjs__timezone"
version := "3.3.0-ac2168"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.13.0-a46a4f",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.6.0-60dcab",
  "org.scalablytyped" %%% "blueprintjs__select" % "3.6.1-94446b",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-f47f75",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-53a7ac",
  "org.scalablytyped" %%% "csstype" % "2.6.2-b36da9",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180806Z-90d8e2",
  "org.scalablytyped" %%% "moment" % "2.24.0-c8a799",
  "org.scalablytyped" %%% "moment-timezone" % "0.5-dt-20181231Z-93bbbc",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-2dba91",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f6f25d",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-6fcd2f",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-6749e4",
  "org.scalablytyped" %%% "react-popper" % "1.3.3-1b104e",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-7b9f9e",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-50a124",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "tslib" % "1.9.3-ca2588",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-f7e721")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        