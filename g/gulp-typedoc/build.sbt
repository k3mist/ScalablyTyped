organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.2-a30dbc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-7e7e9e",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180510Z-b3d170",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-24137d",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d3c5fa",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ad9cd5",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20181213Z-75f470",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-a1aa06",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-0a072d",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190212Z-5041ea",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-337a74",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-795ece",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-15292c",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190212Z-3e9cc1",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "typedoc" % "0.14.2-cd4fe3",
  "org.scalablytyped" %%% "typescript" % "3.3.3-010c4f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        