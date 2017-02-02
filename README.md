[![Build Status](https://travis-ci.org/malliina/play-sjs-tags.svg?branch=master)](https://travis-ci.org/malliina/play-sjs-tags)

# play-sjs-tags

This [Play Framework](http://www.playframework.com/) example web app uses [Scalatags](http://www.lihaoyi.com/scalatags/) 
as its template engine and has a [Scala.js](http://www.scala-js.org/) module in the `frontend` subfolder 
for frontend code.

Play and Scala.js integration is managed by the [sbt-web-scalajs](https://github.com/vmunier/sbt-web-scalajs) SBT plugin.

This project is similar to [play-with-scalajs-example](https://github.com/vmunier/play-with-scalajs-example) apart
from the Scalatags integration.

## Running

Install:

- [Node.js](https://nodejs.org/en/download/)
- [sbt](http://www.scala-sbt.org/)

Maybe:

    npm install jsdom

Run in the project root:

    sbt run
    
Navigate with your favorite browser to:

    http://localhost:9000
    
You will see a page served by the Play app that contains JavaScript created with Scala.js. Reload 
the browser after code changes to any module.
