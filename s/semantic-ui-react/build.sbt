organization := "org.scalablytyped"
name := "semantic-ui-react"
version := "0.85.0-99a1fe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-47ee71",
  "org.scalablytyped" %%% "csstype" % "2.6.2-1a329a",
  "org.scalablytyped" %%% "exenv" % "1.2-dt-20180321Z-297b87",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-8384c5",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-d611ff",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-a0043b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-ff5ee1",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-1fd150",
  "org.scalablytyped" %%% "react-is" % "16.7-dt-20190212Z-fc56c0",
  "org.scalablytyped" %%% "semantic-ui-react__event-stack" % "3.0.1-74b48a",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-d83b66",
  "org.scalablytyped" %%% "std" % "3.3-8d1cc2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        