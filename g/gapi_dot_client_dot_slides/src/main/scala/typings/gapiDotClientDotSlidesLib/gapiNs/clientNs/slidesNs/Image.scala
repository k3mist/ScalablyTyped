package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /**
    * An URL to an image with a default lifetime of 30 minutes.
    * This URL is tagged with the account of the requester. Anyone with the URL
    * effectively accesses the image as the original requester. Access to the
    * image may be lost if the presentation's sharing settings change.
    */
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The properties of the image. */
  var imageProperties: js.UndefOr[ImageProperties] = js.undefined
}

object Image {
  @scala.inline
  def apply(contentUrl: java.lang.String = null, imageProperties: ImageProperties = null): Image = {
    val __obj = js.Dynamic.literal()
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (imageProperties != null) __obj.updateDynamic("imageProperties")(imageProperties)
    __obj.asInstanceOf[Image]
  }
}

