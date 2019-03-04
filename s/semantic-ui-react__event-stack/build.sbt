organization := "org.scalablytyped"
name := "semantic-ui-react__event-stack"
version := "3.0.1-74b48a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-1a329a",
  "org.scalablytyped" %%% "exenv" % "1.2-dt-20180321Z-297b87",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-d611ff",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-a0043b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-ff5ee1",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-1fd150",
  "org.scalablytyped" %%% "std" % "3.3-8d1cc2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        