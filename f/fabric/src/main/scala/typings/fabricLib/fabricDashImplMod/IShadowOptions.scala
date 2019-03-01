package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShadowOptions extends js.Object {
  /**
  	 * Whether the shadow should affect stroke operations
  	 */
  var affectStrike: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Shadow blur
  	 */
  var blur: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Shadow color
  	 */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Indicates whether toObject should include default values
  	 */
  var includeDefaultValues: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Shadow horizontal offset
  	 */
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Shadow vertical offset
  	 */
  var offsetY: js.UndefOr[scala.Double] = js.undefined
}

object IShadowOptions {
  @scala.inline
  def apply(
    affectStrike: js.UndefOr[scala.Boolean] = js.undefined,
    blur: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    includeDefaultValues: js.UndefOr[scala.Boolean] = js.undefined,
    offsetX: scala.Int | scala.Double = null,
    offsetY: scala.Int | scala.Double = null
  ): IShadowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(affectStrike)) __obj.updateDynamic("affectStrike")(affectStrike)
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(includeDefaultValues)) __obj.updateDynamic("includeDefaultValues")(includeDefaultValues)
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShadowOptions]
  }
}

