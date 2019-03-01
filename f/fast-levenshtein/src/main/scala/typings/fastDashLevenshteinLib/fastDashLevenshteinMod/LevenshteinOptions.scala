package typings
package fastDashLevenshteinLib.fastDashLevenshteinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevenshteinOptions extends js.Object {
  var useCollator: js.UndefOr[scala.Boolean] = js.undefined
}

object LevenshteinOptions {
  @scala.inline
  def apply(useCollator: js.UndefOr[scala.Boolean] = js.undefined): LevenshteinOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useCollator)) __obj.updateDynamic("useCollator")(useCollator)
    __obj.asInstanceOf[LevenshteinOptions]
  }
}

