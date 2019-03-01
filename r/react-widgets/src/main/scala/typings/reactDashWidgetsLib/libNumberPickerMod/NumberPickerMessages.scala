package typings
package reactDashWidgetsLib.libNumberPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberPickerMessages extends js.Object {
  /**
    * Number picker spinner down button text for screen readers.
    * @default "decrement value"
    */
  var decrement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number picker spinner up button text for screen readers.
    * @default "increment value"
    */
  var increment: js.UndefOr[java.lang.String] = js.undefined
}

object NumberPickerMessages {
  @scala.inline
  def apply(decrement: java.lang.String = null, increment: java.lang.String = null): NumberPickerMessages = {
    val __obj = js.Dynamic.literal()
    if (decrement != null) __obj.updateDynamic("decrement")(decrement)
    if (increment != null) __obj.updateDynamic("increment")(increment)
    __obj.asInstanceOf[NumberPickerMessages]
  }
}

