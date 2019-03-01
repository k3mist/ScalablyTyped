package typings
package pakoLib.pakoMod.PakoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InflateOptions extends js.Object {
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var to: js.UndefOr[pakoLib.pakoLibStrings.string] = js.undefined
  var windowBits: js.UndefOr[scala.Double] = js.undefined
}

object InflateOptions {
  @scala.inline
  def apply(
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    to: pakoLib.pakoLibStrings.string = null,
    windowBits: scala.Int | scala.Double = null
  ): InflateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (to != null) __obj.updateDynamic("to")(to)
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[InflateOptions]
  }
}

