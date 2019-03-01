organization := "org.scalablytyped"
name := "nuka-carousel"
version := "4.4.8-7506b1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-4dc439",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-7b6b19",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-ed3a18",
  "org.scalablytyped" %%% "exenv" % "1.2-dt-20180321Z-5a6f13",
  "org.scalablytyped" %%% "kapellmeister" % "2.0.0-e7f7e1",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-9bad87",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-e01ec8",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-b8fd27",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-cb36a2",
  "org.scalablytyped" %%% "react-move" % "5.2.0-333135",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        