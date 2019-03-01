package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellObject extends js.Object {
  /** Range of enclosing array if formula is array formula (if applicable) */
  var F: js.UndefOr[java.lang.String] = js.undefined
  /** Comments associated with the cell */
  var c: js.UndefOr[js.Array[Comment]] = js.undefined
  /** Cell formula (if applicable) */
  var f: js.UndefOr[java.lang.String] = js.undefined
  /** HTML rendering of the rich text (if applicable) */
  var h: js.UndefOr[java.lang.String] = js.undefined
  /** Cell hyperlink object (.Target holds link, .tooltip is tooltip) */
  var l: js.UndefOr[Hyperlink] = js.undefined
  /** Rich text encoding (if applicable) */
  var r: js.UndefOr[js.Any] = js.undefined
  /** The style/theme of the cell (if applicable) */
  var s: js.UndefOr[js.Any] = js.undefined
  /**
    * The Excel Data Type of the cell.
    * b Boolean, n Number, e Error, s String, d Date, z Empty
    */
  var t: ExcelDataType
  /** The raw value of the cell.  Can be omitted if a formula is specified */
  var v: js.UndefOr[java.lang.String | scala.Double | scala.Boolean | stdLib.Date] = js.undefined
  /** Formatted text (if applicable) */
  var w: js.UndefOr[java.lang.String] = js.undefined
  /** Number format string associated with the cell (if requested) */
  var z: js.UndefOr[NumberFormat] = js.undefined
}

object CellObject {
  @scala.inline
  def apply(
    t: ExcelDataType,
    F: java.lang.String = null,
    c: js.Array[Comment] = null,
    f: java.lang.String = null,
    h: java.lang.String = null,
    l: Hyperlink = null,
    r: js.Any = null,
    s: js.Any = null,
    v: java.lang.String | scala.Double | scala.Boolean | stdLib.Date = null,
    w: java.lang.String = null,
    z: NumberFormat = null
  ): CellObject = {
    val __obj = js.Dynamic.literal(t = t)
    if (F != null) __obj.updateDynamic("F")(F)
    if (c != null) __obj.updateDynamic("c")(c)
    if (f != null) __obj.updateDynamic("f")(f)
    if (h != null) __obj.updateDynamic("h")(h)
    if (l != null) __obj.updateDynamic("l")(l)
    if (r != null) __obj.updateDynamic("r")(r)
    if (s != null) __obj.updateDynamic("s")(s)
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w)
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellObject]
  }
}

