package typings
package backboneDotPaginatorLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageableSwitchModeOptions extends js.Object {
  var fetch: js.UndefOr[scala.Boolean] = js.undefined
  var resetState: js.UndefOr[scala.Boolean] = js.undefined
}

object PageableSwitchModeOptions {
  @scala.inline
  def apply(
    fetch: js.UndefOr[scala.Boolean] = js.undefined,
    resetState: js.UndefOr[scala.Boolean] = js.undefined
  ): PageableSwitchModeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fetch)) __obj.updateDynamic("fetch")(fetch)
    if (!js.isUndefined(resetState)) __obj.updateDynamic("resetState")(resetState)
    __obj.asInstanceOf[PageableSwitchModeOptions]
  }
}

