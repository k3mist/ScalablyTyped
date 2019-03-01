package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridCellMergingMethods extends js.Object {
  def changeGlobalLanguage(): scala.Unit
  def changeGlobalRegional(): scala.Unit
  /**
  	 * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
  	 * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
  	 *
  	 * @param $container Optional parameter - if not set it would use the element of the widget as $container
  	 */
  def changeLocale($container: js.Object): scala.Unit
  /**
  	 * Removes all igGridCellMerging UI changes and destroys the widget
  	 */
  def destroy(): scala.Unit
  /**
  	 * Returns the merge state of a column.
  	 *
  	 * @param column The column index or column key to get the state for.
  	 */
  def isMerged(column: js.Object): scala.Boolean
  /**
  	 * Merges the specified column unless it is already merged.
  	 *
  	 * @param column The column index or column key to merge.
  	 * @param raiseEvents Specifies if the operation should raise merging-related events.
  	 */
  def mergeColumn(column: js.Object, raiseEvents: scala.Boolean): java.lang.String
  def mergeRow(id: js.Object, fireEvents: js.Object): scala.Unit
  /**
  	 * Restores the column to its unmerged state. Does nothing if the column is not merged.
  	 *
  	 * @param column The column index or column key to unmerge.
  	 */
  def unmergeColumn(column: js.Object): java.lang.String
  def unmergeRow(id: js.Object, index: js.Object): scala.Unit
}

object IgGridCellMergingMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: js.Function0[scala.Unit],
    changeGlobalRegional: js.Function0[scala.Unit],
    changeLocale: js.Function1[js.Object, scala.Unit],
    destroy: js.Function0[scala.Unit],
    isMerged: js.Function1[js.Object, scala.Boolean],
    mergeColumn: js.Function2[js.Object, scala.Boolean, java.lang.String],
    mergeRow: js.Function2[js.Object, js.Object, scala.Unit],
    unmergeColumn: js.Function1[js.Object, java.lang.String],
    unmergeRow: js.Function2[js.Object, js.Object, scala.Unit]
  ): IgGridCellMergingMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = changeGlobalLanguage, changeGlobalRegional = changeGlobalRegional, changeLocale = changeLocale, destroy = destroy, isMerged = isMerged, mergeColumn = mergeColumn, mergeRow = mergeRow, unmergeColumn = unmergeColumn, unmergeRow = unmergeRow)
  
    __obj.asInstanceOf[IgGridCellMergingMethods]
  }
}

