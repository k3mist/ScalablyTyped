package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#core/export
  */
trait ExportOptions extends js.Object {
  /**
    * The background colour of the image (transparent by default).
    */
  var bg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to export the current viewport view (false, default) or the entire graph (true).
    */
  var full: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies the scale automatically in combination with maxWidth such that the resultant image is no taller than maxHeight.
    */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies the scale automatically in combination with maxHeight such that the resultant image is no wider than maxWidth.
    */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * This value specifies a positive number that scales the size of the resultant image.
    */
  var scale: js.UndefOr[scala.Double] = js.undefined
}

object ExportOptions {
  @scala.inline
  def apply(
    bg: java.lang.String = null,
    full: js.UndefOr[scala.Boolean] = js.undefined,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null
  ): ExportOptions = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg)
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportOptions]
  }
}

