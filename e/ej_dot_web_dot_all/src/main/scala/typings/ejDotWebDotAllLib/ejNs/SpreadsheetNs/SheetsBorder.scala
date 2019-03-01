package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsBorder extends js.Object {
  /** Specifies border color for range of cells in Spreadsheet.
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** To apply border for the specified range of cell.
    */
  var range: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies border type in the Spreadsheet.
    */
  var `type`: js.UndefOr[BorderType | java.lang.String] = js.undefined
}

object SheetsBorder {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    range: java.lang.String = null,
    `type`: BorderType | java.lang.String = null
  ): SheetsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (range != null) __obj.updateDynamic("range")(range)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsBorder]
  }
}

