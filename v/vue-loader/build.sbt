organization := "org.scalablytyped"
name := "vue-loader"
version := "15.6.4-78a2bb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-0263ab",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-f2e7b5",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-f21d22",
  "org.scalablytyped" %%% "chalk" % "2.4.2-56b83b",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-de57e0",
  "org.scalablytyped" %%% "consolidate" % "0.0-unknown-dt-20180712Z-4d8024",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-6046e2",
  "org.scalablytyped" %%% "hash-sum" % "1.0-dt-20180822Z-d1ee21",
  "org.scalablytyped" %%% "js-base64" % "2.3-dt-20180214Z-931d35",
  "org.scalablytyped" %%% "loader-utils" % "1.1-dt-20180306Z-7bc94e",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-8ec692",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "postcss" % "5.2.18-3b5705",
  "org.scalablytyped" %%% "prettier" % "1.16-dt-20190212Z-277d81",
  "org.scalablytyped" %%% "source-map" % "0.7.3-bbbf0a",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-e45a81",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-58f3f9",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-cb23f6",
  "org.scalablytyped" %%% "vue__component-compiler-utils" % "2.5.2-ebc2fe",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-3d69b0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        