package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckBoxStateChangingEventUIParam extends js.Object {
  /**
  	 * Gets the current state of the checkbox ("on","off").
  	 */
  var currentState: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the grid the RowSelectors are initialized for.
  	 */
  var grid: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Checks if the header check box is the one being clicked. In this case no row related args are passed.
  	 */
  var isHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the new state of the checkbox ("on","off").
  	 */
  var newState: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the igGridRowSelectors.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the row the clicked row selector resides in.
  	 */
  var row: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the index of the row the clicked row selector resides in.
  	 */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the key of the row the clicked row selector resides in.
  	 */
  var rowKey: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the row selector cell.
  	 */
  var rowSelector: js.UndefOr[java.lang.String] = js.undefined
}

object CheckBoxStateChangingEventUIParam {
  @scala.inline
  def apply(
    currentState: java.lang.String = null,
    grid: js.Any = null,
    isHeader: js.UndefOr[scala.Boolean] = js.undefined,
    newState: java.lang.String = null,
    owner: js.Any = null,
    row: java.lang.String = null,
    rowIndex: scala.Int | scala.Double = null,
    rowKey: js.Any = null,
    rowSelector: java.lang.String = null
  ): CheckBoxStateChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (currentState != null) __obj.updateDynamic("currentState")(currentState)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (!js.isUndefined(isHeader)) __obj.updateDynamic("isHeader")(isHeader)
    if (newState != null) __obj.updateDynamic("newState")(newState)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (row != null) __obj.updateDynamic("row")(row)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey)
    if (rowSelector != null) __obj.updateDynamic("rowSelector")(rowSelector)
    __obj.asInstanceOf[CheckBoxStateChangingEventUIParam]
  }
}

