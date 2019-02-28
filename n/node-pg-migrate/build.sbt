organization := "org.scalablytyped"
name := "node-pg-migrate"
version := "3.16.0-96c4fb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-0a072d",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-22a450",
  "org.scalablytyped" %%% "moment" % "2.24.0-c8a799",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20190212Z-aa44a8",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-775163",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190212Z-4b036c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        