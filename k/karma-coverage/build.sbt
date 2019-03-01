organization := "org.scalablytyped"
name := "karma-coverage"
version := "1.1-dt-20181203Z-f8f881"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-f21d22",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-52e12d",
  "org.scalablytyped" %%% "flatted" % "2.0.0-d6cf26",
  "org.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20180312Z-819bed",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20190212Z-f806b8",
  "org.scalablytyped" %%% "log4js" % "4.0.2-ca583b",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        