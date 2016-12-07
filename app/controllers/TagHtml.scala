package controllers

import java.nio.charset.StandardCharsets

import akka.util.ByteString
import play.api.http.{MimeTypes, Writeable}

import scalatags.Text

/** Helper that enables imports-free usage in Play's `Action`s such as: `Action(Ok(myTags))`.
  *
  * @param tags scalatags
  */
case class TagHtml(tags: Text.TypedTag[String]) {
  override def toString = tags.toString()
}

object TagHtml {
  val typedTagWriteable: Writeable[Text.TypedTag[String]] =
    Writeable(toUtf8, Option(MimeTypes.HTML))

  implicit val html: Writeable[TagHtml] =
    typedTagWriteable.map(_.tags)

  private def toUtf8(tags: Text.TypedTag[String]): ByteString =
    ByteString("<!DOCTYPE html>" + tags, StandardCharsets.UTF_8.name())
}
