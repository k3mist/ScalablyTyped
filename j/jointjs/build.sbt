organization := "org.scalablytyped"
name := "jointjs"
version := "2.2.1-ab4119"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20190215Z-36128c",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20190212Z-472e1a",
  "org.scalablytyped" %%% "graphlib" % "2.1.1-dt-20180214Z-3777be",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-56608c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-e580c8",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-4f3b4b",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190228Z-8ff14c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        