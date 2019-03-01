package typings
package siestaLib.SiestaNs.TestNs.ActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
trait MoveCursor
  extends siestaLib.SiestaNs.TestNs.IAction
     with siestaLib.SiestaNs.TestNs.ActionNs.RoleNs.IHasTarget {
  var by: js.UndefOr[js.Any] = js.undefined
  var to: js.UndefOr[js.Any] = js.undefined
}

object MoveCursor {
  @scala.inline
  def apply(
    by: js.Any = null,
    desc: java.lang.String = null,
    el: js.Any = null,
    passTargetToNext: js.UndefOr[scala.Boolean] = js.undefined,
    target: js.Any = null,
    to: js.Any = null
  ): MoveCursor = {
    val __obj = js.Dynamic.literal()
    if (by != null) __obj.updateDynamic("by")(by)
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (el != null) __obj.updateDynamic("el")(el)
    if (!js.isUndefined(passTargetToNext)) __obj.updateDynamic("passTargetToNext")(passTargetToNext)
    if (target != null) __obj.updateDynamic("target")(target)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[MoveCursor]
  }
}

