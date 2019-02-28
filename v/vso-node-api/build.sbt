organization := "org.scalablytyped"
name := "vso-node-api"
version := "6.5.0-c99f7e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "tunnel" % "0.0-dt-20180214Z-27c583",
  "org.scalablytyped" %%% "typed-rest-client" % "1.1.2-c44278",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190226Z-006898")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        