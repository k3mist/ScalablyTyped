organization := "org.scalablytyped"
name := "react-md"
version := "1.9.2-5ccf30"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-36eedf",
  "org.scalablytyped" %%% "csstype" % "2.6.2-4dc439",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-9bad87",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-e01ec8",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-b8fd27",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20190212Z-e3f168",
  "org.scalablytyped" %%% "react-swipeable-views" % "0.12-dt-20180806Z-dc40f5",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-4d24f8",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-347326",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        