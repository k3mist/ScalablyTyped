package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectOptions extends js.Object {
  var topLeft: js.UndefOr[scala.Boolean] = js.undefined
}

object ProjectOptions {
  @scala.inline
  def apply(topLeft: js.UndefOr[scala.Boolean] = js.undefined): ProjectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(topLeft)) __obj.updateDynamic("topLeft")(topLeft)
    __obj.asInstanceOf[ProjectOptions]
  }
}

