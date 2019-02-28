organization := "org.scalablytyped"
name := "spectacle"
version := "5.4.0-41c33c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190127Z-c0f699",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-47481f",
  "org.scalablytyped" %%% "create-emotion" % "10.0.7-fa570e",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-53a7ac",
  "org.scalablytyped" %%% "csstype" % "2.6.2-b36da9",
  "org.scalablytyped" %%% "deep-object-diff" % "1.1.0-151d62",
  "org.scalablytyped" %%% "emotion" % "10.0.7-e6aa2d",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.7-27aefe",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.4-8532bc",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-65813d",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-011774",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190226Z-c9bf19",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-0a072d",
  "org.scalablytyped" %%% "magic-string" % "0.25.2-ddb2cc",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "prismjs" % "1.9-dt-20190212Z-e3fc5d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f6f25d",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-6fcd2f",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-6749e4",
  "org.scalablytyped" %%% "react-live" % "1.12.0-76b2d4",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190124Z-8ca106",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-7b9f9e",
  "org.scalablytyped" %%% "redux" % "4.0.1-b55ee8",
  "org.scalablytyped" %%% "redux-actions" % "2.3-dt-20190212Z-a131b0",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-88d9cc",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-7a8914")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        