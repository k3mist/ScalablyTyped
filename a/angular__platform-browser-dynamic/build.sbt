organization := "org.scalablytyped"
name := "angular__platform-browser-dynamic"
version := "7.2.6-33627f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.2.6-39c1ca",
  "org.scalablytyped" %%% "angular__compiler" % "7.2.6-6e0696",
  "org.scalablytyped" %%% "angular__core" % "7.2.6-be54cd",
  "org.scalablytyped" %%% "angular__platform-browser" % "7.2.6-c81f8b",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-e7fb82",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "tslib" % "1.9.3-ca2588",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.29-47ebe4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        