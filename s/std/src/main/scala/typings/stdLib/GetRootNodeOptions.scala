package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRootNodeOptions extends js.Object {
  var composed: js.UndefOr[scala.Boolean] = js.undefined
}

object GetRootNodeOptions {
  @scala.inline
  def apply(composed: js.UndefOr[scala.Boolean] = js.undefined): GetRootNodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[GetRootNodeOptions]
  }
}

