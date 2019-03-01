organization := "org.scalablytyped"
name := "sqs-producer"
version := "1.5-dt-20180214Z-0da78e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.408.0-94015d",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-6f978c",
  "org.scalablytyped" %%% "buffer" % "5.2.1-d93efc",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-4d995d",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-69fa9b",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-0a2fa3",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-93f367",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-1675b9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        