package typings
package openlayersLib.openlayersMod.olxNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WKTOptions extends js.Object {
  var splitCollection: js.UndefOr[scala.Boolean] = js.undefined
}

object WKTOptions {
  @scala.inline
  def apply(splitCollection: js.UndefOr[scala.Boolean] = js.undefined): WKTOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(splitCollection)) __obj.updateDynamic("splitCollection")(splitCollection)
    __obj.asInstanceOf[WKTOptions]
  }
}

