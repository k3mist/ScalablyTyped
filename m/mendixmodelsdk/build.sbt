organization := "org.scalablytyped"
name := "mendixmodelsdk"
version := "4.19.0-365f90"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-576c77",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-1a0f84",
  "org.scalablytyped" %%% "eventsource" % "1.1-dt-20190114Z-4f99b1",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-8e192a",
  "org.scalablytyped" %%% "mobx" % "5.9.0-01eb8b",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-627e8d",
  "org.scalablytyped" %%% "requestretry" % "1.12-dt-20190212Z-49fedc",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-689b26",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-93f367",
  "org.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.6-e6d9cf")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        