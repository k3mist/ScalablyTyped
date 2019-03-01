package typings
package gapiDotClientDotPlusLib.gapiNs.clientNs.plusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Place extends js.Object {
  /** The physical address of the place. */
  var address: js.UndefOr[gapiDotClientDotPlusLib.Anon_Formatted] = js.undefined
  /** The display name of the place. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The id of the place. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies this resource as a place. Value: "plus#place". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The position of the place. */
  var position: js.UndefOr[gapiDotClientDotPlusLib.Anon_Latitude] = js.undefined
}

object Place {
  @scala.inline
  def apply(
    address: gapiDotClientDotPlusLib.Anon_Formatted = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    position: gapiDotClientDotPlusLib.Anon_Latitude = null
  ): Place = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Place]
  }
}

