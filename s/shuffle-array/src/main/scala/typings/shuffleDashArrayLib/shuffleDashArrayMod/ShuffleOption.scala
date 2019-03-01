package typings
package shuffleDashArrayLib.shuffleDashArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShuffleOption extends js.Object {
  var copy: js.UndefOr[scala.Boolean] = js.undefined
  var rng: js.UndefOr[js.Function0[scala.Double]] = js.undefined
}

object ShuffleOption {
  @scala.inline
  def apply(copy: js.UndefOr[scala.Boolean] = js.undefined, rng: js.Function0[scala.Double] = null): ShuffleOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(copy)) __obj.updateDynamic("copy")(copy)
    if (rng != null) __obj.updateDynamic("rng")(rng)
    __obj.asInstanceOf[ShuffleOption]
  }
}

