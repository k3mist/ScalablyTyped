organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20180214Z-b1657b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180214Z-957792",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20180214Z-dbb04a",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20180214Z-28dfef",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        