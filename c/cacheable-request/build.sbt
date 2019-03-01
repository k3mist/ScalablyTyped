organization := "org.scalablytyped"
name := "cacheable-request"
version := "6.0-dt-20190131Z-783abc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "http-cache-semantics" % "4.0-dt-20190127Z-6754ca",
  "org.scalablytyped" %%% "keyv" % "3.1-dt-20181231Z-1be896",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "responselike" % "1.0-dt-20190127Z-3a3733",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        