organization := "org.scalablytyped"
name := "rx-lite-coincidence"
version := "4.0-dt-20180214Z-aa3874"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-38667c",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-78021d",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-f6fefd",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        