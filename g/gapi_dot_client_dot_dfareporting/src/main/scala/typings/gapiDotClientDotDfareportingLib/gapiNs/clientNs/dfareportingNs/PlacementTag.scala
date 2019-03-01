package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementTag extends js.Object {
  /** Placement ID */
  var placementId: js.UndefOr[java.lang.String] = js.undefined
  /** Tags generated for this placement. */
  var tagDatas: js.UndefOr[js.Array[TagData]] = js.undefined
}

object PlacementTag {
  @scala.inline
  def apply(placementId: java.lang.String = null, tagDatas: js.Array[TagData] = null): PlacementTag = {
    val __obj = js.Dynamic.literal()
    if (placementId != null) __obj.updateDynamic("placementId")(placementId)
    if (tagDatas != null) __obj.updateDynamic("tagDatas")(tagDatas)
    __obj.asInstanceOf[PlacementTag]
  }
}

