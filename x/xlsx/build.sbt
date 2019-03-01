organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-169c54"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-1c54f1",
  "org.scalablytyped" %%% "cfb" % "1.1.0-e9959f",
  "org.scalablytyped" %%% "codepage" % "1.14.0-11e8f5",
  "org.scalablytyped" %%% "commander" % "2.19.0-4e3db1",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-771339",
  "org.scalablytyped" %%% "frac" % "1.1.2-1beae1",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "printj" % "1.1.2-47e233",
  "org.scalablytyped" %%% "ssf" % "0.10.2-a8d254",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        