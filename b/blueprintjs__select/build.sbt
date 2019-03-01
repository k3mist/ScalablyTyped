organization := "org.scalablytyped"
name := "blueprintjs__select"
version := "3.6.1-2413c4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.13.0-e30ac1",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.6.0-7ed9de",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-36eedf",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-4af615",
  "org.scalablytyped" %%% "csstype" % "2.6.2-4dc439",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180806Z-18aadd",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-872a59",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-9bad87",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-e01ec8",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-b8fd27",
  "org.scalablytyped" %%% "react-popper" % "1.3.3-ad41e6",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-4d24f8",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-347326",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9b6ae7",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-a4648f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        