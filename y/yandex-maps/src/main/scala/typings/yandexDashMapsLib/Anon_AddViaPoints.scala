package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddViaPoints extends js.Object {
  var addViaPoints: js.UndefOr[scala.Boolean] = js.undefined
  var addWayPoints: js.UndefOr[scala.Boolean] = js.undefined
  var editViaPoints: js.UndefOr[scala.Boolean] = js.undefined
  var editWayPoints: js.UndefOr[scala.Boolean] = js.undefined
  var removeViaPoints: js.UndefOr[scala.Boolean] = js.undefined
  var removeWayPoints: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AddViaPoints {
  @scala.inline
  def apply(
    addViaPoints: js.UndefOr[scala.Boolean] = js.undefined,
    addWayPoints: js.UndefOr[scala.Boolean] = js.undefined,
    editViaPoints: js.UndefOr[scala.Boolean] = js.undefined,
    editWayPoints: js.UndefOr[scala.Boolean] = js.undefined,
    removeViaPoints: js.UndefOr[scala.Boolean] = js.undefined,
    removeWayPoints: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AddViaPoints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addViaPoints)) __obj.updateDynamic("addViaPoints")(addViaPoints)
    if (!js.isUndefined(addWayPoints)) __obj.updateDynamic("addWayPoints")(addWayPoints)
    if (!js.isUndefined(editViaPoints)) __obj.updateDynamic("editViaPoints")(editViaPoints)
    if (!js.isUndefined(editWayPoints)) __obj.updateDynamic("editWayPoints")(editWayPoints)
    if (!js.isUndefined(removeViaPoints)) __obj.updateDynamic("removeViaPoints")(removeViaPoints)
    if (!js.isUndefined(removeWayPoints)) __obj.updateDynamic("removeWayPoints")(removeWayPoints)
    __obj.asInstanceOf[Anon_AddViaPoints]
  }
}

