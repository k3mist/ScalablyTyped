organization := "org.scalablytyped"
name := "redux-saga-tester"
version := "1.0-dt-20181130Z-cb13f1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "redux" % "4.0.1-b55ee8",
  "org.scalablytyped" %%% "redux-saga" % "1.0.1-8d8e92",
  "org.scalablytyped" %%% "redux-saga__core" % "1.0.1-688bc2",
  "org.scalablytyped" %%% "redux-saga__deferred" % "1.0.1-037d19",
  "org.scalablytyped" %%% "redux-saga__delay-p" % "1.0.1-e3af1b",
  "org.scalablytyped" %%% "redux-saga__is" % "1.0.1-031e93",
  "org.scalablytyped" %%% "redux-saga__symbols" % "1.0.1-9ed51a",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.0-d73885",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-7a8914",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-531a6f",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-f45e0c",
  "org.scalablytyped" %%% "typescript-tuple" % "2.1.1-fe61ee")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        