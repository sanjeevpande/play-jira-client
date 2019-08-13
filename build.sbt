name := "play-jira-client"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "com.atlassian.jira" % "jira-rest-java-client-core" % "5.1.0"
)     

play.Project.playJavaSettings

resolvers += "Jira repository" at "https://maven.atlassian.com/content/repositories/atlassian-public/"