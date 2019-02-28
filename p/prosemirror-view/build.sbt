organization := "org.scalablytyped"
name := "prosemirror-view"
version := "1.3-dt-20190222Z-2dea1c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-b67035",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190130Z-cfb4d9",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-5d4b36",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        