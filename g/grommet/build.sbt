organization := "org.scalablytyped"
name := "grommet"
version := "2.4.0-fcf55e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "css" % "0.0-unknown-dt-20180214Z-7656c1",
  "org.scalablytyped" %%% "csstype" % "2.6.2-4dc439",
  "org.scalablytyped" %%% "grommet-icons" % "4.2.0-3d696f",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-834e25",
  "org.scalablytyped" %%% "mobile-detect" % "1.4.3-23fdac",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "polished" % "2.3.3-b3d544",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-9bad87",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-e01ec8",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-b8fd27",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-dd29e5",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190225Z-1c752a",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190214Z-1f969e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        