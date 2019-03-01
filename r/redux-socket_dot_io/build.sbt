organization := "org.scalablytyped"
name := "redux-socket_dot_io"
version := "1.4-dt-20180214Z-5a1991"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "redux" % "4.0.1-e7ca00",
  "org.scalablytyped" %%% "socket_dot_io-client" % "1.4.5-dt-20180214Z-53610c",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1c07bd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        