organization := "org.scalablytyped"
name := "ionic__utils-fs"
version := "1.1.0-a784aa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-52e12d",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d0d477",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-05726a",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9b6ae7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        