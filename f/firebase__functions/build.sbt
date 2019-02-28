organization := "org.scalablytyped"
name := "firebase__functions"
version := "0.3.7-3c29b3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.9-e28fd4",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.4-6f89a3",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.3-11af80",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.5-fe28d3",
  "org.scalablytyped" %%% "firebase__util" % "0.2.7-e17424",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-5158a9",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "tslib" % "1.9.3-ca2588")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        