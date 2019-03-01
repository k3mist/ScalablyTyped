package typings
package ejDotWebDotAllLib.ejNs.RotatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  /** Specifies a link for the image.
    */
  var linkAttribute: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies where to open a given link.
    */
  var targetAttribute: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies a caption for the image.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies a caption for the thumbnail image.
    */
  var thumbnailText: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the URL for an thumbnail image.
    */
  var thumbnailUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the URL for an image.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Fields {
  @scala.inline
  def apply(
    linkAttribute: java.lang.String = null,
    targetAttribute: java.lang.String = null,
    text: java.lang.String = null,
    thumbnailText: java.lang.String = null,
    thumbnailUrl: java.lang.String = null,
    url: java.lang.String = null
  ): Fields = {
    val __obj = js.Dynamic.literal()
    if (linkAttribute != null) __obj.updateDynamic("linkAttribute")(linkAttribute)
    if (targetAttribute != null) __obj.updateDynamic("targetAttribute")(targetAttribute)
    if (text != null) __obj.updateDynamic("text")(text)
    if (thumbnailText != null) __obj.updateDynamic("thumbnailText")(thumbnailText)
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Fields]
  }
}

