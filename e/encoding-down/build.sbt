organization := "org.scalablytyped"
name := "encoding-down"
version := "5.0-dt-20180917Z-36aa40"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abstract-leveldown" % "5.0-dt-20180913Z-76ea27",
  "org.scalablytyped" %%% "level-codec" % "9.0-dt-20180828Z-ae2ab7",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        