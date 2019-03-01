organization := "org.scalablytyped"
name := "3d-bin-packing"
version := "1.1.3-764e9b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ecol" % "1.0.4-e384dc",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "samchon" % "2.1.4-5ae038",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "sxml" % "1.0.3-c7af10",
  "org.scalablytyped" %%% "tstl" % "2.1.2-edde23",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-badaf9",
  "org.scalablytyped" %%% "websocket" % "0.0-unknown-dt-20180823Z-38341b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        