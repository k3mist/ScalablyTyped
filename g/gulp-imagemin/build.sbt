organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-bc26d0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-a69ba7",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-7437b6",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-594def",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-5c7435",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-b46bd1",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-0daace")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        