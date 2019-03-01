organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181026Z-1aa1b2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-9872ed",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-2e97a4",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-8b712a",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-553a24",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-0f9348",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        