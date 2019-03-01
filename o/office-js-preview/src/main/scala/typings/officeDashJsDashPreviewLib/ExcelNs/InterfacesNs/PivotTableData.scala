package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pivotTable.toJSON()". */
trait PivotTableData extends js.Object {
  /**
    *
    * The Column Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var columnHierarchies: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.undefined
  /**
    *
    * The Data Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataHierarchies: js.UndefOr[js.Array[DataPivotHierarchyData]] = js.undefined
  /**
    *
    * True if the PivotTable should use custom lists when sorting.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var enableDataValueEditing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The Filter Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var filterHierarchies: js.UndefOr[js.Array[FilterPivotHierarchyData]] = js.undefined
  /**
    *
    * The Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var hierarchies: js.UndefOr[js.Array[PivotHierarchyData]] = js.undefined
  /**
    *
    * Id of the PivotTable. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Name of the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The Row Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var rowHierarchies: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.undefined
  /**
    *
    * True if the PivotTable should use custom lists when sorting.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var useCustomSortLists: js.UndefOr[scala.Boolean] = js.undefined
}

object PivotTableData {
  @scala.inline
  def apply(
    columnHierarchies: js.Array[RowColumnPivotHierarchyData] = null,
    dataHierarchies: js.Array[DataPivotHierarchyData] = null,
    enableDataValueEditing: js.UndefOr[scala.Boolean] = js.undefined,
    filterHierarchies: js.Array[FilterPivotHierarchyData] = null,
    hierarchies: js.Array[PivotHierarchyData] = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    rowHierarchies: js.Array[RowColumnPivotHierarchyData] = null,
    useCustomSortLists: js.UndefOr[scala.Boolean] = js.undefined
  ): PivotTableData = {
    val __obj = js.Dynamic.literal()
    if (columnHierarchies != null) __obj.updateDynamic("columnHierarchies")(columnHierarchies)
    if (dataHierarchies != null) __obj.updateDynamic("dataHierarchies")(dataHierarchies)
    if (!js.isUndefined(enableDataValueEditing)) __obj.updateDynamic("enableDataValueEditing")(enableDataValueEditing)
    if (filterHierarchies != null) __obj.updateDynamic("filterHierarchies")(filterHierarchies)
    if (hierarchies != null) __obj.updateDynamic("hierarchies")(hierarchies)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rowHierarchies != null) __obj.updateDynamic("rowHierarchies")(rowHierarchies)
    if (!js.isUndefined(useCustomSortLists)) __obj.updateDynamic("useCustomSortLists")(useCustomSortLists)
    __obj.asInstanceOf[PivotTableData]
  }
}

