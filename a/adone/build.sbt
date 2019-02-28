organization := "org.scalablytyped"
name := "adone"
version := "0.6-dt-20181003Z-90005b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "assert" % "1.4-dt-20190212Z-300f83",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-d0311a",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-5f5199",
  "org.scalablytyped" %%% "benchmark" % "v1.0.0-dt-20180214Z-5220d0",
  "org.scalablytyped" %%% "buffer" % "5.2.1-12f5cf",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-0a072d",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-49ea08",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        