organization := "org.scalablytyped"
name := "material-ui__icons"
version := "3.0.2-fd5137"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-f47f75",
  "org.scalablytyped" %%% "csstype" % "2.6.2-b36da9",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181201Z-80bd24",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-6ad3bc",
  "org.scalablytyped" %%% "dom-helpers" % "3.4-dt-20190212Z-b58189",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-417d08",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-30bbe6",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-e472a8",
  "org.scalablytyped" %%% "isobject" % "3.0.1-e2d170",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190227Z-bd067f",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.2-7831b7",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-b492ed",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-2dba91",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f6f25d",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-6fcd2f",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-6749e4",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20190206Z-7c1295",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-7b9f9e",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190225Z-79132a",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-7a8914",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-f7e721")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        