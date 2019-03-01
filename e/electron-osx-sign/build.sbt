organization := "org.scalablytyped"
name := "electron-osx-sign"
version := "0.4.11-a48ee3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-f21d22",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-1dcd19",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-52e12d",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-1aabd7",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-eff3fe",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-201c1d",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-649296")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        