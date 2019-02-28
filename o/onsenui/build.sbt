organization := "org.scalablytyped"
name := "onsenui"
version := "2.10.6-be007c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-fb63b8",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-47481f",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ad9cd5",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-07b6ca",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-522695",
  "org.scalablytyped" %%% "gulp-protractor" % "v1.0.0-dt-20180214Z-4cecdc",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-337a74",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190212Z-1e85d8",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-97b26b",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-4ed116",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-ddf1db")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        