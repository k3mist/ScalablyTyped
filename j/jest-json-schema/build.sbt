organization := "org.scalablytyped"
name := "jest-json-schema"
version := "1.2-dt-20181205Z-3afb0d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.9.1-042b8e",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-b7cbfb",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-3e62ee",
  "org.scalablytyped" %%% "jest" % "24.0-dt-20190225Z-955aa2",
  "org.scalablytyped" %%% "jest-diff" % "20.0-dt-20190212Z-3f6b37",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-9f42dc",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-b7cc8f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        