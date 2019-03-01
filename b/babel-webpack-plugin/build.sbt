organization := "org.scalablytyped"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-ec9903"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-f2e7b5",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-802bb8",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-775b69",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-74a5ad",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-c4bcb3",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190218Z-44520c",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-fc356a",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "source-map" % "0.7.3-bbbf0a",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-58f3f9",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-cb23f6",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-3d69b0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        