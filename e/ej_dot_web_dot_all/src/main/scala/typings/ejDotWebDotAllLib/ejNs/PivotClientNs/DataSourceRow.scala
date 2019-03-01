package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceRow extends js.Object {
  /** Allows you to filter the report by using the advanced filtering (e.g., Microsoft Excel) option for the OLAP data source in the client-mode.
    * @Default {[]}
    */
  var advancedFilter: js.UndefOr[js.Array[DataSourceRowsAdvancedFilter]] = js.undefined
  /** Allows to set the custom theme for row headers.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Contains the list of members need to be drilled down by default in the field.
    * @Default {[]}
    */
  var drilledItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Allows you to set the display caption for an item.
    */
  var fieldCaption: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to bind the item by using its unique name as field name.
    */
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  /** Applies the filter to the field members.
    * @Default {null}
    */
  var filterItems: js.UndefOr[DataSourceRowsFilterItems] = js.undefined
  /** Allows to set the format for row headers.
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** This property is set to display the formatted values with format types in the pivot grid.
    */
  var formatString: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to indicate whether the added item is a named set or not.
    * @Default {false}
    */
  var isNamedSets: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows/hides the sub-total of the field.
    * @Default {true}
    */
  var showSubTotal: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to set the sorting order for the field members.
    * @Default {ej.PivotAnalysis.SortOrder.Ascending}
    */
  var sortOrder: js.UndefOr[ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SortOrder | java.lang.String] = js.undefined
}

object DataSourceRow {
  @scala.inline
  def apply(
    advancedFilter: js.Array[DataSourceRowsAdvancedFilter] = null,
    cssClass: java.lang.String = null,
    drilledItems: js.Array[_] = null,
    fieldCaption: java.lang.String = null,
    fieldName: java.lang.String = null,
    filterItems: DataSourceRowsFilterItems = null,
    format: java.lang.String = null,
    formatString: java.lang.String = null,
    isNamedSets: js.UndefOr[scala.Boolean] = js.undefined,
    showSubTotal: js.UndefOr[scala.Boolean] = js.undefined,
    sortOrder: ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SortOrder | java.lang.String = null
  ): DataSourceRow = {
    val __obj = js.Dynamic.literal()
    if (advancedFilter != null) __obj.updateDynamic("advancedFilter")(advancedFilter)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (drilledItems != null) __obj.updateDynamic("drilledItems")(drilledItems)
    if (fieldCaption != null) __obj.updateDynamic("fieldCaption")(fieldCaption)
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (filterItems != null) __obj.updateDynamic("filterItems")(filterItems)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatString != null) __obj.updateDynamic("formatString")(formatString)
    if (!js.isUndefined(isNamedSets)) __obj.updateDynamic("isNamedSets")(isNamedSets)
    if (!js.isUndefined(showSubTotal)) __obj.updateDynamic("showSubTotal")(showSubTotal)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceRow]
  }
}

