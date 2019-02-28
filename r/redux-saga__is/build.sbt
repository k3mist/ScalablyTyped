organization := "org.scalablytyped"
name := "redux-saga__is"
version := "1.0.1-031e93"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "redux" % "4.0.1-b55ee8",
  "org.scalablytyped" %%% "redux-saga__symbols" % "1.0.1-9ed51a",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.0-d73885",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-7a8914")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        