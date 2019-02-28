organization := "org.scalablytyped"
name := "raw-body"
version := "2.3.3-84f779"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bytes" % "3.0-dt-20180214Z-68e686",
  "org.scalablytyped" %%% "http-errors" % "1.6-dt-20180214Z-f40063",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-506a64",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        