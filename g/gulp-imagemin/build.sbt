organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-292760"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-7700cc",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-907f02",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-74beae",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-4475d0",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-b3995a",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "std" % "3.3-bea17e",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-96de2d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        