organization := "org.scalablytyped"
name := "adone"
version := "0.6-dt-20181003Z-7477a4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "assert" % "1.4-dt-20190212Z-00c9b6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-4e335e",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-6f978c",
  "org.scalablytyped" %%% "benchmark" % "v1.0.0-dt-20180214Z-1faddc",
  "org.scalablytyped" %%% "buffer" % "5.2.1-d93efc",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-e580c8",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-9f42dc",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        