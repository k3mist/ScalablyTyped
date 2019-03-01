organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.6.1-99255d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-0263ab",
  "org.scalablytyped" %%% "chalk" % "2.4.2-56b83b",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-de57e0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-52e12d",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-6046e2",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d0d477",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-7dc944",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20190221Z-9d3597",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.1.0-a784aa",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-e580c8",
  "org.scalablytyped" %%% "log-update" % "2.0-dt-20180214Z-e18cd2",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8cfae8",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-eff3fe",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-211487",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-db42df",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-993fc8",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-93673f",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-57ea87",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-7cf0dd",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-9f10b7",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-00ee5b",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-d9c9e9",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-4cc0f0",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-fb85c8",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-833bdd",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-6ab154",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-d6d7ce",
  "org.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181119Z-6e291d",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180530Z-ce8b9d",
  "org.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180214Z-69ed98",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-e45a81",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-35df2d",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-05726a",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-6eb795",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9b6ae7",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180214Z-991bec",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180323Z-056b43",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-b6c989")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        