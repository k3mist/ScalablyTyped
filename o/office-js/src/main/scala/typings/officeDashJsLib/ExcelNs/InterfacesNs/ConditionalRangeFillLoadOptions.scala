package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the background of a conditional range object.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalRangeFillLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * HTML color code representing the color of the fill, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[scala.Boolean] = js.undefined
}

object ConditionalRangeFillLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[scala.Boolean] = js.undefined, color: js.UndefOr[scala.Boolean] = js.undefined): ConditionalRangeFillLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[ConditionalRangeFillLoadOptions]
  }
}

