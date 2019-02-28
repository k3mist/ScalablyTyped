organization := "org.scalablytyped"
name := "jquery-validation-unobtrusive"
version := "v3.2.3-dt-20180214Z-73c349"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-295e43",
  "org.scalablytyped" %%% "jquery_dot_validation" % "1.16-dt-20190213Z-fa6c36",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-c8cc19",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        