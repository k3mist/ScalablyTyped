organization := "org.scalablytyped"
name := "aurelia-binding"
version := "2.2.0-8260bd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-64d25d",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.1-00bbda",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.5-5a10e0",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.1-2c0451",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.2-3b5274",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        