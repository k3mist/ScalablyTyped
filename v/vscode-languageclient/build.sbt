organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.3.0-next.1-d976de"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-041927",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-5e7776",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.15.0-next.1-4cfc9a",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-a2c8fc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        