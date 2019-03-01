package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeScale extends js.Object {
  /** When set to true, displays the time slots on the Scheduler.
    * @Default {true}
    */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** Accepts the value in minutes. When provided with specific value, displays the appropriate time interval on the Scheduler
    * @Default {60}
    */
  var majorSlot: js.UndefOr[scala.Double] = js.undefined
  /** Template design that customizes the timecells (major slots). Accepts id value of the template defined for major time slots.
    * @Default {null}
    */
  var majorSlotTemplateId: js.UndefOr[java.lang.String] = js.undefined
  /** When set with some specific value, defines the number of time divisions split per hour(as per value given for the majorTimeSlot). Those time divisions are meant to be the minor
    * slots.
    * @Default {2}
    */
  var minorSlotCount: js.UndefOr[scala.Double] = js.undefined
  /** Template design that customizes the timecells (minor slots) that are partitioned based on minorSlotCount. Accepts id value of the template defined for minor time slots.
    * @Default {null}
    */
  var minorSlotTemplateId: js.UndefOr[java.lang.String] = js.undefined
}

object TimeScale {
  @scala.inline
  def apply(
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    majorSlot: scala.Int | scala.Double = null,
    majorSlotTemplateId: java.lang.String = null,
    minorSlotCount: scala.Int | scala.Double = null,
    minorSlotTemplateId: java.lang.String = null
  ): TimeScale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (majorSlot != null) __obj.updateDynamic("majorSlot")(majorSlot.asInstanceOf[js.Any])
    if (majorSlotTemplateId != null) __obj.updateDynamic("majorSlotTemplateId")(majorSlotTemplateId)
    if (minorSlotCount != null) __obj.updateDynamic("minorSlotCount")(minorSlotCount.asInstanceOf[js.Any])
    if (minorSlotTemplateId != null) __obj.updateDynamic("minorSlotTemplateId")(minorSlotTemplateId)
    __obj.asInstanceOf[TimeScale]
  }
}

