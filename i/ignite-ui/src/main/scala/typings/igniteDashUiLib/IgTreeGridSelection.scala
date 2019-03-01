package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridSelection
  extends /**
	 * Option for igTreeGridSelection
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Enables / disables activation of rows and cells. Activation implies ability to perform navigating through cells and rows via the keyboard, and selecting rows and cells using CTRL / SHIFT - in the way cells/rows are selected in Ms Excel
  	 *
  	 */
  var activation: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Event fired after a cell becomes active (focus style applied).
  	 */
  var activeCellChanged: js.UndefOr[ActiveCellChangedEvent] = js.undefined
  /**
  	 * Event fired before a cell becomes active (focus style applied) (cancellable).
  	 * Return false in order to cancel active cell changing.
  	 */
  var activeCellChanging: js.UndefOr[ActiveCellChangingEvent] = js.undefined
  /**
  	 * Event fired after a row becomes active (focus style applied).
  	 */
  var activeRowChanged: js.UndefOr[ActiveRowChangedEvent] = js.undefined
  /**
  	 * Event fired before a row becomes active (focus style applied) (cancellable).
  	 * Return false in order to cancel active row changing.
  	 */
  var activeRowChanging: js.UndefOr[ActiveRowChangingEvent] = js.undefined
  /**
  	 * Enables / disables the ability to ctrl drag multiple selection windows when selection mode is 'cell'
  	 *
  	 */
  var allowMultipleRangeSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Event fired after cell(s) are selected.
  	 */
  var cellSelectionChanged: js.UndefOr[CellSelectionChangedEvent] = js.undefined
  /**
  	 * Event fired before cell(s) are about to be selected (cancellable).
  	 * Return false in order to cancel cell selection changing.
  	 */
  var cellSelectionChanging: js.UndefOr[CellSelectionChangingEvent] = js.undefined
  /**
  	 * Defines type of the selection.
  	 *
  	 *
  	 * Valid values:
  	 * "row" Defines row selection mode.
  	 * "cell" Defines cell selection mode.
  	 */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Enables / disables selection via dragging with the mouse - only applicable for cell selection
  	 *
  	 */
  var mouseDragSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If true multiple selection of cells is done as if CTRL is being held. the option is disregarded if mode is set to row. this option is useful for enabling multiple discountinued selection on touch environments.
  	 *
  	 */
  var multipleCellSelectOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Enables / Disables multiple selection of cells and rows - depending on the mode
  	 *
  	 */
  var multipleSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Enables / disables selection persistance between states.
  	 *
  	 */
  var persist: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Event fired after row(s) are selected.
  	 */
  var rowSelectionChanged: js.UndefOr[RowSelectionChangedEvent] = js.undefined
  /**
  	 * Event fired before row(s) are about to be selected (cancellable).
  	 * Return false in order to cancel selection changing.
  	 */
  var rowSelectionChanging: js.UndefOr[RowSelectionChangingEvent] = js.undefined
  /**
  	 * If true will basically skip going into child grids with down / up / right / left arrow keys, when in the context of hierarchical grid
  	 *
  	 */
  var skipChildren: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Deprecated="true" Enables / disables selection via continuous touch event - only applicable for cell selection and touch-supported environments
  	 *
  	 */
  var touchDragSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If wrapAround is enabled and selection is on the first or last row or cell, then when the end user tries to go beyond that, the first/last row or cell will be selected
  	 *
  	 */
  var wrapAround: js.UndefOr[scala.Boolean] = js.undefined
}

object IgTreeGridSelection {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTreeGridSelection
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    activation: js.UndefOr[scala.Boolean] = js.undefined,
    activeCellChanged: ActiveCellChangedEvent = null,
    activeCellChanging: ActiveCellChangingEvent = null,
    activeRowChanged: ActiveRowChangedEvent = null,
    activeRowChanging: ActiveRowChangingEvent = null,
    allowMultipleRangeSelection: js.UndefOr[scala.Boolean] = js.undefined,
    cellSelectionChanged: CellSelectionChangedEvent = null,
    cellSelectionChanging: CellSelectionChangingEvent = null,
    mode: java.lang.String = null,
    mouseDragSelect: js.UndefOr[scala.Boolean] = js.undefined,
    multipleCellSelectOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    multipleSelection: js.UndefOr[scala.Boolean] = js.undefined,
    persist: js.UndefOr[scala.Boolean] = js.undefined,
    rowSelectionChanged: RowSelectionChangedEvent = null,
    rowSelectionChanging: RowSelectionChangingEvent = null,
    skipChildren: js.UndefOr[scala.Boolean] = js.undefined,
    touchDragSelect: js.UndefOr[scala.Boolean] = js.undefined,
    wrapAround: js.UndefOr[scala.Boolean] = js.undefined
  ): IgTreeGridSelection = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(activation)) __obj.updateDynamic("activation")(activation)
    if (activeCellChanged != null) __obj.updateDynamic("activeCellChanged")(activeCellChanged)
    if (activeCellChanging != null) __obj.updateDynamic("activeCellChanging")(activeCellChanging)
    if (activeRowChanged != null) __obj.updateDynamic("activeRowChanged")(activeRowChanged)
    if (activeRowChanging != null) __obj.updateDynamic("activeRowChanging")(activeRowChanging)
    if (!js.isUndefined(allowMultipleRangeSelection)) __obj.updateDynamic("allowMultipleRangeSelection")(allowMultipleRangeSelection)
    if (cellSelectionChanged != null) __obj.updateDynamic("cellSelectionChanged")(cellSelectionChanged)
    if (cellSelectionChanging != null) __obj.updateDynamic("cellSelectionChanging")(cellSelectionChanging)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(mouseDragSelect)) __obj.updateDynamic("mouseDragSelect")(mouseDragSelect)
    if (!js.isUndefined(multipleCellSelectOnClick)) __obj.updateDynamic("multipleCellSelectOnClick")(multipleCellSelectOnClick)
    if (!js.isUndefined(multipleSelection)) __obj.updateDynamic("multipleSelection")(multipleSelection)
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist)
    if (rowSelectionChanged != null) __obj.updateDynamic("rowSelectionChanged")(rowSelectionChanged)
    if (rowSelectionChanging != null) __obj.updateDynamic("rowSelectionChanging")(rowSelectionChanging)
    if (!js.isUndefined(skipChildren)) __obj.updateDynamic("skipChildren")(skipChildren)
    if (!js.isUndefined(touchDragSelect)) __obj.updateDynamic("touchDragSelect")(touchDragSelect)
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround)
    __obj.asInstanceOf[IgTreeGridSelection]
  }
}

