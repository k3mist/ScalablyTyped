organization := "org.scalablytyped"
name := "crumb"
version := "7.2-dt-20181129Z-5b68e4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-cccbef",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-08277f",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-dedaab",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-22b526",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-5cc1e5",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-92508b",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-997a4d",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-13b19c",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-19b1df",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        