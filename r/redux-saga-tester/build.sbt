organization := "org.scalablytyped"
name := "redux-saga-tester"
version := "1.0-dt-20181130Z-00201c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "redux" % "4.0.1-e7ca00",
  "org.scalablytyped" %%% "redux-saga" % "1.0.1-5507a1",
  "org.scalablytyped" %%% "redux-saga__core" % "1.0.1-8c46b9",
  "org.scalablytyped" %%% "redux-saga__deferred" % "1.0.1-f177c2",
  "org.scalablytyped" %%% "redux-saga__delay-p" % "1.0.1-e79b96",
  "org.scalablytyped" %%% "redux-saga__is" % "1.0.1-44a1b8",
  "org.scalablytyped" %%% "redux-saga__symbols" % "1.0.1-dfbef0",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.0-c6e6f9",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1c07bd",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-19a234",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-152fbf",
  "org.scalablytyped" %%% "typescript-tuple" % "2.1.1-e0bf2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        