organization := "org.scalablytyped"
name := "angular__platform-browser-dynamic"
version := "7.2.9-1e09fc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.2.9-0a1b0a",
  "org.scalablytyped" %%% "angular__compiler" % "7.2.9-9f05aa",
  "org.scalablytyped" %%% "angular__core" % "7.2.9-e1fe9a",
  "org.scalablytyped" %%% "angular__platform-browser" % "7.2.9-075722",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-e722b1",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.29-a099ef")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        