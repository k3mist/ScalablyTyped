organization := "org.scalablytyped"
name := "uifabric__styling"
version := "6.41.0-761e08"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-4dc439",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.60-f80b69",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-9bad87",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-e01ec8",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-b8fd27",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9b6ae7",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.15.2-76c84a",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-99f63d",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.29.2-451b97")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        