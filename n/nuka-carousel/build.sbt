organization := "org.scalablytyped"
name := "nuka-carousel"
version := "4.4.8-a7eaaf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-b36da9",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-4ca8d4",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-55d424",
  "org.scalablytyped" %%% "exenv" % "1.2-dt-20180321Z-05c59d",
  "org.scalablytyped" %%% "kapellmeister" % "2.0.0-4fe30d",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f6f25d",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-6fcd2f",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-6749e4",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-2322a7",
  "org.scalablytyped" %%% "react-move" % "5.2.0-7e2aa8",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        