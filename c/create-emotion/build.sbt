organization := "org.scalablytyped"
name := "create-emotion"
version := "10.0.7-fa570e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-b36da9",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.7-27aefe",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.4-8532bc",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-65813d",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-011774",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        