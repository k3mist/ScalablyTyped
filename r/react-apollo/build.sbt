organization := "org.scalablytyped"
name := "react-apollo"
version := "2.4.1-f5af60"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.26-200742",
  "org.scalablytyped" %%% "apollo-client" % "2.4.13-4d2181",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-fc0551",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.15-ba89e6",
  "org.scalablytyped" %%% "apollo-utilities" % "1.1.3-c830fb",
  "org.scalablytyped" %%% "csstype" % "2.6.2-b36da9",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-79aadb",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-3f8a4b",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-417d08",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-3bd643",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-0a072d",
  "org.scalablytyped" %%% "lodash_dot_flowright" % "3.5-dt-20190212Z-23f3c8",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20190212Z-16c50f",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f6f25d",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-6fcd2f",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-6749e4",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-7a8914",
  "org.scalablytyped" %%% "tslib" % "1.9.3-ca2588",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-eee2a8",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-569cf7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        