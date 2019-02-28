organization := "org.scalablytyped"
name := "gulp-tslint"
version := "8.1.4-59d063"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-7e7e9e",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-025618",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20190212Z-694072",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-8d2378",
  "org.scalablytyped" %%% "chalk" % "2.4.2-763e72",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1a53a",
  "org.scalablytyped" %%% "commander" % "2.19.0-993c01",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-f1230c",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-f64939",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-24137d",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ad9cd5",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-6fcdd9",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-337a74",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-795ece",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-8e8420",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-041927",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-c3ff6d",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-4b277b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-ca2588",
  "org.scalablytyped" %%% "tslint" % "5.12.1-3781d0",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-afc7c5",
  "org.scalablytyped" %%% "typescript" % "3.3.3-010c4f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        