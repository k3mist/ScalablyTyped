organization := "org.scalablytyped"
name := "promise-pool"
version := "0.0-unknown-dt-20180214Z-b3b752"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-78d58f",
  "org.scalablytyped" %%% "q-retry" % "0.0-unknown-dt-20180214Z-954f4e",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        