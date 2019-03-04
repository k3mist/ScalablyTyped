organization := "org.scalablytyped"
name := "d3"
version := "5.7-dt-20190212Z-159cc0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20190221Z-56f8cc",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-8adefe",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-a0fe87",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-097b3a",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-a57929",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-7228cd",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-c92918",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-d8be4d",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-e8cba8",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190212Z-f3c04d",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-2299a0",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181228Z-05810c",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-9758d8",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-622a9b",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-e126eb",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-138107",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-fde5fd",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-951458",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20190212Z-6f48b7",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-2e9fb1",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-6fab73",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-90ff34",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20190212Z-bdca1b",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-b898c9",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-8ac6df",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-d1315b",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-4d42f4",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-f316ea",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-94431d",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-779237",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-f484fd",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190212Z-ff9513",
  "org.scalablytyped" %%% "std" % "3.3-8d1cc2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        