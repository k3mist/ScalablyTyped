package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a shape group object inside a worksheet.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait ShapeGroupLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the shape object for the group.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var shape: js.UndefOr[ShapeLoadOptions] = js.undefined
}

object ShapeGroupLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    shape: ShapeLoadOptions = null
  ): ShapeGroupLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[ShapeGroupLoadOptions]
  }
}

