organization := "org.scalablytyped"
name := "jsdom"
version := "12.2-dt-20190212Z-68b6d3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180611Z-4ebcd3",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-689b26")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        