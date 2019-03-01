organization := "org.scalablytyped"
name := "emotion-theming"
version := "10.0.7-586a3f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-4dc439",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-834e25",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180214Z-a86c85",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-9bad87",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-e01ec8",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        