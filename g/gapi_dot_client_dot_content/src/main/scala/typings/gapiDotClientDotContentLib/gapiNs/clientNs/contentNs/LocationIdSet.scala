package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationIdSet extends js.Object {
  /** A non-empty list of location IDs. They must all be of the same location type (e.g., state). */
  var locationIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object LocationIdSet {
  @scala.inline
  def apply(locationIds: js.Array[java.lang.String] = null): LocationIdSet = {
    val __obj = js.Dynamic.literal()
    if (locationIds != null) __obj.updateDynamic("locationIds")(locationIds)
    __obj.asInstanceOf[LocationIdSet]
  }
}

