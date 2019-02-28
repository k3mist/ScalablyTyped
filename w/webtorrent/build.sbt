organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-338f10"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-e243c9",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-c233e8",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-db147f",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-e09ada",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-f411e8",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        