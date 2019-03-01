package typings
package siestaLib.SiestaNs.TestNs.ActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
trait Drag
  extends siestaLib.SiestaNs.TestNs.IAction {
  var by: js.UndefOr[js.Any] = js.undefined
  var dragOnly: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
  var to: js.UndefOr[js.Any] = js.undefined
}

object Drag {
  @scala.inline
  def apply(
    by: js.Any = null,
    desc: java.lang.String = null,
    dragOnly: js.UndefOr[scala.Boolean] = js.undefined,
    source: js.Any = null,
    target: js.Any = null,
    to: js.Any = null
  ): Drag = {
    val __obj = js.Dynamic.literal()
    if (by != null) __obj.updateDynamic("by")(by)
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (!js.isUndefined(dragOnly)) __obj.updateDynamic("dragOnly")(dragOnly)
    if (source != null) __obj.updateDynamic("source")(source)
    if (target != null) __obj.updateDynamic("target")(target)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Drag]
  }
}

