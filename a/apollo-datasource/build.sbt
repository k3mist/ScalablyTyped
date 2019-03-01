organization := "org.scalablytyped"
name := "apollo-datasource"
version := "0.3.1-5ff335"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.3.1-b8a9e9",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-f48f26",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-8ec692",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-a70bf3",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-f19a03")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        