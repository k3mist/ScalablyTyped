package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the input parameter of setColumnProperties. */
trait SettableColumnProperties extends SettableCellProperties {
  var columnHidden: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("format")
  var format_SettableColumnProperties: js.UndefOr[CellPropertiesFormat with officeDashJsDashPreviewLib.Anon_ColumnWidthNumber] = js.undefined
}

object SettableColumnProperties {
  @scala.inline
  def apply(
    columnHidden: js.UndefOr[scala.Boolean] = js.undefined,
    format: CellPropertiesFormat with officeDashJsDashPreviewLib.Anon_ColumnWidthNumber = null,
    hyperlink: RangeHyperlink = null,
    style: java.lang.String = null
  ): SettableColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnHidden)) __obj.updateDynamic("columnHidden")(columnHidden)
    if (format != null) __obj.updateDynamic("format")(format)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SettableColumnProperties]
  }
}

