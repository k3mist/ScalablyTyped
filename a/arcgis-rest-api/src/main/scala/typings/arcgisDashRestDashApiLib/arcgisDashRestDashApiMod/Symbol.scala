package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends js.Object {
  var style: js.UndefOr[java.lang.String] = js.undefined
  var `type`: SymbolType
}

object Symbol {
  @scala.inline
  def apply(`type`: SymbolType, style: java.lang.String = null): Symbol = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Symbol]
  }
}

