organization := "org.scalablytyped"
name := "plotly_dot_js"
version := "1.44-dt-20190221Z-c527c6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.7-dt-20190212Z-a8fbde",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20190221Z-d29b90",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-355d59",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-fa6477",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-188a67",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-dd7a44",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-4463ab",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-d31cba",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-fda03b",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-468822",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190212Z-7f46ea",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-4ca8d4",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181228Z-d0fc5b",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-db599b",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-8fea31",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-e1f3a9",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-5bca9e",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-76a09f",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-c45b64",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20190212Z-6d456f",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-2e8b6e",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-dfc67a",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-1ff215",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20190212Z-745859",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-ae0637",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-6aa1c9",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-bc8fca",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-5bc14d",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-55d424",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-6c9278",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-6c9adf",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-612ab2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190212Z-497947",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        