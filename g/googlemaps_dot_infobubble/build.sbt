organization := "org.scalablytyped"
name := "googlemaps_dot_infobubble"
version := "3.0-dt-20180214Z-1e7973"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "google-maps" % "3.2.1-dt-20180214Z-fe4c10",
  "org.scalablytyped" %%% "googlemaps" % "3.30-dt-20181022Z-864dee",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        