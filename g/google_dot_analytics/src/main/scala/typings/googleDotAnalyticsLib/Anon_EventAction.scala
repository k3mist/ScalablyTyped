package typings
package googleDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventAction extends js.Object {
  var eventAction: java.lang.String
  var eventCategory: java.lang.String
  var eventLabel: js.UndefOr[java.lang.String] = js.undefined
  var eventValue: js.UndefOr[scala.Double] = js.undefined
  var nonInteraction: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_EventAction {
  @scala.inline
  def apply(
    eventAction: java.lang.String,
    eventCategory: java.lang.String,
    eventLabel: java.lang.String = null,
    eventValue: scala.Int | scala.Double = null,
    nonInteraction: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_EventAction = {
    val __obj = js.Dynamic.literal(eventAction = eventAction, eventCategory = eventCategory)
    if (eventLabel != null) __obj.updateDynamic("eventLabel")(eventLabel)
    if (eventValue != null) __obj.updateDynamic("eventValue")(eventValue.asInstanceOf[js.Any])
    if (!js.isUndefined(nonInteraction)) __obj.updateDynamic("nonInteraction")(nonInteraction)
    __obj.asInstanceOf[Anon_EventAction]
  }
}

