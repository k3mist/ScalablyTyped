package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyOptions extends js.Object {
  var baseTexture: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[scala.Boolean] = js.undefined
  var texture: js.UndefOr[scala.Boolean] = js.undefined
}

object DestroyOptions {
  @scala.inline
  def apply(
    baseTexture: js.UndefOr[scala.Boolean] = js.undefined,
    children: js.UndefOr[scala.Boolean] = js.undefined,
    texture: js.UndefOr[scala.Boolean] = js.undefined
  ): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baseTexture)) __obj.updateDynamic("baseTexture")(baseTexture)
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(texture)) __obj.updateDynamic("texture")(texture)
    __obj.asInstanceOf[DestroyOptions]
  }
}

