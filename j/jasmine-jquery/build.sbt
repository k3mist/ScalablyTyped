organization := "org.scalablytyped"
name := "jasmine-jquery"
version := "1.5.8-dt-20181026Z-ac22da"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20190212Z-438409",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-295e43",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-c8cc19",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        