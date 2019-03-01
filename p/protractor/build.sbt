organization := "org.scalablytyped"
name := "protractor"
version := "5.4.2-087c3b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "0.4-dt-20190202Z-6e9856",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-0263ab",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-bf121c",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-576c77",
  "org.scalablytyped" %%% "chalk" % "2.4.2-56b83b",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-de57e0",
  "org.scalablytyped" %%% "del" % "3.0-dt-20180311Z-ed4aee",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-6046e2",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-8e192a",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-7dc944",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-b0b37c",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20190212Z-d6ca2d",
  "org.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181026Z-8dfa3a",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8cfae8",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-eff3fe",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180214Z-80c6a4",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-78d58f",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-627e8d",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-211487",
  "org.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20190212Z-b761f3",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-a04248",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-ccf7da",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-e45a81",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-689b26",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-daf9f9",
  "org.scalablytyped" %%% "webdriver-manager" % "12.1.1-bbd988",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-1675b9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        