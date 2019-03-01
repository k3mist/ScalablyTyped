organization := "org.scalablytyped"
name := "aurelia-binding"
version := "2.2.0-9f4801"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-c89fea",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.1-a160f8",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.5-283633",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.1-6c8dc0",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.2-d6df37",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        