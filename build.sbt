lazy val client = project.enablePlugins(ScalaJSPlugin, ScalaJSWeb).settings(
  persistLauncher := true
)

lazy val p = com.malliina.sbtplay.PlayProject("play-sjs-tags")
  .enablePlugins(SbtWeb)
  .settings(
    scalaJSProjects := Seq(client),
    pipelineStages in Assets := Seq(scalaJSPipeline),
    organization := "com.malliina",
    version := "0.0.1",
    scalaVersion := "2.11.8",
    libraryDependencies ++= Seq(
      "com.lihaoyi" %% "scalatags" % "0.6.1",
      "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
    )
  )
