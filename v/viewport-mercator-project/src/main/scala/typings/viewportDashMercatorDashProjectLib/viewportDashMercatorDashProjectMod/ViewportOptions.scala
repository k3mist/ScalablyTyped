package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportOptions extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var projectionMatrix: js.UndefOr[ProjectionMatrix] = js.undefined
  var viewMatrix: js.UndefOr[ViewMatrix] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ViewportOptions {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    projectionMatrix: ProjectionMatrix = null,
    viewMatrix: ViewMatrix = null,
    width: scala.Int | scala.Double = null
  ): ViewportOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (projectionMatrix != null) __obj.updateDynamic("projectionMatrix")(projectionMatrix)
    if (viewMatrix != null) __obj.updateDynamic("viewMatrix")(viewMatrix)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportOptions]
  }
}

