organization := "org.scalablytyped"
name := "react-dev-utils"
version := "7.0-dt-20190128Z-26b006"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-f2e7b5",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-84f3c2",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-9673f2",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-25bc6e",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-84a2f6",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-6f4717",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-de2fa5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-512e8c",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-b127e6",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-018757",
  "org.scalablytyped" %%% "http-proxy" % "1.16-dt-20180514Z-958c43",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-005428",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-01ed75",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-785d4d",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-4a1bde",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20180214Z-81e786",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-9f2cda",
  "org.scalablytyped" %%% "source-map" % "0.7.3-bbbf0a",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-58f3f9",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-cb23f6",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-3d69b0",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190129Z-a75e07")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        