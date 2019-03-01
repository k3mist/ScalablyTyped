organization := "org.scalablytyped"
name := "cypress"
version := "3.1.5-ca35dc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-0263ab",
  "org.scalablytyped" %%% "blob-util" % "1.3-dt-20180214Z-1865c7",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-f21d22",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-576c77",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-617682",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181023Z-e99863",
  "org.scalablytyped" %%% "chalk" % "2.4.2-56b83b",
  "org.scalablytyped" %%% "check-more-types" % "2.24.0-3762d4",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-de57e0",
  "org.scalablytyped" %%% "commander" % "2.19.0-4e3db1",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181205Z-05d99f",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-52e12d",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-6046e2",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20180310Z-218860",
  "org.scalablytyped" %%% "extract-zip" % "1.6-dt-20180214Z-7a7156",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-8e192a",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d0d477",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180214Z-7c9233",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-7dc944",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-eecc52",
  "org.scalablytyped" %%% "is-installed-globally" % "0.1-dt-20181212Z-8048cd",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-56608c",
  "org.scalablytyped" %%% "lazy-ass" % "1.6.0-6db88f",
  "org.scalablytyped" %%% "listr" % "0.13-dt-20180306Z-313e9b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-e580c8",
  "org.scalablytyped" %%% "log-symbols" % "2.0-dt-20180214Z-416c57",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8cfae8",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-eff3fe",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20190212Z-9e693f",
  "org.scalablytyped" %%% "moment" % "2.24.0-142af7",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20190228Z-05f801",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-627e8d",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190223Z-8f5105",
  "org.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181212Z-b27ccb",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-4f3b4b",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-e45a81",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20190212Z-b68a1b",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-689b26",
  "org.scalablytyped" %%% "yauzl" % "2.9-dt-20181229Z-1a1112")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        