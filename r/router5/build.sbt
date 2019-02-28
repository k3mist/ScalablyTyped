organization := "org.scalablytyped"
name := "router5"
version := "7.0.1-fed74d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-45c7ef",
  "org.scalablytyped" %%% "route-node" % "3.4.2-8ff3a5",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.0-dd229f",
  "org.scalablytyped" %%% "search-params" % "2.1.3-7d9843",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-7a8914")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        