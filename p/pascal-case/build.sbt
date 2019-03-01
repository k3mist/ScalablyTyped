organization := "org.scalablytyped"
name := "pascal-case"
version := "2.0.1-ae24b6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-d2e043",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-1fa5fd",
  "org.scalablytyped" %%% "no-case" % "2.3.2-8c8edc",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-0f45bb",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-8aa7bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        