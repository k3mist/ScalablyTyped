organization := "org.scalablytyped"
name := "d3-sankey"
version := "0.7-dt-20181115Z-c5fd40"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-c45b64",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-6aa1c9",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        