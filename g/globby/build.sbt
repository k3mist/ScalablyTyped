organization := "org.scalablytyped"
name := "globby"
version := "8.0-dt-20180614Z-7b5141"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-081b33",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-7164a2",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-7dc944",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-6e5b51",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-7ee00d",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-2de7a0",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-9ca491",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-1ca560",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8cfae8",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-d73e37",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-7f57ff",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        