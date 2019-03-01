organization := "org.scalablytyped"
name := "create-emotion"
version := "10.0.7-53ddbc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-4dc439",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.7-9c3d80",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.4-d3272e",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-80eb5f",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-868586",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        