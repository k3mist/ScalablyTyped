organization := "org.scalablytyped"
name := "router5"
version := "7.0.1-82f82d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-390176",
  "org.scalablytyped" %%% "route-node" % "3.4.2-3b5291",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.0-a17924",
  "org.scalablytyped" %%% "search-params" % "2.1.3-6fa2f4",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1c07bd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        