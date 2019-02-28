organization := "org.scalablytyped"
name := "aws-param-store"
version := "2.1-dt-20190207Z-4b7a20"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.408.0-84257e",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-5f5199",
  "org.scalablytyped" %%% "buffer" % "5.2.1-12f5cf",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-2482c7",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-9e4f22",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-2a97b5",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-c103ca",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-2680aa")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        