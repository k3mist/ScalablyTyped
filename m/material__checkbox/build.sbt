organization := "org.scalablytyped"
name := "material__checkbox"
version := "0.35-dt-20190213Z-263d66"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190213Z-707a96",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190213Z-677d08",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-9a407f",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        