package typings
package yauzlLib.yauzlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var decodeStrings: js.UndefOr[scala.Boolean] = js.undefined
  var lazyEntries: js.UndefOr[scala.Boolean] = js.undefined
  var strictFileNames: js.UndefOr[scala.Boolean] = js.undefined
  var validateEntrySizes: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    decodeStrings: js.UndefOr[scala.Boolean] = js.undefined,
    lazyEntries: js.UndefOr[scala.Boolean] = js.undefined,
    strictFileNames: js.UndefOr[scala.Boolean] = js.undefined,
    validateEntrySizes: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (!js.isUndefined(lazyEntries)) __obj.updateDynamic("lazyEntries")(lazyEntries)
    if (!js.isUndefined(strictFileNames)) __obj.updateDynamic("strictFileNames")(strictFileNames)
    if (!js.isUndefined(validateEntrySizes)) __obj.updateDynamic("validateEntrySizes")(validateEntrySizes)
    __obj.asInstanceOf[Options]
  }
}

