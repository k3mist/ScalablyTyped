organization := "org.scalablytyped"
name := "globby"
version := "8.0-dt-20180614Z-973c06"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-df093c",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-9ea685",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ad9cd5",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-47f8b2",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-ef43f9",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-1dd32a",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-1701ce",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-7fec3a",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-337a74",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-88c578",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-1b6106",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        