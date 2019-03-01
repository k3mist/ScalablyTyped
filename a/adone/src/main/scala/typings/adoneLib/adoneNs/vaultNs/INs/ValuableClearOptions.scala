package typings
package adoneLib.adoneNs.vaultNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValuableClearOptions extends js.Object {
  var includeNotes: js.UndefOr[scala.Boolean] = js.undefined
  var includeTags: js.UndefOr[scala.Boolean] = js.undefined
}

object ValuableClearOptions {
  @scala.inline
  def apply(
    includeNotes: js.UndefOr[scala.Boolean] = js.undefined,
    includeTags: js.UndefOr[scala.Boolean] = js.undefined
  ): ValuableClearOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeNotes)) __obj.updateDynamic("includeNotes")(includeNotes)
    if (!js.isUndefined(includeTags)) __obj.updateDynamic("includeTags")(includeTags)
    __obj.asInstanceOf[ValuableClearOptions]
  }
}

