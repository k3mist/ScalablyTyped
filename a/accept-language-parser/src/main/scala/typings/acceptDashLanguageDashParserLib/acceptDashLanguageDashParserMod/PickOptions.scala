package typings
package acceptDashLanguageDashParserLib.acceptDashLanguageDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickOptions extends js.Object {
  var loose: js.UndefOr[scala.Boolean] = js.undefined
}

object PickOptions {
  @scala.inline
  def apply(loose: js.UndefOr[scala.Boolean] = js.undefined): PickOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose)
    __obj.asInstanceOf[PickOptions]
  }
}

