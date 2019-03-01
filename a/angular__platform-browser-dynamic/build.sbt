organization := "org.scalablytyped"
name := "angular__platform-browser-dynamic"
version := "7.2.6-c152c3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.2.6-00e2e0",
  "org.scalablytyped" %%% "angular__compiler" % "7.2.6-2d9e73",
  "org.scalablytyped" %%% "angular__core" % "7.2.6-e665aa",
  "org.scalablytyped" %%% "angular__platform-browser" % "7.2.6-1a2dfe",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-b83976",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9b6ae7",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.29-a48910")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        