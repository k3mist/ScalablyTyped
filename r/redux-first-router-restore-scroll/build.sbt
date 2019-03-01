organization := "org.scalablytyped"
name := "redux-first-router-restore-scroll"
version := "1.2-dt-20180428Z-78ebe9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190226Z-b72ec2",
  "org.scalablytyped" %%% "redux" % "4.0.1-e7ca00",
  "org.scalablytyped" %%% "redux-first-router" % "2.1-dt-20181128Z-c2b4dc",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1c07bd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        