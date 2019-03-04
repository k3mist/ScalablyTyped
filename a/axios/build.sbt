organization := "org.scalablytyped"
name := "axios"
version := "0.18.0-7e5f25"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-6702fa",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-d611ff",
  "org.scalablytyped" %%% "std" % "3.3-8d1cc2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        