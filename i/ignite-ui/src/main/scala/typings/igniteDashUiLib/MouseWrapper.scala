package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseWrapper
  extends /**
	 * Option for mouseWrapper
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  var capture: js.UndefOr[CaptureEvent] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var drag: js.UndefOr[DragEvent] = js.undefined
  var start: js.UndefOr[StartEvent] = js.undefined
  var stop: js.UndefOr[StopEvent] = js.undefined
}

object MouseWrapper {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for mouseWrapper
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    cancel: java.lang.String = null,
    capture: CaptureEvent = null,
    delay: scala.Int | scala.Double = null,
    distance: scala.Int | scala.Double = null,
    drag: DragEvent = null,
    start: StartEvent = null,
    stop: StopEvent = null
  ): MouseWrapper = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (capture != null) __obj.updateDynamic("capture")(capture)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[MouseWrapper]
  }
}

