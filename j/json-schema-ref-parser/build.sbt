organization := "org.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-30536f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-52e12d",
  "org.scalablytyped" %%% "es6-promise" % "4.2.6-749189",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-9c0bc6",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-01ed75",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "ono" % "4.0.11-0c1e8c",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20180214Z-725185")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        