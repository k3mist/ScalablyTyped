organization := "org.scalablytyped"
name := "gtoken"
version := "2.3.2-8eb2a9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.2-51ad52",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-c3941c",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-80fafa",
  "org.scalablytyped" %%% "gaxios" % "1.7.0-59789f",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-abdd7d",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-9624e2",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-4d709a",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-39a899",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-4e3891",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-e2de55",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        