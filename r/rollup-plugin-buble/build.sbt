organization := "org.scalablytyped"
name := "rollup-plugin-buble"
version := "0.19-dt-20190205Z-d31251"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "acorn" % "4.0-dt-20190212Z-da26bf",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190127Z-c0f699",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-87c1b5",
  "org.scalablytyped" %%% "magic-string" % "0.25.2-ddb2cc",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "rollup" % "1.2.2-16b9d4",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-88d9cc",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        