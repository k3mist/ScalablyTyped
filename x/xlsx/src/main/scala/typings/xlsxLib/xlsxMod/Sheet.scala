package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sheet
  extends /**
  * Indexing with a cell address string maps to a cell object
  * Special keys start with '!'
  */
/* cell */ org.scalablytyped.runtime.StringDictionary[CellObject | SheetKeys | js.Any] {
  /** Page Margins */
  var `!margins`: js.UndefOr[MarginInfo] = js.undefined
  /** Sheet Range */
  var `!ref`: js.UndefOr[java.lang.String] = js.undefined
  /** Sheet type */
  var `!type`: js.UndefOr[SheetType] = js.undefined
}

object Sheet {
  @scala.inline
  def apply(
    `!margins`: MarginInfo = null,
    `!ref`: java.lang.String = null,
    `!type`: SheetType = null,
    StringDictionary: /**
    * Indexing with a cell address string maps to a cell object
    * Special keys start with '!'
    */
  /* cell */ org.scalablytyped.runtime.StringDictionary[CellObject | SheetKeys | js.Any] = null
  ): Sheet = {
    val __obj = js.Dynamic.literal()
    if (`!margins` != null) __obj.updateDynamic("!margins")(`!margins`)
    if (`!ref` != null) __obj.updateDynamic("!ref")(`!ref`)
    if (`!type` != null) __obj.updateDynamic("!type")(`!type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Sheet]
  }
}

