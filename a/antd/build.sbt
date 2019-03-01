organization := "org.scalablytyped"
name := "antd"
version := "3.13.5-4ce05f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-d55789",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-426a5c",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-141e35",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-36eedf",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-07d995",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-4af615",
  "org.scalablytyped" %%% "csstype" % "2.6.2-4dc439",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20190212Z-49a2a0",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-e580c8",
  "org.scalablytyped" %%% "moment" % "2.24.0-142af7",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-9bad87",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-5e9d02",
  "org.scalablytyped" %%% "rc-calendar" % "9.10.9-407ca5",
  "org.scalablytyped" %%% "rc-dialog" % "7.3.0-2bb51b",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20190212Z-e043b2",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20190212Z-00d57b",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20190212Z-3fa7b3",
  "org.scalablytyped" %%% "rc-switch" % "1.8-dt-20190119Z-6b700c",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20190221Z-70c49c",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20190212Z-9de1f9",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20190212Z-6d9c98",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-e01ec8",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-b8fd27",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-cb36a2",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20190126Z-9f4622",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-347326",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-675ebf",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-a4648f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        