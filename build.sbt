name := "chisel project"

version := "3.1.0"

scalaVersion := "2.12.8"

scalacOptions ++= Seq("-Xsource:2.11")

resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases")
)

libraryDependencies += "edu.berkeley.cs" %% "chisel3" % "3.1.8"
libraryDependencies += "edu.berkeley.cs" %% "chisel-iotesters" % "1.2.2"
