organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-64db32"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-e2afea",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190213Z-ae4ca8",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190213Z-bd5ab1",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-b102b9",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190213Z-ee7ff3",
  "org.scalablytyped" %%% "material__dom" % "0.43-dt-20190213Z-d0732a",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-46b6c1",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-b25ce8",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190213Z-be15bf",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-bc0472",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190213Z-a8791b",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-befccb",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-205f24",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190213Z-159d2e",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-f9d0b2",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-017604",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190213Z-ddde2a",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190213Z-d0fb4e",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190213Z-34e9c5",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-34855c",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190213Z-100345",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190213Z-be3c25",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190213Z-b0d2ac",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190213Z-889b87",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190213Z-90748f",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-1bec7c",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        