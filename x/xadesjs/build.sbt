organization := "org.scalablytyped"
name := "xadesjs"
version := "2.0.14-0b8aca"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asn1js" % "0.0-unknown-dt-20180214Z-afc088",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "pkijs" % "0.0-unknown-dt-20190217Z-ccf35a",
  "org.scalablytyped" %%% "pvutils" % "0.0-unknown-dt-20180214Z-7c4219",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab",
  "org.scalablytyped" %%% "xml-core" % "1.0.15-a266f5",
  "org.scalablytyped" %%% "xmldsigjs" % "2.0.22-16819a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        