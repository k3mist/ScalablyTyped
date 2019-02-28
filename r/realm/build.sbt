organization := "org.scalablytyped"
name := "realm"
version := "2.23.0-dd94cf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-1e0f96",
  "org.scalablytyped" %%% "command-line-args" % "5.0-dt-20180503Z-1f6ffc",
  "org.scalablytyped" %%% "decompress" % "4.2-dt-20180610Z-e7fd13",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-6ad3bc",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-b61bd6",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d3c5fa",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-cdacd7",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-39a899",
  "org.scalablytyped" %%% "node-machine-id" % "1.1.10-25ccd2",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-15292c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f6f25d",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-98dbaf",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-93c5ad",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20190205Z-37655c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        