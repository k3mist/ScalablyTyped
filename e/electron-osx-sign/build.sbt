organization := "org.scalablytyped"
name := "electron-osx-sign"
version := "0.4.11-5b2a0f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-44daf5",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-957173",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-5ae6cc",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-84269d",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-972581",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-df8e5b",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-e1076b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        