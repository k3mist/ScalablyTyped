package typings
package openDashGraphLib.openDashGraphMod.ogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(strict: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Options]
  }
}

