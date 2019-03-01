organization := "org.scalablytyped"
name := "hapi-auth-jwt2"
version := "8.0-dt-20181022Z-6358dd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-91feb1",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-43529f",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-8d56ef",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-9c6657",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-c44586",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-fc3df2",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-1afeb4",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-9d5f18",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-050272",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-782916",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-f91d66",
  "org.scalablytyped" %%% "std" % "3.3-bea17e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        