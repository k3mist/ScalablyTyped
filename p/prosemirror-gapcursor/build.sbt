organization := "org.scalablytyped"
name := "prosemirror-gapcursor"
version := "1.0-dt-20180420Z-beb7b2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-dffbb9",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190130Z-c021a3",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-6a1bfc",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-0238d5",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20190222Z-d693b3",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        