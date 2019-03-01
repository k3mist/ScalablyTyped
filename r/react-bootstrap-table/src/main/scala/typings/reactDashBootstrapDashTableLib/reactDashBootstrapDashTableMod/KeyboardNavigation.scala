package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardNavigation extends js.Object {
  /**
  	 * Set to false to disable click to navigate, usually user wants to click to select row instead of navigation.
  	 */
  var clickToNav: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Return a style object which will be applied on the navigating cell.
  	 */
  var customStyle: js.UndefOr[
    js.Function2[/* cell */ js.Any, /* row */ js.Any, reactLib.reactMod.ReactNs.CSSProperties]
  ] = js.undefined
  /**
  	 * Return a style object which will be applied on the both of navigating and editing cell.
  	 */
  var customStyleOnEditCell: js.UndefOr[
    js.Function2[/* cell */ js.Any, /* row */ js.Any, reactLib.reactMod.ReactNs.CSSProperties]
  ] = js.undefined
  /**
  	 * When set to true, pressing ENTER will begin to edit the cell if cellEdit is also enabled.
  	 */
  var enterToEdit: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When set to true, pressing ENTER will expand or collapse the current row.
  	 */
  var enterToExpand: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When set to true, pressing ENTER will select or unselect the current row.
  	 */
  var enterToSelect: js.UndefOr[scala.Boolean] = js.undefined
}

object KeyboardNavigation {
  @scala.inline
  def apply(
    clickToNav: js.UndefOr[scala.Boolean] = js.undefined,
    customStyle: js.Function2[/* cell */ js.Any, /* row */ js.Any, reactLib.reactMod.ReactNs.CSSProperties] = null,
    customStyleOnEditCell: js.Function2[/* cell */ js.Any, /* row */ js.Any, reactLib.reactMod.ReactNs.CSSProperties] = null,
    enterToEdit: js.UndefOr[scala.Boolean] = js.undefined,
    enterToExpand: js.UndefOr[scala.Boolean] = js.undefined,
    enterToSelect: js.UndefOr[scala.Boolean] = js.undefined
  ): KeyboardNavigation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickToNav)) __obj.updateDynamic("clickToNav")(clickToNav)
    if (customStyle != null) __obj.updateDynamic("customStyle")(customStyle)
    if (customStyleOnEditCell != null) __obj.updateDynamic("customStyleOnEditCell")(customStyleOnEditCell)
    if (!js.isUndefined(enterToEdit)) __obj.updateDynamic("enterToEdit")(enterToEdit)
    if (!js.isUndefined(enterToExpand)) __obj.updateDynamic("enterToExpand")(enterToExpand)
    if (!js.isUndefined(enterToSelect)) __obj.updateDynamic("enterToSelect")(enterToSelect)
    __obj.asInstanceOf[KeyboardNavigation]
  }
}

