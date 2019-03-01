package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterSetExtremes extends js.Object {
  /**
    * As opposed to the setExtremes event, this event fires after the final min and max values are computed and
    * corrected for minRange.
    * The this keyword refers to the {@link AxisObject|Axis} object.
    */
  var afterSetExtremes: js.UndefOr[
    js.Function1[/* event */ highchartsLib.highchartsMod.HighchartsNs.AxisEvent, scala.Unit]
  ] = js.undefined
  /**
    * Fires when the minimum and maximum is set for the axis, either by calling the .setExtremes() method or by
    * selecting an area in the chart. One parameter, event, is passed to the function. This contains common event
    * information based on jQuery or MooTools depending on which library is used as the base for Highcharts.
    *
    * The new user set minimum and maximum values can be found by event.min and event.max. When an axis is zoomed
    * all the way out from the 'Reset zoom' button, event.min and event.max are null, and the new extremes are set
    * based on this.dataMin and this.dataMax.
    *
    * The this keyword refers to the {@link AxisObject|Axis} object.
    */
  var setExtremes: js.UndefOr[
    js.Function1[/* event */ highchartsLib.highchartsMod.HighchartsNs.AxisEvent, scala.Unit]
  ] = js.undefined
}

object Anon_AfterSetExtremes {
  @scala.inline
  def apply(
    afterSetExtremes: js.Function1[/* event */ highchartsLib.highchartsMod.HighchartsNs.AxisEvent, scala.Unit] = null,
    setExtremes: js.Function1[/* event */ highchartsLib.highchartsMod.HighchartsNs.AxisEvent, scala.Unit] = null
  ): Anon_AfterSetExtremes = {
    val __obj = js.Dynamic.literal()
    if (afterSetExtremes != null) __obj.updateDynamic("afterSetExtremes")(afterSetExtremes)
    if (setExtremes != null) __obj.updateDynamic("setExtremes")(setExtremes)
    __obj.asInstanceOf[Anon_AfterSetExtremes]
  }
}

