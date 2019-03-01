package typings
package chromeLib.chromeNs.systemNs.displayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayInfoFlags extends js.Object {
  /**
    * If set to true, only a single DisplayUnitInfo will be returned by getInfo when in unified desktop mode.
    * @see[enableUnifiedDesktop]
    * @default false
    */
  var singleUnified: js.UndefOr[scala.Boolean] = js.undefined
}

object DisplayInfoFlags {
  @scala.inline
  def apply(singleUnified: js.UndefOr[scala.Boolean] = js.undefined): DisplayInfoFlags = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(singleUnified)) __obj.updateDynamic("singleUnified")(singleUnified)
    __obj.asInstanceOf[DisplayInfoFlags]
  }
}

