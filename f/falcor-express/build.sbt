organization := "org.scalablytyped"
name := "falcor-express"
version := "0.1.2-dt-20180214Z-fba925"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-b2fa11",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fbc342",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-994326",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-19b575",
  "org.scalablytyped" %%% "falcor" % "0.1-dt-20190212Z-2fb514",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20180214Z-5fdec0",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20180214Z-9a4c32",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-4d709a",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-d72e89",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-46bd6e",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        