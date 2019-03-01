package typings
package wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneEntityObjectConfigData extends js.Object {
  var cloneChildren: js.UndefOr[scala.Boolean] = js.undefined
  var cloneGeometry: js.UndefOr[scala.Boolean] = js.undefined
  var shareGeometry: js.UndefOr[scala.Boolean] = js.undefined
}

object CloneEntityObjectConfigData {
  @scala.inline
  def apply(
    cloneChildren: js.UndefOr[scala.Boolean] = js.undefined,
    cloneGeometry: js.UndefOr[scala.Boolean] = js.undefined,
    shareGeometry: js.UndefOr[scala.Boolean] = js.undefined
  ): CloneEntityObjectConfigData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cloneChildren)) __obj.updateDynamic("cloneChildren")(cloneChildren)
    if (!js.isUndefined(cloneGeometry)) __obj.updateDynamic("cloneGeometry")(cloneGeometry)
    if (!js.isUndefined(shareGeometry)) __obj.updateDynamic("shareGeometry")(shareGeometry)
    __obj.asInstanceOf[CloneEntityObjectConfigData]
  }
}

