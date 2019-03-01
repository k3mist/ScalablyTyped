package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridSummariesMethods extends js.Object {
  /**
  	 * Calculate summaries
  	 */
  def calculateSummaries(): scala.Unit
  /**
  	 * Summary calculate the whole data for the specified column key, columnMethods and dataType (used when datasource is remote and dataType is date or time)
  	 *
  	 * @param ck ColumnKey
  	 * @param columnMethods Array of column methods objects
  	 * @param data Object which represents result
  	 * represents dataType for the current column
  	 * @param dataType
  	 */
  def calculateSummaryColumn(ck: java.lang.String, columnMethods: js.Array[_], data: js.Object, dataType: js.Object): scala.Unit
  def changeGlobalLanguage(): scala.Unit
  def changeGlobalRegional(): scala.Unit
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridsummaries#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.iggridsummaries#options:language) or [locale](ui.iggridsummaries#options:locale) option setter
  	 */
  def changeLocale(): scala.Unit
  /**
  	 * Changes the the regional settings of widget element to the language specified in [options.regional](ui.iggridsummaries#options:regional)
  	 * Note that this method is for rare scenarios, use [regional](ui.iggridsummaries#options:regional) option setter
  	 */
  def changeRegional(): scala.Unit
  /**
  	 * Remove all summaries dropdown buttons.
  	 */
  def clearAllFooterIcons(): scala.Unit
  def destroy(): scala.Unit
  /**
  	 * Returns whether summaries rows are hidden
  	 */
  def isSummariesRowsHidden(): scala.Unit
  /**
  	 * Select/Unselect specified checkbox
  	 *
  	 * @param $checkbox Specifies the jQuery object for checkbox
  	 * @param isToSelect Specify whether to select or not checkbox
  	 */
  def selectCheckBox($checkbox: js.Object, isToSelect: scala.Boolean): scala.Unit
  /**
  	 * Show/Hide dialog
  	 *
  	 * @param $dialog jQuery object representation of dropdown div element
  	 */
  def showHideDialog($dialog: js.Object): scala.Unit
  /**
  	 * Return a JQUERY object which holds all summaries for column with the specified column key
  	 *
  	 * @param columnKey
  	 */
  def summariesFor(columnKey: js.Object): scala.Unit
  /**
  	 * Return a JQUERY object which holds all summaries for all columns
  	 */
  def summaryCollection(): scala.Unit
  /**
  	 * Toggles the checkstate of a checkbox if checkboxMode is not set to off, otherwise does nothing.
  	 *
  	 * @param $checkbox Specifies the jQuery object of the checkbox.
  	 */
  def toggleCheckstate($checkbox: js.Object): scala.Unit
  /**
  	 * Toggle drop down
  	 *
  	 * @param columnKey toggle drop down for the column with the specified key
  	 * @param event event object. Its data should contain current columnKey, isAnimating, buttonId
  	 */
  def toggleDropDown(columnKey: java.lang.String, event: js.Object): scala.Unit
  /**
  	 * Toggle summaries rows
  	 *
  	 * @param isToShow Specifies whether to show or not summaries
  	 * @param isInternalCall Optional parameter.Specifies whether this function is called internally by the widget.
  	 */
  def toggleSummariesRows(isToShow: scala.Boolean, isInternalCall: scala.Boolean): scala.Unit
}

object IgGridSummariesMethods {
  @scala.inline
  def apply(
    calculateSummaries: js.Function0[scala.Unit],
    calculateSummaryColumn: js.Function4[java.lang.String, js.Array[_], js.Object, js.Object, scala.Unit],
    changeGlobalLanguage: js.Function0[scala.Unit],
    changeGlobalRegional: js.Function0[scala.Unit],
    changeLocale: js.Function0[scala.Unit],
    changeRegional: js.Function0[scala.Unit],
    clearAllFooterIcons: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    isSummariesRowsHidden: js.Function0[scala.Unit],
    selectCheckBox: js.Function2[js.Object, scala.Boolean, scala.Unit],
    showHideDialog: js.Function1[js.Object, scala.Unit],
    summariesFor: js.Function1[js.Object, scala.Unit],
    summaryCollection: js.Function0[scala.Unit],
    toggleCheckstate: js.Function1[js.Object, scala.Unit],
    toggleDropDown: js.Function2[java.lang.String, js.Object, scala.Unit],
    toggleSummariesRows: js.Function2[scala.Boolean, scala.Boolean, scala.Unit]
  ): IgGridSummariesMethods = {
    val __obj = js.Dynamic.literal(calculateSummaries = calculateSummaries, calculateSummaryColumn = calculateSummaryColumn, changeGlobalLanguage = changeGlobalLanguage, changeGlobalRegional = changeGlobalRegional, changeLocale = changeLocale, changeRegional = changeRegional, clearAllFooterIcons = clearAllFooterIcons, destroy = destroy, isSummariesRowsHidden = isSummariesRowsHidden, selectCheckBox = selectCheckBox, showHideDialog = showHideDialog, summariesFor = summariesFor, summaryCollection = summaryCollection, toggleCheckstate = toggleCheckstate, toggleDropDown = toggleDropDown, toggleSummariesRows = toggleSummariesRows)
  
    __obj.asInstanceOf[IgGridSummariesMethods]
  }
}

