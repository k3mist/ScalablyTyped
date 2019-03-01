organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.2-2dd2ab"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-311c0c",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180510Z-a51975",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-62bf37",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d0d477",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-7dc944",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20181213Z-5c6648",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-bc2541",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-e580c8",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190212Z-a11dd6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8cfae8",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-dfd183",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-a420cb",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20190212Z-22de5e",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "typedoc" % "0.14.2-b4bac2",
  "org.scalablytyped" %%% "typescript" % "3.3.3-a1b20b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        