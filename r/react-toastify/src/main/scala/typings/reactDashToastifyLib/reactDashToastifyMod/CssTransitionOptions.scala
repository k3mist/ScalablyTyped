package typings
package reactDashToastifyLib.reactDashToastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssTransitionOptions extends js.Object {
  /**
    * Append or not the position to the class name:
    * yourClassName--top-right, yourClassName--bottom-left...
    * @default false
    */
  var appendPosition: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The transition duration in ms.
    * @default 750
    */
  var duration: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  /** The class name that will be used when the toast enters. */
  var enter: java.lang.String
  /** The class name that will be used when the toast exits. */
  var exit: java.lang.String
}

object CssTransitionOptions {
  @scala.inline
  def apply(
    enter: java.lang.String,
    exit: java.lang.String,
    appendPosition: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Double | js.Array[scala.Double] = null
  ): CssTransitionOptions = {
    val __obj = js.Dynamic.literal(enter = enter, exit = exit)
    if (!js.isUndefined(appendPosition)) __obj.updateDynamic("appendPosition")(appendPosition)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssTransitionOptions]
  }
}

