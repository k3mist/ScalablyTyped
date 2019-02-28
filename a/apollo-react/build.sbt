organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-aa13f1"
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
  "org.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20190212Z-d3f969",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20190212Z-16c50f",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20190212Z-858edd",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20190212Z-22325f",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180214Z-9dd8c0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f6f25d",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-6fcd2f",
  "org.scalablytyped" %%% "redux" % "4.0.1-b55ee8",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-7a8914",
  "org.scalablytyped" %%% "tslib" % "1.9.3-ca2588",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-474dfe",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-eee2a8",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-569cf7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        