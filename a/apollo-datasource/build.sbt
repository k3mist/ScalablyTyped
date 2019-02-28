organization := "org.scalablytyped"
name := "apollo-datasource"
version := "0.3.1-7dc26e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.3.1-51bf4c",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-3a467a",
  "org.scalablytyped" %%% "lru-cache" % "5.1-dt-20190222Z-dcc8fc",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-39a899",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-efe8c4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        