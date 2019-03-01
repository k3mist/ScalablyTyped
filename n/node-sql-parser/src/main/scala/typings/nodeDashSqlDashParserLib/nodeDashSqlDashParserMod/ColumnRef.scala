package typings
package nodeDashSqlDashParserLib.nodeDashSqlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnRef extends js.Object {
  var column: java.lang.String
  var table: java.lang.String | scala.Null
  var `type`: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.column_ref
}

object ColumnRef {
  @scala.inline
  def apply(
    column: java.lang.String,
    `type`: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.column_ref,
    table: java.lang.String = null
  ): ColumnRef = {
    val __obj = js.Dynamic.literal(column = column, `type` = `type`)
    if (table != null) __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[ColumnRef]
  }
}

