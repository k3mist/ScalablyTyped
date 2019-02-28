organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-700b50"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-483629",
  "org.scalablytyped" %%% "cfb" % "1.1.0-1777d2",
  "org.scalablytyped" %%% "codepage" % "1.14.0-b143a0",
  "org.scalablytyped" %%% "commander" % "2.19.0-993c01",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-a3d3f6",
  "org.scalablytyped" %%% "frac" % "1.1.2-e35042",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "printj" % "1.1.2-5a2de1",
  "org.scalablytyped" %%% "ssf" % "0.10.2-81f1f0",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        