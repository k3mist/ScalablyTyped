organization := "org.scalablytyped"
name := "change-case"
version := "3.1.0-2a14ba"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-98d025",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-f78ee1",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-8ea69a",
  "org.scalablytyped" %%% "header-case" % "1.0.1-c5c31c",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-d1c960",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-2929d4",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-5ec2ad",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-36e358",
  "org.scalablytyped" %%% "no-case" % "2.3.2-c27fc7",
  "org.scalablytyped" %%% "param-case" % "2.1.1-4691c1",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-eabd10",
  "org.scalablytyped" %%% "path-case" % "2.1.1-b89e32",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-75043e",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-61023f",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-1f4f95",
  "org.scalablytyped" %%% "title-case" % "2.1.1-69d8bb",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-b3feae",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-a0b83b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        