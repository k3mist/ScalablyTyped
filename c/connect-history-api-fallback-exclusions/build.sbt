organization := "org.scalablytyped"
name := "connect-history-api-fallback-exclusions"
version := "1.5-dt-20190205Z-0703b6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-512e8c",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-4a1bde",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        