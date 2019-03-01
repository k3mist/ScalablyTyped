package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlipEffectOptions extends js.Object {
  var limitRotation: js.UndefOr[scala.Boolean] = js.undefined
  var slideShadows: js.UndefOr[scala.Boolean] = js.undefined
}

object FlipEffectOptions {
  @scala.inline
  def apply(
    limitRotation: js.UndefOr[scala.Boolean] = js.undefined,
    slideShadows: js.UndefOr[scala.Boolean] = js.undefined
  ): FlipEffectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limitRotation)) __obj.updateDynamic("limitRotation")(limitRotation)
    if (!js.isUndefined(slideShadows)) __obj.updateDynamic("slideShadows")(slideShadows)
    __obj.asInstanceOf[FlipEffectOptions]
  }
}

