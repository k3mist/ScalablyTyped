organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-918cbc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-6f978c",
  "org.scalablytyped" %%% "buffer" % "5.2.1-d93efc",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-02ae4e",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-7dc944",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-a78143",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8cfae8",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-1402b8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        