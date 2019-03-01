organization := "org.scalablytyped"
name := "rollup-plugin-buble"
version := "0.19-dt-20190205Z-fa7179"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "acorn" % "4.0-dt-20190212Z-ef96f9",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190127Z-9eb7ac",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-6f4717",
  "org.scalablytyped" %%% "magic-string" % "0.25.2-83b7b8",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "rollup" % "1.2.2-454076",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-d46dc8",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        