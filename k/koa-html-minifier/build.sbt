organization := "org.scalablytyped"
name := "koa-html-minifier"
version := "1.0-dt-20180823Z-b923b2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-b165dd",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0020ba",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-12d808",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-de294e",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-bd3b38",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-921be9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-2cedcf",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-4c79ac",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-07f032",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-96c7ba",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-419e0b",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-2880d6",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20180214Z-eefacf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ad4a56",
  "org.scalablytyped" %%% "source-map" % "0.7.3-169991",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ffccaa")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        