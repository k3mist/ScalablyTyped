organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20180214Z-cc2f1d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20180214Z-95e77a",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-71b99f",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-af8cd0",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        