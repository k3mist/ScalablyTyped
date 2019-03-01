organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-791baf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-6849c7",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-9fd60d",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-2310ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        