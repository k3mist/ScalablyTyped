organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-3777de"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-44d557",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190213Z-707a96",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190213Z-263d66",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-53a76a",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190213Z-e45d30",
  "org.scalablytyped" %%% "material__dom" % "0.43-dt-20190213Z-62281c",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-ea7268",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-3d754f",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190213Z-1b14e0",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-757a37",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190213Z-6d3bc0",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-4057cf",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-afab7c",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190213Z-33c894",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-609a8d",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-e2f7c8",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190213Z-c1251d",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190213Z-677d08",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190213Z-36733e",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-9a407f",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190213Z-7be179",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190213Z-f2b415",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190213Z-ca23bf",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190213Z-3872e4",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190213Z-a01caa",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-67b63f",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        