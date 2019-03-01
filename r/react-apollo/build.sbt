organization := "org.scalablytyped"
name := "react-apollo"
version := "2.4.1-14c7d3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.26-51a6f6",
  "org.scalablytyped" %%% "apollo-client" % "2.4.13-3eb1d1",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-58ff0d",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.15-3b6443",
  "org.scalablytyped" %%% "apollo-utilities" % "1.1.3-01635a",
  "org.scalablytyped" %%% "csstype" % "2.6.2-4dc439",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-3e62ee",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-461334",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-834e25",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-7ff783",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-e580c8",
  "org.scalablytyped" %%% "lodash_dot_flowright" % "3.5-dt-20190212Z-66e552",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20190212Z-1f58ec",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-9bad87",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-e01ec8",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-b8fd27",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1c07bd",
  "org.scalablytyped" %%% "tslib" % "1.9.3-9b6ae7",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-76a7e1",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-a00444")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        