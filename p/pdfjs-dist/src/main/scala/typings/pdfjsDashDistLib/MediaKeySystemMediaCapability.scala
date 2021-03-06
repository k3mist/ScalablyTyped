package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaKeySystemMediaCapability extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var robustness: js.UndefOr[java.lang.String] = js.undefined
}

object MediaKeySystemMediaCapability {
  @scala.inline
  def apply(contentType: java.lang.String = null, robustness: java.lang.String = null): MediaKeySystemMediaCapability = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (robustness != null) __obj.updateDynamic("robustness")(robustness)
    __obj.asInstanceOf[MediaKeySystemMediaCapability]
  }
}

