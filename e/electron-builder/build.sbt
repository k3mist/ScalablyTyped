organization := "org.scalablytyped"
name := "electron-builder"
version := "20.39.0-dad42d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-ae6b3f",
  "org.scalablytyped" %%% "ajv" % "6.10.0-0cf4fd",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-052e82",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.4-5b3bdf",
  "org.scalablytyped" %%% "app-builder-lib" % "20.39.0-9f5e1a",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.7-2ef8e1",
  "org.scalablytyped" %%% "builder-util" % "9.7.0-8902b6",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.0-cf7940",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6d01d0",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1b784",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-120670",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "dmg-builder" % "6.6.0-77e866",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-a2b9e0",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-c07106",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-c20989",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-ffc274",
  "org.scalablytyped" %%% "electron-publish" % "20.39.0-a72f9e",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-1f537b",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-2fa947",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ccd0c9",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-50456b",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-907afd",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-7f61fb",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-227c52",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-d085df",
  "org.scalablytyped" %%% "isbinaryfile" % "4.0.0-0b3878",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-0397ba",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-71761f",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-9009e1",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-b5ce4c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-d709de",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-00c7c4",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-cebc3d",
  "org.scalablytyped" %%% "read-config-file" % "3.2.2-ed9e63",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180214Z-ba04b2",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-defaa1",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-1cb125",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-a2e272",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-155129",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-d1a1af",
  "org.scalablytyped" %%% "update-notifier" % "2.5-dt-20181023Z-cc339e",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-005ad5",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-7896d1",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190317Z-d1d847")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        