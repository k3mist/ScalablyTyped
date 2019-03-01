package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a string reference of the form SheetName!A1:B5, or a global or local named range.
  *
  * [Api set: ExcelApi 1.2]
  */
trait RangeReference extends js.Object {
  /**
    *
    * Gets or sets the address of the range; for example 'SheetName!A1:B5'.
    *
    * [Api set: ExcelApi 1.2]
    */
  var address: java.lang.String
}

object RangeReference {
  @scala.inline
  def apply(address: java.lang.String): RangeReference = {
    val __obj = js.Dynamic.literal(address = address)
  
    __obj.asInstanceOf[RangeReference]
  }
}

