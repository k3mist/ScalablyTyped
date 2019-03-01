package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventProvider extends js.Object {
  var colToMove: IColumn
  var groupToMove: js.Any
  def assignEvents(): scala.Unit
  def assignGridEventHandlers(): scala.Unit
  def dragOver(event: js.Any): scala.Unit
  def dragStart(event: js.Any): scala.Unit
  def onGroupDrop(event: js.Any): scala.Unit
  def onGroupMouseDown(event: js.Any): scala.Unit
  def onHeaderDrop(event: js.Any): scala.Unit
  def onHeaderMouseDown(event: js.Any): scala.Unit
  def setDraggables(): scala.Unit
}

object IEventProvider {
  @scala.inline
  def apply(
    assignEvents: js.Function0[scala.Unit],
    assignGridEventHandlers: js.Function0[scala.Unit],
    colToMove: IColumn,
    dragOver: js.Function1[js.Any, scala.Unit],
    dragStart: js.Function1[js.Any, scala.Unit],
    groupToMove: js.Any,
    onGroupDrop: js.Function1[js.Any, scala.Unit],
    onGroupMouseDown: js.Function1[js.Any, scala.Unit],
    onHeaderDrop: js.Function1[js.Any, scala.Unit],
    onHeaderMouseDown: js.Function1[js.Any, scala.Unit],
    setDraggables: js.Function0[scala.Unit]
  ): IEventProvider = {
    val __obj = js.Dynamic.literal(assignEvents = assignEvents, assignGridEventHandlers = assignGridEventHandlers, colToMove = colToMove, dragOver = dragOver, dragStart = dragStart, groupToMove = groupToMove, onGroupDrop = onGroupDrop, onGroupMouseDown = onGroupMouseDown, onHeaderDrop = onHeaderDrop, onHeaderMouseDown = onHeaderMouseDown, setDraggables = setDraggables)
  
    __obj.asInstanceOf[IEventProvider]
  }
}

