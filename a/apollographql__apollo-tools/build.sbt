organization := "org.scalablytyped"
name := "apollographql__apollo-tools"
version := "0.3.3-768a2b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-env" % "0.3.3-962120",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-9cf379",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-461334",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-a70bf3",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        