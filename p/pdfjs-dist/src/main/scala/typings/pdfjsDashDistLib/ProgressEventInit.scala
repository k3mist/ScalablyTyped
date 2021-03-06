package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEventInit extends EventInit {
  var lengthComputable: js.UndefOr[scala.Boolean] = js.undefined
  var loaded: js.UndefOr[scala.Double] = js.undefined
  var total: js.UndefOr[scala.Double] = js.undefined
}

object ProgressEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    lengthComputable: js.UndefOr[scala.Boolean] = js.undefined,
    loaded: scala.Int | scala.Double = null,
    total: scala.Int | scala.Double = null
  ): ProgressEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (!js.isUndefined(lengthComputable)) __obj.updateDynamic("lengthComputable")(lengthComputable)
    if (loaded != null) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressEventInit]
  }
}

