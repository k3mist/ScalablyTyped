organization := "org.scalablytyped"
name := "webdriverio"
version := "5.6.0-c34788"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-576c77",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-a2a3f5",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-8e192a",
  "org.scalablytyped" %%% "grapheme-splitter" % "1.0.4-5ac549",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-e580c8",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20190212Z-2c1026",
  "org.scalablytyped" %%% "lodash_dot_zip" % "4.2-dt-20190212Z-398c28",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-627e8d",
  "org.scalablytyped" %%% "serialize-error" % "2.1-dt-20180607Z-18dec2",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-689b26",
  "org.scalablytyped" %%% "webdriver" % "5.6.0-14dbf2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        