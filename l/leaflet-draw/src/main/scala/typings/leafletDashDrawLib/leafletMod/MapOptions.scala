package typings
package leafletDashDrawLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var drawControl: js.UndefOr[scala.Boolean] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(drawControl: js.UndefOr[scala.Boolean] = js.undefined): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drawControl)) __obj.updateDynamic("drawControl")(drawControl)
    __obj.asInstanceOf[MapOptions]
  }
}

