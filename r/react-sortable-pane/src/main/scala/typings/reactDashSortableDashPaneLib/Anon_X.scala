package typings
package reactDashSortableDashPaneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_X extends js.Object {
  var x: js.UndefOr[scala.Boolean] = js.undefined
  var xy: js.UndefOr[scala.Boolean] = js.undefined
  var y: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_X {
  @scala.inline
  def apply(
    x: js.UndefOr[scala.Boolean] = js.undefined,
    xy: js.UndefOr[scala.Boolean] = js.undefined,
    y: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_X = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x)
    if (!js.isUndefined(xy)) __obj.updateDynamic("xy")(xy)
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_X]
  }
}

