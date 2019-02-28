organization := "org.scalablytyped"
name := "antd"
version := "3.13.5-079094"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-cb34a5",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-2a1e5c",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-1b96c8",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-f47f75",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-22ec5f",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-53a7ac",
  "org.scalablytyped" %%% "csstype" % "2.6.2-b36da9",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20190212Z-3a6123",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-0a072d",
  "org.scalablytyped" %%% "moment" % "2.24.0-c8a799",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f6f25d",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-f40712",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.9-3f6449",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-4eca26",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20190212Z-407849",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20190212Z-2ee0b2",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20190212Z-5a5d93",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-3ffc0a",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20190221Z-73f8c8",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20190212Z-37dae7",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20190212Z-1ef3c9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-6fcd2f",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-6749e4",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-2322a7",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-70a7bb",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-50a124",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-991442",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-f7e721")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        