organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20180611Z-d75728"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-f82555",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-d5f8b6",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-217562",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-fa6512",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190218Z-b5d0af",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-b16099",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        