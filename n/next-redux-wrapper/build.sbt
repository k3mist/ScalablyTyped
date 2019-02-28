organization := "org.scalablytyped"
name := "next-redux-wrapper"
version := "2.0-dt-20181207Z-f40ba8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-b36da9",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f6f25d",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-6fcd2f",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190124Z-8ca106",
  "org.scalablytyped" %%% "redux" % "4.0.1-b55ee8",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-7a8914")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        