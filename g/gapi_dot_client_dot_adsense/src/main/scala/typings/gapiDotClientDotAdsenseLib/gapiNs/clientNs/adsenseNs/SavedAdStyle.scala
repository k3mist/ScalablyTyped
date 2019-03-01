package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedAdStyle extends js.Object {
  /** The AdStyle itself. */
  var adStyle: js.UndefOr[AdStyle] = js.undefined
  /** Unique identifier of this saved ad style. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is, in this case adsense#savedAdStyle. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The user selected name of this SavedAdStyle. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object SavedAdStyle {
  @scala.inline
  def apply(
    adStyle: AdStyle = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null
  ): SavedAdStyle = {
    val __obj = js.Dynamic.literal()
    if (adStyle != null) __obj.updateDynamic("adStyle")(adStyle)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SavedAdStyle]
  }
}

