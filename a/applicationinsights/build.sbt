organization := "org.scalablytyped"
name := "applicationinsights"
version := "1.2.0-183add"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cls-hooked" % "4.2-dt-20180624Z-a23c10",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-5d89e5",
  "org.scalablytyped" %%% "diagnostic-channel" % "0.2.0-2e5fef",
  "org.scalablytyped" %%% "diagnostic-channel-publishers" % "0.3.0-917b0e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-a04248",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        