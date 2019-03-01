package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnaryFilter extends js.Object {
  /** The field to which to apply the operator. */
  var field: js.UndefOr[FieldReference] = js.undefined
  /** The unary operator to apply. */
  var op: js.UndefOr[java.lang.String] = js.undefined
}

object UnaryFilter {
  @scala.inline
  def apply(field: FieldReference = null, op: java.lang.String = null): UnaryFilter = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (op != null) __obj.updateDynamic("op")(op)
    __obj.asInstanceOf[UnaryFilter]
  }
}

