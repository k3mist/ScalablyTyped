package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Table object, for use in "table.set({ ... })". */
trait TableUpdateData extends js.Object {
  /**
    *
    * Gets or sets the alignment of the table against the page column. The value can be 'Left', 'Centered', or 'Right'.
    *
    * [Api set: WordApi 1.3]
    */
  var alignment: js.UndefOr[
    officeDashJsLib.WordNs.Alignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Centered | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justified
  ] = js.undefined
  /**
    *
    * Gets the font. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.3]
    */
  var font: js.UndefOr[FontUpdateData] = js.undefined
  /**
    *
    * Gets and sets the number of header rows.
    *
    * [Api set: WordApi 1.3]
    */
  var headerRowCount: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets and sets the horizontal alignment of every cell in the table. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[
    officeDashJsLib.WordNs.Alignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Centered | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justified
  ] = js.undefined
  /**
    *
    * Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the style name for the table. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.3]
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets and sets whether the table has banded columns.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBandedColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets and sets whether the table has banded rows.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBandedRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the built-in style name for the table. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 149 */ js.Any
  ] = js.undefined
  /**
    *
    * Gets and sets whether the table has a first column with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleFirstColumn: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets and sets whether the table has a last column with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleLastColumn: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets and sets whether the table has a total (last) row with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleTotalRow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets and sets the text values in the table, as a 2D Javascript array.
    *
    * [Api set: WordApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  /**
    *
    * Gets and sets the vertical alignment of every cell in the table. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[
    officeDashJsLib.WordNs.VerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom
  ] = js.undefined
  /**
    *
    * Gets and sets the width of the table in points.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TableUpdateData {
  @scala.inline
  def apply(
    alignment: officeDashJsLib.WordNs.Alignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Centered | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justified = null,
    font: FontUpdateData = null,
    headerRowCount: scala.Int | scala.Double = null,
    horizontalAlignment: officeDashJsLib.WordNs.Alignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Centered | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justified = null,
    shadingColor: java.lang.String = null,
    style: java.lang.String = null,
    styleBandedColumns: js.UndefOr[scala.Boolean] = js.undefined,
    styleBandedRows: js.UndefOr[scala.Boolean] = js.undefined,
    styleBuiltIn: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 149 */ js.Any = null,
    styleFirstColumn: js.UndefOr[scala.Boolean] = js.undefined,
    styleLastColumn: js.UndefOr[scala.Boolean] = js.undefined,
    styleTotalRow: js.UndefOr[scala.Boolean] = js.undefined,
    values: js.Array[js.Array[java.lang.String]] = null,
    verticalAlignment: officeDashJsLib.WordNs.VerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom = null,
    width: scala.Int | scala.Double = null
  ): TableUpdateData = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (headerRowCount != null) __obj.updateDynamic("headerRowCount")(headerRowCount.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (shadingColor != null) __obj.updateDynamic("shadingColor")(shadingColor)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(styleBandedColumns)) __obj.updateDynamic("styleBandedColumns")(styleBandedColumns)
    if (!js.isUndefined(styleBandedRows)) __obj.updateDynamic("styleBandedRows")(styleBandedRows)
    if (styleBuiltIn != null) __obj.updateDynamic("styleBuiltIn")(styleBuiltIn)
    if (!js.isUndefined(styleFirstColumn)) __obj.updateDynamic("styleFirstColumn")(styleFirstColumn)
    if (!js.isUndefined(styleLastColumn)) __obj.updateDynamic("styleLastColumn")(styleLastColumn)
    if (!js.isUndefined(styleTotalRow)) __obj.updateDynamic("styleTotalRow")(styleTotalRow)
    if (values != null) __obj.updateDynamic("values")(values)
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableUpdateData]
  }
}

