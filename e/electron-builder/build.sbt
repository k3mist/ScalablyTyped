organization := "org.scalablytyped"
name := "electron-builder"
version := "20.38.5-75f9c0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-1dec18",
  "org.scalablytyped" %%% "ajv" % "6.9.1-042b8e",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-0263ab",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.3-ed7c67",
  "org.scalablytyped" %%% "app-builder-lib" % "20.38.5-682ebf",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-f21d22",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-5f51f6",
  "org.scalablytyped" %%% "builder-util" % "9.6.2-3f035f",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.1-78243f",
  "org.scalablytyped" %%% "chalk" % "2.4.2-56b83b",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-de57e0",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-1dcd19",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-52e12d",
  "org.scalablytyped" %%% "dmg-builder" % "6.5.4-d7544a",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-de8c8d",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-00a9a4",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-02ae4e",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-a48ee3",
  "org.scalablytyped" %%% "electron-publish" % "20.38.5-46888a",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-6046e2",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-b7cbfb",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-3e62ee",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d0d477",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-b358cc",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-709268",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-519fda",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-eecc52",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-1aabd7",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-9c0bc6",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-7cf881",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-37676e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-785d4d",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8cfae8",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-eff3fe",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-185854",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-201c1d",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-9f42dc",
  "org.scalablytyped" %%% "read-config-file" % "3.2.1-424be2",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180214Z-f9c6f8",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-0a2fa3",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-a04248",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-ccf7da",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-c71780",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-e45a81",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-ae0920",
  "org.scalablytyped" %%% "update-notifier" % "2.5-dt-20181023Z-10d9a9",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-b7cc8f",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-649296",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190212Z-39b83a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        