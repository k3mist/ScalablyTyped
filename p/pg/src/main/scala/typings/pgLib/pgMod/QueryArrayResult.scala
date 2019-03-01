package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryArrayResult extends QueryResultBase {
  var rows: js.Array[js.Array[_]]
}

object QueryArrayResult {
  @scala.inline
  def apply(
    command: java.lang.String,
    fields: js.Array[FieldDef],
    oid: scala.Double,
    rowCount: scala.Double,
    rows: js.Array[js.Array[_]]
  ): QueryArrayResult = {
    val __obj = js.Dynamic.literal(command = command, fields = fields, oid = oid, rowCount = rowCount, rows = rows)
  
    __obj.asInstanceOf[QueryArrayResult]
  }
}

