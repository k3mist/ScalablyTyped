organization := "org.scalablytyped"
name := "gtoken"
version := "2.3.2-9a3711"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.2-62fcfc",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-759791",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-6e0d0d",
  "org.scalablytyped" %%% "gaxios" % "1.7.0-ae87c9",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-41d20d",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-4fa72b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-785d4d",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-a70bf3",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-975431",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-783f38",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        