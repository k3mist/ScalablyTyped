package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapValue extends js.Object {
  /**
    * The map's fields.
    *
    * The map keys represent field names. Field names matching the regular
    * expression `__.&#42;__` are reserved. Reserved field names are forbidden except
    * in certain documented contexts. The map keys, represented as UTF-8, must
    * not exceed 1,500 bytes and cannot be empty.
    */
  var fields: js.UndefOr[stdLib.Record[java.lang.String, Value]] = js.undefined
}

object MapValue {
  @scala.inline
  def apply(fields: stdLib.Record[java.lang.String, Value] = null): MapValue = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[MapValue]
  }
}

