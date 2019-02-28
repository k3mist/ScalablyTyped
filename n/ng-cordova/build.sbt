organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20181124Z-8556fb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-e48e16",
  "org.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20181116Z-91733c",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-360ce9",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-b72bee",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-6bee1f",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        