organization := "org.scalablytyped"
name := "rx-lite-experimental"
version := "4.0-dt-20180214Z-4cc0f0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-993fc8",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-93673f",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-57ea87",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        