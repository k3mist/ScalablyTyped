package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /** Enables/disables cell selection.
    * @Default {false}
    */
  var allowCellSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to edit a row or cell.
    * @Default {false}
    */
  var allowEditing: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to filter the rows based on this column.
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables the blanks option in ejDropDownList mapped in TreeGrid column
    * @Default {true}
    */
  var allowFilteringBlankContent: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to freeze/unfreeze the columns
    * @Default {false}
    */
  var allowFreezing: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to sort the rows based on this column/field.
    * @Default {false}
    */
  var allowSorting: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the template ID or the template string of the AngularJS script element to enable column template for a column.
    */
  var angularTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the clip mode for TreeGrid cell as ellipsis or clipped content(both header and content)
    * @Default {ej.TreeGrid.ClipMode.Clip}
    */
  var clipMode: js.UndefOr[ClipMode | java.lang.String] = js.undefined
  /** Gets or sets an object to define a command column in TreeGrid.
    * @Default {[]}
    */
  var commands: js.UndefOr[js.Array[ColumnsCommand]] = js.undefined
  /** Gets or sets a value that indicates to display a column value as checkbox or string
    * @Default {false}
    */
  var displayAsCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  /** To bind the dropdown data for TreeGrid column mapped with ejDropDownList
    */
  var dropdownData: js.UndefOr[java.lang.String] = js.undefined
  /** To customize the ej controls defined in TreeGrid column with their native property.
    */
  var editParams: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a template that displays a custom editor for editing the column values.
    * @Default {null}
    */
  var editTemplate: js.UndefOr[js.Any] = js.undefined
  /** Specifies the edit type of the column.
    * @Default {ej.TreeGrid.EditingType.String}
    */
  var editType: js.UndefOr[EditingType | java.lang.String] = js.undefined
  /** Specifies the name of the field from the dataSource to bind with this column.
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the type of the editor control to be used to filter the rows.
    * @Default {ej.TreeGrid.EditingType.String}
    */
  var filterEditType: js.UndefOr[EditingType | java.lang.String] = js.undefined
  /** Gets or sets a value to render either excel or menu filtering in TreeGrid column filtering.
    * @Default {null}
    */
  var filterType: js.UndefOr[FilterType | java.lang.String] = js.undefined
  /** Specifies the display format of a column
    * @Default {null}
    */
  var format: js.UndefOr[js.Any] = js.undefined
  /** Specifies the header template value for the column header
    */
  var headerTemplateID: js.UndefOr[java.lang.String] = js.undefined
  /** Header text of the column.
    * @Default {null}
    */
  var headerText: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the alignment of the column header text
    * @Default {ej.TextAlign.Left}
    */
  var headerTextAlign: js.UndefOr[ejDotWebDotAllLib.ejNs.TextAlign | java.lang.String] = js.undefined
  /** Sets the tooltip template for the column header
    * @Default {null}
    */
  var headerTooltip: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies whether the column is frozen
    * @Default {false}
    */
  var isFrozen: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether the column is a template column
    * @Default {false}
    */
  var isTemplateColumn: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets the priority value of the column. It is used to show/hide TreeGrid columns in responsive mode.
    * @Default {-1}
    */
  var priority: js.UndefOr[scala.Double] = js.undefined
  /** Enables or disables the checkbox visibility in a column for checkbox selection.
    * @Default {false}
    */
  var showCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  /** We can include or exclude particular column from column visibility list in column menu.
    * @Default {true}
    */
  var showInColumnChooser: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the template string of the script element to enable column template for a column.
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the template ID of the script element to enable column template for a column.
    */
  var templateID: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the text alignment for the column
    * @Default {ej.TextAlign.Left}
    */
  var textAlign: js.UndefOr[ejDotWebDotAllLib.ejNs.TextAlign | java.lang.String] = js.undefined
  /** Sets the tooltip template for the specific column.
    * @Default {null}
    */
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
  /** specifies the conditions for saving data to the database while adding or editing the fields.
    */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** Controls the visibility of the column.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value for TreeGrid column width
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    allowCellSelection: js.UndefOr[scala.Boolean] = js.undefined,
    allowEditing: js.UndefOr[scala.Boolean] = js.undefined,
    allowFiltering: js.UndefOr[scala.Boolean] = js.undefined,
    allowFilteringBlankContent: js.UndefOr[scala.Boolean] = js.undefined,
    allowFreezing: js.UndefOr[scala.Boolean] = js.undefined,
    allowSorting: js.UndefOr[scala.Boolean] = js.undefined,
    angularTemplate: java.lang.String = null,
    clipMode: ClipMode | java.lang.String = null,
    commands: js.Array[ColumnsCommand] = null,
    displayAsCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownData: java.lang.String = null,
    editParams: js.Any = null,
    editTemplate: js.Any = null,
    editType: EditingType | java.lang.String = null,
    field: java.lang.String = null,
    filterEditType: EditingType | java.lang.String = null,
    filterType: FilterType | java.lang.String = null,
    format: js.Any = null,
    headerTemplateID: java.lang.String = null,
    headerText: java.lang.String = null,
    headerTextAlign: ejDotWebDotAllLib.ejNs.TextAlign | java.lang.String = null,
    headerTooltip: java.lang.String = null,
    isFrozen: js.UndefOr[scala.Boolean] = js.undefined,
    isTemplateColumn: js.UndefOr[scala.Boolean] = js.undefined,
    priority: scala.Int | scala.Double = null,
    showCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    showInColumnChooser: js.UndefOr[scala.Boolean] = js.undefined,
    template: java.lang.String = null,
    templateID: java.lang.String = null,
    textAlign: ejDotWebDotAllLib.ejNs.TextAlign | java.lang.String = null,
    tooltip: java.lang.String = null,
    validationRules: js.Any = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCellSelection)) __obj.updateDynamic("allowCellSelection")(allowCellSelection)
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing)
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering)
    if (!js.isUndefined(allowFilteringBlankContent)) __obj.updateDynamic("allowFilteringBlankContent")(allowFilteringBlankContent)
    if (!js.isUndefined(allowFreezing)) __obj.updateDynamic("allowFreezing")(allowFreezing)
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting)
    if (angularTemplate != null) __obj.updateDynamic("angularTemplate")(angularTemplate)
    if (clipMode != null) __obj.updateDynamic("clipMode")(clipMode.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands)
    if (!js.isUndefined(displayAsCheckbox)) __obj.updateDynamic("displayAsCheckbox")(displayAsCheckbox)
    if (dropdownData != null) __obj.updateDynamic("dropdownData")(dropdownData)
    if (editParams != null) __obj.updateDynamic("editParams")(editParams)
    if (editTemplate != null) __obj.updateDynamic("editTemplate")(editTemplate)
    if (editType != null) __obj.updateDynamic("editType")(editType.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field)
    if (filterEditType != null) __obj.updateDynamic("filterEditType")(filterEditType.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (headerTemplateID != null) __obj.updateDynamic("headerTemplateID")(headerTemplateID)
    if (headerText != null) __obj.updateDynamic("headerText")(headerText)
    if (headerTextAlign != null) __obj.updateDynamic("headerTextAlign")(headerTextAlign.asInstanceOf[js.Any])
    if (headerTooltip != null) __obj.updateDynamic("headerTooltip")(headerTooltip)
    if (!js.isUndefined(isFrozen)) __obj.updateDynamic("isFrozen")(isFrozen)
    if (!js.isUndefined(isTemplateColumn)) __obj.updateDynamic("isTemplateColumn")(isTemplateColumn)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox)
    if (!js.isUndefined(showInColumnChooser)) __obj.updateDynamic("showInColumnChooser")(showInColumnChooser)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateID != null) __obj.updateDynamic("templateID")(templateID)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

