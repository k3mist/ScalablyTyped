organization := "org.scalablytyped"
name := "anydb-sql-migrations"
version := "2.4.1-6fc616"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "any-db" % "2.1.0-dt-20180214Z-b02601",
  "org.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20180214Z-8c8dc5",
  "org.scalablytyped" %%% "anydb-sql" % "0.7.1-eab560",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-44daf5",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-0a072d",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "node-sql-2" % "0.78.0-9790d1",
  "org.scalablytyped" %%% "sqlite3" % "3.1-dt-20190212Z-061f84",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190212Z-4b036c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        