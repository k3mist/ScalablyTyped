organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-937f60"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-f67bbd",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-9fc8da",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-5bd580",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190213Z-e905ef",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-ac1c32",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-50cea4",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        