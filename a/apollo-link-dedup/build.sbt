organization := "org.scalablytyped"
name := "apollo-link-dedup"
version := "1.0.15-ba89e6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-fc0551",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-3f8a4b",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-eee2a8",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-569cf7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        