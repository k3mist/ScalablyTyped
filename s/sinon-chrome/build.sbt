organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20181212Z-fba24c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190218Z-e7eb0a",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20180827Z-e9ad47",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20180214Z-4c6ec1",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190223Z-56cc8d",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        