package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InheritanceOptions extends js.Object {
  var only: js.UndefOr[scala.Boolean] = js.undefined
}

object InheritanceOptions {
  @scala.inline
  def apply(only: js.UndefOr[scala.Boolean] = js.undefined): InheritanceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only)
    __obj.asInstanceOf[InheritanceOptions]
  }
}

