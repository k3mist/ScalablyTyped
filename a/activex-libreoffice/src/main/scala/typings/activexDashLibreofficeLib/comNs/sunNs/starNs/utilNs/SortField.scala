package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a single field in a sort descriptor.
  * @deprecated Deprecated
  */
trait SortField extends js.Object {
  /** index of the field in the table; 0-based. */
  var Field: scala.Double
  /** type of contents in the field. */
  var FieldType: SortFieldType
  /** `TRUE` if data are sorted in ascending order, `FALSE` if in descending order. */
  var SortAscending: scala.Boolean
}

object SortField {
  @scala.inline
  def apply(Field: scala.Double, FieldType: SortFieldType, SortAscending: scala.Boolean): SortField = {
    val __obj = js.Dynamic.literal(Field = Field, FieldType = FieldType, SortAscending = SortAscending)
  
    __obj.asInstanceOf[SortField]
  }
}

