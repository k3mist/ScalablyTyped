organization := "org.scalablytyped"
name := "firebase__database"
version := "0.3.15-1e38b4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.12-e234e3",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.6-5d1ce4",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.7-0710bc",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.9-3db2dc",
  "org.scalablytyped" %%% "firebase__util" % "0.2.10-546759",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        