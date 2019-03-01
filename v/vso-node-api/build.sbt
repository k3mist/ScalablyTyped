organization := "org.scalablytyped"
name := "vso-node-api"
version := "6.5.0-9e8e29"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "tunnel" % "0.0-dt-20180214Z-f942c2",
  "org.scalablytyped" %%% "typed-rest-client" % "1.1.2-9294bb",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190228Z-8ff14c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        