organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20181122Z-2e174c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-70f930",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190312Z-6f0f1a",
  "org.scalablytyped" %%% "react-intl" % "2.3-dt-20190212Z-b526be",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190318Z-e200e2",
  "org.scalablytyped" %%% "redux" % "4.0.1-18f3a8",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-5b665c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        