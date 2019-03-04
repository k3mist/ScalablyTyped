organization := "org.scalablytyped"
name := "angular__forms"
version := "7.2.6-9261fe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.2.6-209aa6",
  "org.scalablytyped" %%% "angular__core" % "7.2.6-2e6aba",
  "org.scalablytyped" %%% "angular__platform-browser" % "7.2.6-5e08b5",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-d611ff",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-6ca980",
  "org.scalablytyped" %%% "std" % "3.3-8d1cc2",
  "org.scalablytyped" %%% "tslib" % "1.9.3-2ec86f",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.29-3be1b9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        