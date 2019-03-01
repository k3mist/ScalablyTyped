organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.0-dt-20181102Z-b7c6f0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "linkify-it" % "2.0.3-dt-20181017Z-78e6c3",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20181102Z-65a40f",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-dffbb9",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190130Z-c021a3",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        