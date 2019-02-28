organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20181218Z-37c89f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-d0311a",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190205Z-4f45d6",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-b2dd96",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-fd0227",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-a0e648",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-b858ff",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        