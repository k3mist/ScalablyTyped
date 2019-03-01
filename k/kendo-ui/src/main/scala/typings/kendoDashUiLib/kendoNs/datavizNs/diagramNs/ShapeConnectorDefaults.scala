package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeConnectorDefaults extends js.Object {
  var fill: js.UndefOr[java.lang.String | ShapeConnectorDefaultsFill] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hover: js.UndefOr[ShapeConnectorDefaultsHover] = js.undefined
  var stroke: js.UndefOr[java.lang.String | ShapeConnectorDefaultsStroke] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ShapeConnectorDefaults {
  @scala.inline
  def apply(
    fill: java.lang.String | ShapeConnectorDefaultsFill = null,
    height: scala.Int | scala.Double = null,
    hover: ShapeConnectorDefaultsHover = null,
    stroke: java.lang.String | ShapeConnectorDefaultsStroke = null,
    width: scala.Int | scala.Double = null
  ): ShapeConnectorDefaults = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeConnectorDefaults]
  }
}

