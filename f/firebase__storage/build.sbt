organization := "org.scalablytyped"
name := "firebase__storage"
version := "0.2.8-a5c2b7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.9-d31df3",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.4-0f94e3",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.5-010674",
  "org.scalablytyped" %%% "firebase__util" % "0.2.7-1b50d4",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9b6ae7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        