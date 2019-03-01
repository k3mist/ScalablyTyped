package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteMultipartUploadOptions extends js.Object {
  var callback: js.UndefOr[ObjectCallback] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object CompleteMultipartUploadOptions {
  @scala.inline
  def apply(
    callback: ObjectCallback = null,
    headers: js.Object = null,
    timeout: scala.Int | scala.Double = null
  ): CompleteMultipartUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMultipartUploadOptions]
  }
}

