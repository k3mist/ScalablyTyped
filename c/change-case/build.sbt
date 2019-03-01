organization := "org.scalablytyped"
name := "change-case"
version := "3.1.0-8482fa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-d2e043",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-31045e",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-3762ec",
  "org.scalablytyped" %%% "header-case" % "1.0.1-39b7ae",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-8a6825",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-ab4889",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-1fa5fd",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-cda897",
  "org.scalablytyped" %%% "no-case" % "2.3.2-8c8edc",
  "org.scalablytyped" %%% "param-case" % "2.1.1-95e823",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-ae24b6",
  "org.scalablytyped" %%% "path-case" % "2.1.1-02bf26",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-0ae613",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-c18918",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-8e0cd8",
  "org.scalablytyped" %%% "title-case" % "2.1.1-899d53",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-0f45bb",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-8aa7bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        