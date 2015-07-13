name := """closeness-centrality-metrics"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test
)

libraryDependencies += "org.sorm-framework" % "sorm" % "0.3.15"
libraryDependencies += "com.typesafe.slick" %% "slick" % "3.0.0"
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.+"
//libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.6.4"


resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
