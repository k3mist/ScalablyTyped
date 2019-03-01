package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The kinds of links.
trait LinkKind extends js.Object {
  // If set, indicates this is a link to the specific page in this
  // presentation with this ID. A page with this ID may not exist.
  var page_object_id: java.lang.String
  // If set, indicates this is a link to a slide in this presentation,
  // addressed by its position.
  var relative_link: RelativeSlideLinkLink
  // If set, indicates this is a link to the slide at this zero-based index
  // in the presentation. There may not be a slide at this index.
  var slide_index: scala.Double
  // If set, indicates this is a link to the external web page at this URL.
  var url: java.lang.String
}

object LinkKind {
  @scala.inline
  def apply(
    page_object_id: java.lang.String,
    relative_link: RelativeSlideLinkLink,
    slide_index: scala.Double,
    url: java.lang.String
  ): LinkKind = {
    val __obj = js.Dynamic.literal(page_object_id = page_object_id, relative_link = relative_link, slide_index = slide_index, url = url)
  
    __obj.asInstanceOf[LinkKind]
  }
}

