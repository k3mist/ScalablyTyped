organization := "org.scalablytyped"
name := "topojson-simplify"
version := "3.0-dt-20180414Z-e1fcf5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190212Z-dfe19a",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20190213Z-641fcd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        