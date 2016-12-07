package controllers

import play.api.http.{MimeTypes, Writeable}
import play.api.mvc._

import scalatags.Text.all._

class Home extends Controller {
  val msg = "Hello"

  def indexTwirl = okAction(views.html.index(msg))

  def indexTags = okAction {
    TagHtml(
      html(lang := "en")(
        body(
          h1(msg),
          jsAssetAt("client-fastopt.js"),
          jsAssetAt("client-launcher.js")
        )
      )
    )
  }

  def jsAssetAt(file: String) = jsAsset(routes.Assets.at(file))

  def jsAsset(file: Call) = script(src := file.toString, `type` := MimeTypes.JAVASCRIPT)

  def okAction[C: Writeable](c: C) = Action(Ok(c))
}
