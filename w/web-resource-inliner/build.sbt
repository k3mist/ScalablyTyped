organization := "org.scalablytyped"
name := "web-resource-inliner"
version := "4.2-dt-20181206Z-5ffa50"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-88463f",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-961b6c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2b1e0f",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-171ce9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        