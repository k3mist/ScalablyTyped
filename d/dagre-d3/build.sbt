organization := "org.scalablytyped"
name := "dagre-d3"
version := "0.4-dt-20190212Z-173e78"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.7-dt-20190212Z-53c903",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20190221Z-085ec0",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-079679",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-3faac9",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-3c7ca4",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-f83789",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-9872ed",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-ea4531",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-5f3149",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-4e2e18",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190212Z-d2b499",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-7b6b19",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181228Z-df0825",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-90f1b1",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-4e4998",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-7bd726",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-3682bd",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-2e97a4",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-02a040",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20190212Z-5134e3",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-3e7e64",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-176b96",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-57c830",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20190212Z-d4ac06",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-8b712a",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-1af412",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-f3d17f",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-95ccbd",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-ed3a18",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-553a24",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-9114ea",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-0f9348",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20190212Z-472e1a",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190212Z-dfe19a",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        