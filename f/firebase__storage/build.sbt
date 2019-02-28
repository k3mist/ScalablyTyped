organization := "org.scalablytyped"
name := "firebase__storage"
version := "0.2.8-233a60"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.9-e28fd4",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.4-6f89a3",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.5-b532da",
  "org.scalablytyped" %%% "firebase__util" % "0.2.7-e17424",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "tslib" % "1.9.3-ca2588")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        