organization := "org.scalablytyped"
name := "material__radio"
version := "0.35-dt-20190213Z-ddde2a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190213Z-ae4ca8",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190213Z-d0fb4e",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-34855c",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        