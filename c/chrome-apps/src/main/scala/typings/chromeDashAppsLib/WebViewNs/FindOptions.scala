package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOptions extends js.Object {
  /**
    * Flag to find matches in reverse order.
    * @default false
    */
  var backward: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Flag to match with case-sensitivity.
    * @default false
    */
  var matchCase: js.UndefOr[scala.Boolean] = js.undefined
}

object FindOptions {
  @scala.inline
  def apply(
    backward: js.UndefOr[scala.Boolean] = js.undefined,
    matchCase: js.UndefOr[scala.Boolean] = js.undefined
  ): FindOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backward)) __obj.updateDynamic("backward")(backward)
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase)
    __obj.asInstanceOf[FindOptions]
  }
}

