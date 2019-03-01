organization := "org.scalablytyped"
name := "feathersjs__socketio"
version := "3.0-dt-20190213Z-fc0109"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "feathersjs__feathers" % "3.1-dt-20181204Z-f3843a",
  "org.scalablytyped" %%% "feathersjs__socket-commons" % "3.1-dt-20190213Z-9203de",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20181204Z-f3e268",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        