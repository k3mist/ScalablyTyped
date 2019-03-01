organization := "org.scalablytyped"
name := "material__drawer"
version := "0.43-dt-20190213Z-ea7268"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190213Z-707a96",
  "org.scalablytyped" %%% "material__dom" % "0.43-dt-20190213Z-62281c",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190213Z-33c894",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        