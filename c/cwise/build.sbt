organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20180214Z-f0489d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20180214Z-6a634f",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-b34b74",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-cf7aee",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        