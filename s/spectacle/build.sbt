organization := "org.scalablytyped"
name := "spectacle"
version := "5.4.0-5dc719"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190127Z-9eb7ac",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-9cf379",
  "org.scalablytyped" %%% "create-emotion" % "10.0.7-53ddbc",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-4af615",
  "org.scalablytyped" %%% "csstype" % "2.6.2-4dc439",
  "org.scalablytyped" %%% "deep-object-diff" % "1.1.0-4910df",
  "org.scalablytyped" %%% "emotion" % "10.0.7-eba097",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.7-9c3d80",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.4-d3272e",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-80eb5f",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-868586",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190226Z-b72ec2",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-e580c8",
  "org.scalablytyped" %%% "magic-string" % "0.25.2-83b7b8",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "prismjs" % "1.9-dt-20190212Z-9f5a4f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-9bad87",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-e01ec8",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-b8fd27",
  "org.scalablytyped" %%% "react-live" % "1.12.0-71972d",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190124Z-f2be88",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-4d24f8",
  "org.scalablytyped" %%% "redux" % "4.0.1-e7ca00",
  "org.scalablytyped" %%% "redux-actions" % "2.3-dt-20190212Z-62a0d1",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-d46dc8",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1c07bd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        