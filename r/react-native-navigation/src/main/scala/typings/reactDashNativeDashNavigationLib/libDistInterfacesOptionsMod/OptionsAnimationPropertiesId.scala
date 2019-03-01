package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsAnimationPropertiesId extends OptionsAnimationProperties {
  /**
    * ID of the Top Bar we want to animate
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object OptionsAnimationPropertiesId {
  @scala.inline
  def apply(
    alpha: OptionsAnimationPropertyConfig = null,
    id: java.lang.String = null,
    rotation: OptionsAnimationPropertyConfig = null,
    rotationX: OptionsAnimationPropertyConfig = null,
    rotationY: OptionsAnimationPropertyConfig = null,
    scaleX: OptionsAnimationPropertyConfig = null,
    scaleY: OptionsAnimationPropertyConfig = null,
    waitForRender: js.UndefOr[scala.Boolean] = js.undefined,
    x: OptionsAnimationPropertyConfig = null,
    y: OptionsAnimationPropertyConfig = null
  ): OptionsAnimationPropertiesId = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha)
    if (id != null) __obj.updateDynamic("id")(id)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation)
    if (rotationX != null) __obj.updateDynamic("rotationX")(rotationX)
    if (rotationY != null) __obj.updateDynamic("rotationY")(rotationY)
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX)
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY)
    if (!js.isUndefined(waitForRender)) __obj.updateDynamic("waitForRender")(waitForRender)
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[OptionsAnimationPropertiesId]
  }
}

