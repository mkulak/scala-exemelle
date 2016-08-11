name := "exemelle"
version := "0.1.0-SNAPSHOT"
scalaVersion := "2.11.8"
organization := "io.github.amrhassan"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "0.6.1",
  "org.typelevel" %% "cats-free" % "0.6.1",
  "com.fasterxml.woodstox" % "woodstox-core" % "5.0.2"
)

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.8.0")

scalacOptions ++= Seq(
  "-Xfatal-warnings",
  "-Ywarn-unused-import",
  "-Xlint"
)
