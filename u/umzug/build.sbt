organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180731Z-65989a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-44daf5",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-d9373e",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-aabda1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-0a072d",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-38ba87",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190227Z-d053a9",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-30a909")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        