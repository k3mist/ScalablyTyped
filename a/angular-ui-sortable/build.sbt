organization := "org.scalablytyped"
name := "angular-ui-sortable"
version := "0.13-dt-20181017Z-79ff96"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-5e6318",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-8061ce",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20190124Z-873255",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a5e2be",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        