organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180712Z-d20120"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-44daf5",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-b5f805",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190227Z-afafb7",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190126Z-006fd6",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        