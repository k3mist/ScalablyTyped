organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-02601a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-841d33",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-d6ec7c",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20190213Z-a04435",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190213Z-c635e3",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-a3c04b",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-656821",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        