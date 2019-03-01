package typings
package gapiDotClientDotPagespeedonlineLib.gapiNs.clientNs.pagespeedonlineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagespeedApiImageV2 extends js.Object {
  /** Image data base64 encoded. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Height of screenshot in pixels. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Unique string key, if any, identifying this image. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Mime type of image data (e.g. "image/jpeg"). */
  var mime_type: js.UndefOr[java.lang.String] = js.undefined
  /** The region of the page that is captured by this image, with dimensions measured in CSS pixels. */
  var page_rect: js.UndefOr[gapiDotClientDotPagespeedonlineLib.Anon_Height] = js.undefined
  /** Width of screenshot in pixels. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object PagespeedApiImageV2 {
  @scala.inline
  def apply(
    data: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    key: java.lang.String = null,
    mime_type: java.lang.String = null,
    page_rect: gapiDotClientDotPagespeedonlineLib.Anon_Height = null,
    width: scala.Int | scala.Double = null
  ): PagespeedApiImageV2 = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type)
    if (page_rect != null) __obj.updateDynamic("page_rect")(page_rect)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagespeedApiImageV2]
  }
}

