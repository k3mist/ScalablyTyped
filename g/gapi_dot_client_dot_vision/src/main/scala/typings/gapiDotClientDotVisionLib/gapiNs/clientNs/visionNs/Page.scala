package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  /** List of blocks of text, images etc on this page. */
  var blocks: js.UndefOr[js.Array[Block]] = js.undefined
  /** Page height in pixels. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Additional information detected on the page. */
  var property: js.UndefOr[TextProperty] = js.undefined
  /** Page width in pixels. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Page {
  @scala.inline
  def apply(
    blocks: js.Array[Block] = null,
    height: scala.Int | scala.Double = null,
    property: TextProperty = null,
    width: scala.Int | scala.Double = null
  ): Page = {
    val __obj = js.Dynamic.literal()
    if (blocks != null) __obj.updateDynamic("blocks")(blocks)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

