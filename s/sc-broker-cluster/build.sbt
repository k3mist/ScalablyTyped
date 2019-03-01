organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20181218Z-353a29"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-4e335e",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190205Z-5354be",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-6470fa",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-02f4d5",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-6ebbb3",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-1fd59b",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        