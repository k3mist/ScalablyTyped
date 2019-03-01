package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EvenColorOddColor extends js.Object {
  var evenColor: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var oddColor: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var offset: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var orientation: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var repeat: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
}

object Anon_EvenColorOddColor {
  @scala.inline
  def apply(
    evenColor: cesiumLib.cesiumMod.CesiumNs.Property = null,
    oddColor: cesiumLib.cesiumMod.CesiumNs.Property = null,
    offset: cesiumLib.cesiumMod.CesiumNs.Property = null,
    orientation: cesiumLib.cesiumMod.CesiumNs.Property = null,
    repeat: cesiumLib.cesiumMod.CesiumNs.Property = null
  ): Anon_EvenColorOddColor = {
    val __obj = js.Dynamic.literal()
    if (evenColor != null) __obj.updateDynamic("evenColor")(evenColor)
    if (oddColor != null) __obj.updateDynamic("oddColor")(oddColor)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat)
    __obj.asInstanceOf[Anon_EvenColorOddColor]
  }
}

