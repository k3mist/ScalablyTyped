package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnIndexColumnKey extends js.Object {
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  var columnKey: js.UndefOr[js.Any] = js.undefined
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  var offsetY: js.UndefOr[scala.Double] = js.undefined
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  var rowKey: js.UndefOr[js.Any] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ColumnIndexColumnKey {
  @scala.inline
  def apply(
    columnIndex: scala.Int | scala.Double = null,
    columnKey: js.Any = null,
    offsetX: scala.Int | scala.Double = null,
    offsetY: scala.Int | scala.Double = null,
    rowIndex: scala.Int | scala.Double = null,
    rowKey: js.Any = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Anon_ColumnIndexColumnKey = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnIndexColumnKey]
  }
}

