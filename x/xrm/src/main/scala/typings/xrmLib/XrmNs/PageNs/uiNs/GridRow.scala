package typings
package xrmLib.XrmNs.PageNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a grid row.  Use the GridRow.getData method to access the GridRowData. A collection of GridRow is
  * returned by Grid.getRows and Grid.getSelectedRows methods.
  * In V9 - this is essentailly a form context.
  * @deprecated Use {@link Xrm.Controls.Grid.GridRow} instead.
  */
trait GridRow
  extends xrmLib.XrmNs.ControlsNs.GridNs.GridRow

object GridRow {
  @scala.inline
  def apply(data: xrmLib.XrmNs.Data, getData: js.Function0[xrmLib.XrmNs.ControlsNs.GridNs.GridRowData]): GridRow = {
    val __obj = js.Dynamic.literal(data = data, getData = getData)
  
    __obj.asInstanceOf[GridRow]
  }
}

