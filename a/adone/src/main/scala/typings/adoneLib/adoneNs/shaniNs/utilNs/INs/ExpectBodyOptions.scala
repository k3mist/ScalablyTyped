package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpectBodyOptions extends js.Object {
  var decompress: js.UndefOr[scala.Boolean] = js.undefined
}

object ExpectBodyOptions {
  @scala.inline
  def apply(decompress: js.UndefOr[scala.Boolean] = js.undefined): ExpectBodyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decompress)) __obj.updateDynamic("decompress")(decompress)
    __obj.asInstanceOf[ExpectBodyOptions]
  }
}

