organization := "org.scalablytyped"
name := "socketcluster-server"
version := "14.2-dt-20190205Z-6e6024"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-4e335e",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190205Z-5354be",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-6470fa",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-02f4d5",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-fc3df2",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-626eb9",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-6ebbb3",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-353a29",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-1fd59b",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-5993e1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        