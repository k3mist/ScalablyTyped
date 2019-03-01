package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellEdit[TRow /* <: js.Object */] extends js.Object {
  /**
  	 * Accept a custom callback function, after cell saving, this function will be called.
  	 * This callback function takes three arguments: row, cellName and cellValue
  	 *   `row`: the row data that was saved.
  	 *   `cellName`: the column dataField cell name that has been modified.
  	 *   `cellValue`: the new cell value.
  	 *   `props`: an object containing the current cell's rowIndex and colIndex values.
  	 */
  var afterSaveCell: js.UndefOr[
    js.Function4[
      /* row */ TRow, 
      /* cellName */ java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, 
      /* props */ reactDashBootstrapDashTableLib.Anon_ColIndex, 
      scala.Unit
    ]
  ] = js.undefined
  /**
  	 * Accept a custom callback function, before cell saving, this function will be called.
  	 * This callback function takes four arguments: row, cellName, cellValue and done.
  	 *   `row`: the row data to be saved.
  	 *   `cellName`: the column dataField cell name that has been modified.
  	 *   `cellValue`: the new cell value.
  	 *   `done`: a callback function to use if this is an async operation, to indicate if the save data is valid.
  	 *   `props`: an object containing the current cell's rowIndex and colIndex values.
  	 * If your validation is async, for example: you want to pop a confirm dialog for user to confim in this case,
  	 * react-bootstrap-table pass a callback function to you. You are supposed to call this callback function with a
  	 * bool value to perfom if it is valid or not in addition, you should return 1 from the main function to tell
  	 * react-bootstrap-table that this is a async operation.
  	 */
  var beforeSaveCell: js.UndefOr[
    js.Function5[
      /* row */ TRow, 
      /* cellName */ java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, 
      /* done */ js.Function1[/* isValid */ scala.Boolean, scala.Unit], 
      /* props */ reactDashBootstrapDashTableLib.Anon_ColIndex, 
      scala.Boolean | reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibNumbers.`1`
    ]
  ] = js.undefined
  /**
  	 * Enabling blurToEscape will result in a cell edit being cancelled when the user clicks outside the table during
  	 * editing.
  	 * Default is false.
  	 */
  var blurToEscape: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Enabling blurToSave will trigger a saving event on the cell when the input field becomes deselected. Default is false.
  	 * In the default condition, you need to press ENTER to save the cell.
  	 */
  var blurToSave: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Spectify which condition will trigger cell editing.(click or dbclick). Required.
  	 */
  var mode: CellEditClickMode
  /**
  	 * nonEditableRows tell react-bootstrap-table which rows should not be edited on all of the columns. Briefly, its a row level limitation
  	 * Please assign a callback function, and this function is supposed to be return an array of row keys.
  	 */
  var nonEditableRows: js.UndefOr[js.Function0[js.Array[scala.Double | java.lang.String]]] = js.undefined
}

object CellEdit {
  @scala.inline
  def apply[TRow /* <: js.Object */](
    mode: CellEditClickMode,
    afterSaveCell: js.Function4[
      /* row */ TRow, 
      /* cellName */ java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, 
      /* props */ reactDashBootstrapDashTableLib.Anon_ColIndex, 
      scala.Unit
    ] = null,
    beforeSaveCell: js.Function5[
      /* row */ TRow, 
      /* cellName */ java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: TRow[keyof TRow] */ /* cellValue */ js.Any, 
      /* done */ js.Function1[/* isValid */ scala.Boolean, scala.Unit], 
      /* props */ reactDashBootstrapDashTableLib.Anon_ColIndex, 
      scala.Boolean | reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibNumbers.`1`
    ] = null,
    blurToEscape: js.UndefOr[scala.Boolean] = js.undefined,
    blurToSave: js.UndefOr[scala.Boolean] = js.undefined,
    nonEditableRows: js.Function0[js.Array[scala.Double | java.lang.String]] = null
  ): CellEdit[TRow] = {
    val __obj = js.Dynamic.literal(mode = mode)
    if (afterSaveCell != null) __obj.updateDynamic("afterSaveCell")(afterSaveCell)
    if (beforeSaveCell != null) __obj.updateDynamic("beforeSaveCell")(beforeSaveCell)
    if (!js.isUndefined(blurToEscape)) __obj.updateDynamic("blurToEscape")(blurToEscape)
    if (!js.isUndefined(blurToSave)) __obj.updateDynamic("blurToSave")(blurToSave)
    if (nonEditableRows != null) __obj.updateDynamic("nonEditableRows")(nonEditableRows)
    __obj.asInstanceOf[CellEdit[TRow]]
  }
}

