organization := "org.scalablytyped"
name := "pouch-redux-middleware"
version := "0.5-dt-20180214Z-bd0bb7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-5ae6cc",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-9b48fa",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-39a899",
  "org.scalablytyped" %%% "pouchdb" % "6.3-dt-20190212Z-3cecbd",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20190212Z-95584f",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-348586",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20190212Z-a52c41",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20190212Z-37ed35",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20190212Z-d1bb66",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20190212Z-e7f36c",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20190212Z-2108a6",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-9bdb86",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20190212Z-aeaf70",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-1e69d8",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-14891e",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20190212Z-dc1250",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20190212Z-483bdd",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20190212Z-ef21ad",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20190212Z-a90cdf",
  "org.scalablytyped" %%% "redux" % "4.0.1-b55ee8",
  "org.scalablytyped" %%% "std" % "3.3-73c9dd",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-7a8914")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        