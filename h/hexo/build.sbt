organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20190221Z-0694e9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-8b4f5d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fbc342",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20180810Z-c6aab7",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-972581",
  "org.scalablytyped" %%% "moment" % "2.24.0-c8a799",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190226Z-006898")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        