organization := "org.scalablytyped"
name := "okta__okta-vue"
version := "1.0-dt-20190213Z-4edcc8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "vue" % "2.6.6-9d786e",
  "org.scalablytyped" %%% "vue-router" % "3.0.2-eba551")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        