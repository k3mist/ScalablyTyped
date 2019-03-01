organization := "org.scalablytyped"
name := "material-ui__lab"
version := "3.0.0-alpha.30-b5d533"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-36eedf",
  "org.scalablytyped" %%% "csstype" % "2.6.2-4dc439",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181201Z-615c78",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-a2a3f5",
  "org.scalablytyped" %%% "dom-helpers" % "3.4-dt-20190212Z-148de7",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-834e25",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-a5b195",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-113491",
  "org.scalablytyped" %%% "isobject" % "3.0.1-e9d87c",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190227Z-37f6e2",
  "org.scalablytyped" %%% "keycode" % "2.2.0-7ef657",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.2-8358e8",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-da29d1",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-872a59",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-9bad87",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-e01ec8",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-b8fd27",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20190206Z-aa6fdc",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-4d24f8",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190225Z-1c752a",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1c07bd",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-a4648f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        