organization := "org.scalablytyped"
name := "cacheable-request"
version := "6.0-dt-20190312Z-966d73"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "http-cache-semantics" % "4.0-dt-20190127Z-67f5d6",
  "org.scalablytyped" %%% "keyv" % "3.1-dt-20190312Z-8ff1e9",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "responselike" % "1.0-dt-20190127Z-8ec55f",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        