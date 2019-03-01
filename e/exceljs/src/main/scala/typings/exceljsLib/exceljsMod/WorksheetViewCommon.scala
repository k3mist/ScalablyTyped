package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetViewCommon extends js.Object {
  /**
  	 * The currently selected cell
  	 */
  var activeCell: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets the worksheet view's orientation to right-to-left, `false` by default
  	 */
  var rightToLeft: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Shows or hides the gridlines (shown for cells where borders have not been defined),
  	 * `true` by default
  	 */
  var showGridLines: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Shows or hides the row and column headers (e.g. A1, B1 at the top and 1,2,3 on the left,
  	 * `true` by default
  	 */
  var showRowColHeaders: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Shows or hides the ruler in Page Layout, `true` by default
  	 */
  var showRuler: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * 	Percentage zoom to use for the view, `100` by default
  	 */
  var zoomScale: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * 	Normal zoom for the view, `100` by default
  	 */
  var zoomScaleNormal: js.UndefOr[scala.Double] = js.undefined
}

object WorksheetViewCommon {
  @scala.inline
  def apply(
    activeCell: java.lang.String = null,
    rightToLeft: js.UndefOr[scala.Boolean] = js.undefined,
    showGridLines: js.UndefOr[scala.Boolean] = js.undefined,
    showRowColHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    showRuler: js.UndefOr[scala.Boolean] = js.undefined,
    zoomScale: scala.Int | scala.Double = null,
    zoomScaleNormal: scala.Int | scala.Double = null
  ): WorksheetViewCommon = {
    val __obj = js.Dynamic.literal()
    if (activeCell != null) __obj.updateDynamic("activeCell")(activeCell)
    if (!js.isUndefined(rightToLeft)) __obj.updateDynamic("rightToLeft")(rightToLeft)
    if (!js.isUndefined(showGridLines)) __obj.updateDynamic("showGridLines")(showGridLines)
    if (!js.isUndefined(showRowColHeaders)) __obj.updateDynamic("showRowColHeaders")(showRowColHeaders)
    if (!js.isUndefined(showRuler)) __obj.updateDynamic("showRuler")(showRuler)
    if (zoomScale != null) __obj.updateDynamic("zoomScale")(zoomScale.asInstanceOf[js.Any])
    if (zoomScaleNormal != null) __obj.updateDynamic("zoomScaleNormal")(zoomScaleNormal.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewCommon]
  }
}

