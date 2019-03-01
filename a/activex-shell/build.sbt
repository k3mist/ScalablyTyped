organization := "org.scalablytyped"
name := "activex-shell"
version := "1.0-dt-20190213Z-ff4afe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-7eea2f",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-7b65f3",
  "org.scalablytyped" %%% "activex-shdocvw" % "1.1-dt-20190213Z-d9d460",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        