lazy val frontend = project.enablePlugins(ScalaJSPlugin, ScalaJSWeb).settings(
  persistLauncher := true
)

lazy val p = com.malliina.sbtplay.PlayProject.default("play-sjs-tags")
  .enablePlugins(SbtWeb)
  .settings(
    scalaJSProjects := Seq(frontend),
    pipelineStages in Assets := Seq(scalaJSPipeline),
    organization := "com.malliina",
    version := "0.0.1",
    scalaVersion := "2.11.8",
    libraryDependencies ++= Seq()
  )
