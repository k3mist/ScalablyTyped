organization := "org.scalablytyped"
name := "samchon"
version := "2.1.4-284cb4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ecol" % "1.0.4-2e992e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "sxml" % "1.0.3-c53950",
  "org.scalablytyped" %%% "tstl" % "2.1.2-0ad9b7",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-6a3d66",
  "org.scalablytyped" %%% "websocket" % "0.0-unknown-dt-20180823Z-ea6216")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        