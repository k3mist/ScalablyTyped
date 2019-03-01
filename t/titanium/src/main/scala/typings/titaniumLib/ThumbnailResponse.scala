package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to the thumbnail callback in response to the
  * [requestThumbnailImagesAtTimes](Titanium.Media.VideoPlayer.requestThumbnailImagesAtTimes)
  * method.
  */
trait ThumbnailResponse extends js.Object {
  /**
  	 * Error code. Returns 0 if `success` is `true`.
  	 */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Thumbnail image, as a `Blob`.
  	 */
  var image: js.UndefOr[titaniumLib.TitaniumNs.Blob] = js.undefined
  /**
  	 * Indicates if the operation succeeded.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Time offset for the thumbnail, in seconds.
  	 */
  var time: js.UndefOr[scala.Double] = js.undefined
}

object ThumbnailResponse {
  @scala.inline
  def apply(
    code: scala.Int | scala.Double = null,
    error: java.lang.String = null,
    image: titaniumLib.TitaniumNs.Blob = null,
    success: js.UndefOr[scala.Boolean] = js.undefined,
    time: scala.Int | scala.Double = null
  ): ThumbnailResponse = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (image != null) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbnailResponse]
  }
}

