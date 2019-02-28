organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181026Z-01e40a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-4463ab",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-76a09f",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-ae0637",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-6c9278",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-612ab2",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        