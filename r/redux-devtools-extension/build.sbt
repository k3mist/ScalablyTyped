organization := "org.scalablytyped"
name := "redux-devtools-extension"
version := "2.13.8-2bd1dd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "redux" % "4.0.1-c5cabe",
  "org.scalablytyped" %%% "std" % "3.3-8d1cc2",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-9401e9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        