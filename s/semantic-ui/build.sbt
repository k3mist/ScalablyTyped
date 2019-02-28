organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20190212Z-0dae7c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-295e43",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-1b46ec",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-849b20",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-ed4b3c",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-f6603a",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-1bc119",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-a3f8b3",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-a02743",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-eeb028",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-a4ec7b",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-ffb9fa",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-ee1dd2",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-a9891e",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-61706c",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-22732d",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-ded04e",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-c3e79c",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-441c59",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-4b8ed5",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-b286f0",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-42b900",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-c8cc19",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        