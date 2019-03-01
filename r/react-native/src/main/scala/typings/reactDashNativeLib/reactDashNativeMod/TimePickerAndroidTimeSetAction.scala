package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerAndroidTimeSetAction extends TimePickerAndroidOpenReturn {
  var action: reactDashNativeLib.reactDashNativeLibStrings.timeSetAction
  var hour: scala.Double
  var minute: scala.Double
}

object TimePickerAndroidTimeSetAction {
  @scala.inline
  def apply(
    action: reactDashNativeLib.reactDashNativeLibStrings.timeSetAction,
    hour: scala.Double,
    minute: scala.Double
  ): TimePickerAndroidTimeSetAction = {
    val __obj = js.Dynamic.literal(action = action, hour = hour, minute = minute)
  
    __obj.asInstanceOf[TimePickerAndroidTimeSetAction]
  }
}

