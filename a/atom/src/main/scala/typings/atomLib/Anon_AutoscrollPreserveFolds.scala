package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoscrollPreserveFolds extends js.Object {
  var autoscroll: js.UndefOr[scala.Boolean] = js.undefined
  var preserveFolds: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AutoscrollPreserveFolds {
  @scala.inline
  def apply(
    autoscroll: js.UndefOr[scala.Boolean] = js.undefined,
    preserveFolds: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AutoscrollPreserveFolds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoscroll)) __obj.updateDynamic("autoscroll")(autoscroll)
    if (!js.isUndefined(preserveFolds)) __obj.updateDynamic("preserveFolds")(preserveFolds)
    __obj.asInstanceOf[Anon_AutoscrollPreserveFolds]
  }
}

