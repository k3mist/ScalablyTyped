organization := "org.scalablytyped"
name := "bardjs"
version := "0.1.4-dt-20180611Z-c1046e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-e48e16",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-f4f2e6",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20190212Z-776d4e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        