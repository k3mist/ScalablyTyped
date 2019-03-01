organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-76b593"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-95d235",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-d6cf3b",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-92e5f2",
  "org.scalablytyped" %%% "make-error" % "1.3.5-241cca",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-eff3fe",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-d3cd55",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-ccf7da",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "typescript" % "3.3.3-a1b20b",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-485802")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        