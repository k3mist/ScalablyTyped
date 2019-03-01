package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectorPlain
  extends CssNodeCommon
     with CssNodePlain {
  var children: js.Array[CssNodePlain]
  @JSName("type")
  var type_SelectorPlain: cssDashTreeLib.cssDashTreeLibStrings.Selector
}

object SelectorPlain {
  @scala.inline
  def apply(
    children: js.Array[CssNodePlain],
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Selector,
    loc: CssLocation = null
  ): SelectorPlain = {
    val __obj = js.Dynamic.literal(children = children, `type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[SelectorPlain]
  }
}

