name := "macro-tests"

version := "1.0"

scalaVersion := "2.11.11"

resolvers += Resolver.bintrayIvyRepo("scalameta", "maven")
addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M9" cross CrossVersion.full)

libraryDependencies ++= Seq(
  "org.scalameta" %% "scalameta" % "1.8.0"
)
