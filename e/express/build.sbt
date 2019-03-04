organization := "org.scalablytyped"
name := "express"
version := "4.16-dt-20190122Z-7cc9b6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-17a4a6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-95a423",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-53ef34",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5ddd77",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-d611ff",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-183f08",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-83c3c1",
  "org.scalablytyped" %%% "std" % "3.3-8d1cc2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        