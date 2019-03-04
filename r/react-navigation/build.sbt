organization := "org.scalablytyped"
name := "react-navigation"
version := "3.0-dt-20190224Z-9cf07d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-1a329a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-a0043b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-ff5ee1",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-f0aa24",
  "org.scalablytyped" %%% "std" % "3.3-8d1cc2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        