organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-d16bae"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-b36da9",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190226Z-c9bf19",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-3bd643",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20190212Z-5158a9",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f6f25d",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-6fcd2f",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-6749e4",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190124Z-8ca106",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190212Z-7d5f3a",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20181211Z-3ca469",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20190212Z-584bca",
  "org.scalablytyped" %%% "redux" % "4.0.1-b55ee8",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-7a8914")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        