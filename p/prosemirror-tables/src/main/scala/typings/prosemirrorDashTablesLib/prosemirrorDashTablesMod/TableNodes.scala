package typings
package prosemirrorDashTablesLib.prosemirrorDashTablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableNodes extends js.Object {
  var table: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec
  var table_cell: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec
  var table_header: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec
  var table_row: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec
}

object TableNodes {
  @scala.inline
  def apply(
    table: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec,
    table_cell: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec,
    table_header: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec,
    table_row: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec
  ): TableNodes = {
    val __obj = js.Dynamic.literal(table = table, table_cell = table_cell, table_header = table_header, table_row = table_row)
  
    __obj.asInstanceOf[TableNodes]
  }
}

