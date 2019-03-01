organization := "org.scalablytyped"
name := "underscore-ko"
version := "1.4-dt-20180214Z-62aaab"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190218Z-2f7abc",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190228Z-8ff14c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        