package typings
package officeDashJsDashPreviewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnWidthNumber extends js.Object {
  var columnWidth: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ColumnWidthNumber {
  @scala.inline
  def apply(columnWidth: scala.Int | scala.Double = null): Anon_ColumnWidthNumber = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnWidthNumber]
  }
}

