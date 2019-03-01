organization := "org.scalablytyped"
name := "gulp-tslint"
version := "8.1.4-53d9bd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-311c0c",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-0263ab",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20190212Z-8822ca",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-2da6f7",
  "org.scalablytyped" %%% "chalk" % "2.4.2-56b83b",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-de57e0",
  "org.scalablytyped" %%% "commander" % "2.19.0-4e3db1",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-92e5f2",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-6046e2",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-62bf37",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-7dc944",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-9c0bc6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8cfae8",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-dfd183",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-7c0220",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-a04248",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-e45a81",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-35df2d",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9b6ae7",
  "org.scalablytyped" %%% "tslint" % "5.12.1-c76017",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-8ca3d2",
  "org.scalablytyped" %%% "typescript" % "3.3.3-a1b20b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        