package typings
package gapiDotClientDotConsumersurveysLib.gapiNs.clientNs.consumersurveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldMask extends js.Object {
  var fields: js.UndefOr[js.Array[FieldMask]] = js.undefined
  var id: js.UndefOr[scala.Double] = js.undefined
}

object FieldMask {
  @scala.inline
  def apply(fields: js.Array[FieldMask] = null, id: scala.Int | scala.Double = null): FieldMask = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldMask]
  }
}

