organization := "org.scalablytyped"
name := "rollup-plugin-node-builtins"
version := "2.1-dt-20190127Z-407e64"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "acorn" % "4.0-dt-20190212Z-ef96f9",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-6f4717",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "rollup" % "1.2.2-454076",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        