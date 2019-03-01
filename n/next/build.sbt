organization := "org.scalablytyped"
name := "next"
version := "8.0-dt-20190220Z-0ce6b4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-f2e7b5",
  "org.scalablytyped" %%% "csstype" % "2.6.2-4dc439",
  "org.scalablytyped" %%% "next-server" % "7.0-dt-20190220Z-e881f0",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-a70bf3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-9bad87",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-e01ec8",
  "org.scalablytyped" %%% "react-loadable" % "5.5-dt-20190131Z-714ed7",
  "org.scalablytyped" %%% "source-map" % "0.7.3-bbbf0a",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-58f3f9",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-cb23f6",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-3d69b0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        