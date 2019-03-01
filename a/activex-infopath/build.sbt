organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-e1b8b1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-a3c235",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-7eea2f",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-7b65f3",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190213Z-645a3d",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-82576c",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-6fd3ac",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        