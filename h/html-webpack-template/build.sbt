organization := "org.scalablytyped"
name := "html-webpack-template"
version := "6.0-dt-20180306Z-6884df"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-900497",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-c68964",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-df7afb",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-9c5a07",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20180214Z-637de6",
  "org.scalablytyped" %%% "source-map" % "0.7.3-f37bcc",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-710a09",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-13f33e",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-34d921")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        