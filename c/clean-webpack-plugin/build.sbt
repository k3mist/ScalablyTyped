organization := "org.scalablytyped"
name := "clean-webpack-plugin"
version := "2.0.1-222efe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-f2620c",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-edb918",
  "org.scalablytyped" %%% "del" % "4.0.0-e56655",
  "org.scalablytyped" %%% "dir-glob" % "2.0-dt-20181212Z-6b9642",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-f8aaf1",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-cd72cc",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-ec6929",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-9d06cf",
  "org.scalablytyped" %%% "globby" % "9.1.0-abc95b",
  "org.scalablytyped" %%% "ignore" % "3.3.10-bb014f",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-399c7b",
  "org.scalablytyped" %%% "is-path-cwd" % "1.0-dt-20180214Z-e451aa",
  "org.scalablytyped" %%% "is-path-in-cwd" % "1.0-dt-20180214Z-b65fce",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-207a44",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-3ed78d",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-ee45af",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-f96a76",
  "org.scalablytyped" %%% "p-map" % "2.0.0-8063aa",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-937816",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-6cd059",
  "org.scalablytyped" %%% "slash" % "2.0-dt-20181224Z-adddb4",
  "org.scalablytyped" %%% "source-map" % "0.7.3-169991",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-c57887",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ffccaa",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190316Z-ea312d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        