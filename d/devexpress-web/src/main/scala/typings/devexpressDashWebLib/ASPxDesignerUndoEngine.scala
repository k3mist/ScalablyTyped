package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides functionality to an undo/redo engine in the Web Report Designer.
  */
trait ASPxDesignerUndoEngine extends js.Object {
  /**
    * Provides access to a value that specifies whether or not a report has been changed.
    * Value: A knockout observable boolean object, whose value is true if the report has been modified, and false otherwise.
    */
  var isDirty: js.Any
  /**
    * Provides access to a value that specifies whether or not the redo action can currently be performed.
    * Value: A knockout observable boolean object, whose value is true if the redo action can be performed, and false otherwise.
    */
  var redoEnabled: js.Any
  /**
    * Provides access to a value that specifies whether or not the undo action can currently be performed.
    * Value: A knockout observable boolean object, whose value is true if the undo action can be performed, and false otherwise.
    */
  var undoEnabled: js.Any
  /**
    * Clears information about edit operations made to a report, so they cannot not be undone.
    */
  def clearHistory(): scala.Unit
  /**
    * Reverses the results of the last undo action.
    */
  def redo(): scala.Unit
  /**
    * Undoes the last edit action in a report.
    */
  def undo(): scala.Unit
  /**
    * Undoes all changes made to a report.
    */
  def undoAll(): scala.Unit
}

object ASPxDesignerUndoEngine {
  @scala.inline
  def apply(
    clearHistory: () => scala.Unit,
    isDirty: js.Any,
    redo: () => scala.Unit,
    redoEnabled: js.Any,
    undo: () => scala.Unit,
    undoAll: () => scala.Unit,
    undoEnabled: js.Any
  ): ASPxDesignerUndoEngine = {
    val __obj = js.Dynamic.literal(clearHistory = js.Any.fromFunction0(clearHistory), isDirty = isDirty, redo = js.Any.fromFunction0(redo), redoEnabled = redoEnabled, undo = js.Any.fromFunction0(undo), undoAll = js.Any.fromFunction0(undoAll), undoEnabled = undoEnabled)
  
    __obj.asInstanceOf[ASPxDesignerUndoEngine]
  }
}

