package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Transaction holds a list of ChangedEvents collected during a transaction,
  * as the value of the read-only .changes property.
  */
trait Transaction extends js.Object {
  /**This read-only property returns the list of ChangedEvents.*/
  var changes: List[ChangedEvent]
  /**Gets or sets whether we can add more ChangedEvents to this list of changes.*/
  var isComplete: scala.Boolean
  /**Gets or sets the transaction name for this collection of changes.*/
  var name: java.lang.String
  /**
    * This predicate returns true if you can call .redo, namely when .isComplete is true.
    */
  def canRedo(): scala.Boolean
  /**
    * This predicate returns true if you can call .undo, namely when .isComplete is true.
    */
  def canUndo(): scala.Boolean
  /**
    * Clear all of the saved changes.
    */
  def clear(): scala.Unit
  /**
    * Re-perform these changes after an .undo.
    */
  def redo(): scala.Unit
  /**
    * Undo all of the changes, in reverse order.
    */
  def undo(): scala.Unit
}

object Transaction {
  @scala.inline
  def apply(
    canRedo: js.Function0[scala.Boolean],
    canUndo: js.Function0[scala.Boolean],
    changes: List[ChangedEvent],
    clear: js.Function0[scala.Unit],
    isComplete: scala.Boolean,
    name: java.lang.String,
    redo: js.Function0[scala.Unit],
    undo: js.Function0[scala.Unit]
  ): Transaction = {
    val __obj = js.Dynamic.literal(canRedo = canRedo, canUndo = canUndo, changes = changes, clear = clear, isComplete = isComplete, name = name, redo = redo, undo = undo)
  
    __obj.asInstanceOf[Transaction]
  }
}

