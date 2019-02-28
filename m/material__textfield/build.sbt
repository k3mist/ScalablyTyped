organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20190213Z-889b87"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190213Z-ae4ca8",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-b25ce8",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-befccb",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-017604",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190213Z-d0fb4e",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        