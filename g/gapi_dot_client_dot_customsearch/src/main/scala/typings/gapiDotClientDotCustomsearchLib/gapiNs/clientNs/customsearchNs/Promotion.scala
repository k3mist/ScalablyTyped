package typings
package gapiDotClientDotCustomsearchLib.gapiNs.clientNs.customsearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promotion extends js.Object {
  var bodyLines: js.UndefOr[js.Array[gapiDotClientDotCustomsearchLib.Anon_HtmlTitle]] = js.undefined
  var displayLink: js.UndefOr[java.lang.String] = js.undefined
  var htmlTitle: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[gapiDotClientDotCustomsearchLib.Anon_Height] = js.undefined
  var link: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Promotion {
  @scala.inline
  def apply(
    bodyLines: js.Array[gapiDotClientDotCustomsearchLib.Anon_HtmlTitle] = null,
    displayLink: java.lang.String = null,
    htmlTitle: java.lang.String = null,
    image: gapiDotClientDotCustomsearchLib.Anon_Height = null,
    link: java.lang.String = null,
    title: java.lang.String = null
  ): Promotion = {
    val __obj = js.Dynamic.literal()
    if (bodyLines != null) __obj.updateDynamic("bodyLines")(bodyLines)
    if (displayLink != null) __obj.updateDynamic("displayLink")(displayLink)
    if (htmlTitle != null) __obj.updateDynamic("htmlTitle")(htmlTitle)
    if (image != null) __obj.updateDynamic("image")(image)
    if (link != null) __obj.updateDynamic("link")(link)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Promotion]
  }
}

