organization := "org.scalablytyped"
name := "dmg-builder"
version := "6.5.4-8c813f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-3a7bda",
  "org.scalablytyped" %%% "ajv" % "6.9.1-ac751e",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-025618",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.3-c23aa8",
  "org.scalablytyped" %%% "app-builder-lib" % "20.38.5-05287b",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-44daf5",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-413f1c",
  "org.scalablytyped" %%% "builder-util" % "9.6.2-978ee9",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.1-7c67af",
  "org.scalablytyped" %%% "chalk" % "2.4.2-763e72",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1a53a",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-957173",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-5ae6cc",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-2284e3",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-066466",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-a97075",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-5b2a0f",
  "org.scalablytyped" %%% "electron-publish" % "20.38.5-3108bb",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-f64939",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-b4e1d0",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-79aadb",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d3c5fa",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-3b61c9",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-6ac88c",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-506a64",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-703bc1",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-84269d",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-6fcdd9",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-a0ae92",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-f36d8d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-4d709a",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-337a74",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-972581",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-b2ef73",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-df8e5b",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-49ea08",
  "org.scalablytyped" %%% "read-config-file" % "3.2.1-7f5c1b",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180214Z-dced15",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-2a97b5",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-041927",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-1767b4",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-1570a9",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-c3ff6d",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-ac2b61",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-b2f4a2",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-e1076b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        