publishTo := {
  val nexus = "http://115.28.15.44:8080/nexus/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "content/repositories/releases")
}

credentials += Credentials(Path.userHome / ".sbt" / "repo.kernelogic.credentials")
