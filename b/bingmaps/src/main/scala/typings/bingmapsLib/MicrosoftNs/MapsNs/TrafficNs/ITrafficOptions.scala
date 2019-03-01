package typings
package bingmapsLib.MicrosoftNs.MapsNs.TrafficNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITrafficOptions extends js.Object {
  /** Displays the traffic flow layer. */
  var flowVisible: js.UndefOr[scala.Boolean] = js.undefined
  /** Displays all traffic incidents. */
  var incidentsVisible: js.UndefOr[scala.Boolean] = js.undefined
  /** Displays the traffic legend. */
  var legendVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the opacity of the traffic flow tile layer. Must be a number between 0 and 1. The default is 1 unless the map
    * mode is set to lite, in which case the default is set to 0.7.
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object ITrafficOptions {
  @scala.inline
  def apply(
    flowVisible: js.UndefOr[scala.Boolean] = js.undefined,
    incidentsVisible: js.UndefOr[scala.Boolean] = js.undefined,
    legendVisible: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null
  ): ITrafficOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flowVisible)) __obj.updateDynamic("flowVisible")(flowVisible)
    if (!js.isUndefined(incidentsVisible)) __obj.updateDynamic("incidentsVisible")(incidentsVisible)
    if (!js.isUndefined(legendVisible)) __obj.updateDynamic("legendVisible")(legendVisible)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITrafficOptions]
  }
}

