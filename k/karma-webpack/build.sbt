organization := "org.scalablytyped"
name := "karma-webpack"
version := "2.0-dt-20190212Z-edc5d9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-f2e7b5",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-f21d22",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-25bc6e",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-52e12d",
  "org.scalablytyped" %%% "flatted" % "2.0.0-d6cf26",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20190212Z-f806b8",
  "org.scalablytyped" %%% "log4js" % "4.0.2-ca583b",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-e2b5c6",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-cf7740",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "source-map" % "0.7.3-bbbf0a",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-58f3f9",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-cb23f6",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-3d69b0",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-d48091")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        