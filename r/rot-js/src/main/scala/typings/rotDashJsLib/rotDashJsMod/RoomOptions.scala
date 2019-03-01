package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomOptions extends FeatureOptions {
  var roomHeight: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var roomWidth: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
}

object RoomOptions {
  @scala.inline
  def apply(
    roomHeight: js.Tuple2[scala.Double, scala.Double] = null,
    roomWidth: js.Tuple2[scala.Double, scala.Double] = null
  ): RoomOptions = {
    val __obj = js.Dynamic.literal()
    if (roomHeight != null) __obj.updateDynamic("roomHeight")(roomHeight)
    if (roomWidth != null) __obj.updateDynamic("roomWidth")(roomWidth)
    __obj.asInstanceOf[RoomOptions]
  }
}

