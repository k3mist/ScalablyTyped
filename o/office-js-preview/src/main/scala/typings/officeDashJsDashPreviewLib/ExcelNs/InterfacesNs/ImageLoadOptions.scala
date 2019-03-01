package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an image object in the worksheet.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait ImageLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the format for the image. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var format: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the shape identifier for the image object. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the shape object for the image.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var shape: js.UndefOr[ShapeLoadOptions] = js.undefined
}

object ImageLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    format: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    shape: ShapeLoadOptions = null
  ): ImageLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[ImageLoadOptions]
  }
}

