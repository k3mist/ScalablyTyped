organization := "org.scalablytyped"
name := "react-dev-utils"
version := "7.0-dt-20190128Z-3225ba"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-900497",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-b2fa11",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-c68964",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fbc342",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-5c4cab",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-87c1b5",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-994326",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-19b575",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-df7afb",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-9c5a07",
  "org.scalablytyped" %%% "http-proxy" % "1.16-dt-20180514Z-d716c4",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-074b6d",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-45a78a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-4d709a",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-d72e89",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20180214Z-637de6",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-46bd6e",
  "org.scalablytyped" %%% "source-map" % "0.7.3-f37bcc",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-710a09",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-13f33e",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-34d921",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190129Z-98788f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        