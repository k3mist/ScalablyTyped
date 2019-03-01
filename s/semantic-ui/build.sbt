organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20190212Z-24f348"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-56608c",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-e9b022",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-cb1e88",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-641dc2",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-5cdc35",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-f80f4e",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-cb3ebd",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-ecf21a",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-46a585",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-957e74",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-60277b",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-340ba9",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-54c04c",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-8d58b8",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-a4bc41",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-24fe06",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-d6589f",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-16e055",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-8fecdf",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-5defc2",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-e37c7b",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-4f3b4b",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        