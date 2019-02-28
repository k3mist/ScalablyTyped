organization := "org.scalablytyped"
name := "inquirer-npm-name"
version := "3.0-dt-20181103Z-0b3f7e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20190221Z-de179c",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-bcad6a",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-38667c",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-78021d",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-f6fefd",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-8fd8d1",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-7a0070",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-0d46d6",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-aa3874",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-1f2dee",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-7b337b",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-278e79",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-de3eae",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-89cc34",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-4b277b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        