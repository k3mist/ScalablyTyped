package typings
package jqueryDotPnotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Closer extends js.Object {
  var closer: js.UndefOr[java.lang.String] = js.undefined
  var pin_down: js.UndefOr[java.lang.String] = js.undefined
  var pin_up: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Closer {
  @scala.inline
  def apply(
    closer: java.lang.String = null,
    pin_down: java.lang.String = null,
    pin_up: java.lang.String = null
  ): Anon_Closer = {
    val __obj = js.Dynamic.literal()
    if (closer != null) __obj.updateDynamic("closer")(closer)
    if (pin_down != null) __obj.updateDynamic("pin_down")(pin_down)
    if (pin_up != null) __obj.updateDynamic("pin_up")(pin_up)
    __obj.asInstanceOf[Anon_Closer]
  }
}

