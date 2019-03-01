package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardOptions extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var onlyInViewport: js.UndefOr[scala.Boolean] = js.undefined
}

object KeyboardOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    onlyInViewport: js.UndefOr[scala.Boolean] = js.undefined
  ): KeyboardOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(onlyInViewport)) __obj.updateDynamic("onlyInViewport")(onlyInViewport)
    __obj.asInstanceOf[KeyboardOptions]
  }
}

