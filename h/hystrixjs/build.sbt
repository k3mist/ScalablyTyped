organization := "org.scalablytyped"
name := "hystrixjs"
version := "0.2-dt-20180214Z-c2928f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-db42df",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-993fc8",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-93673f",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-57ea87",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-7cf0dd",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-9f10b7",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-00ee5b",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-d9c9e9",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-4cc0f0",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-fb85c8",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-833bdd",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-6ab154",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-d6d7ce",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        