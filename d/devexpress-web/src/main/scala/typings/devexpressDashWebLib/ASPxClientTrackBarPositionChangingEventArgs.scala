package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the PositionChanging event.
  */
trait ASPxClientTrackBarPositionChangingEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    * Value: true if the action that raised the event should be canceled; otherwise, false.
    */
  var cancel: scala.Boolean
  /**
    * Gets the current drag handle position.
    * Value: A <see cref="Decimal" /> value that is the drag handle position.
    */
  var currentPosition: scala.Double
  /**
    * Gets the current secondary drag handle position.
    * Value: A <see cref="Decimal" /> value that is the drag handle position.
    */
  var currentPositionEnd: scala.Double
  /**
    * Gets the current main drag handle position.
    * Value: A <see cref="Decimal" /> value that is the drag handle position.
    */
  var currentPositionStart: scala.Double
  /**
    * Gets a position where the drag handle is being moved.
    * Value: A <see cref="Decimal" /> value that is the drag handle position.
    */
  var newPosition: scala.Double
  /**
    * Gets a position where the secondary drag handle is being moved.
    * Value: A <see cref="Decimal" /> value that is the drag handle position.
    */
  var newPositionEnd: scala.Double
  /**
    * Gets a position where the main drag handle is being moved.
    * Value: A <see cref="Decimal" /> value that is the drag handle position.
    */
  var newPositionStart: scala.Double
}

object ASPxClientTrackBarPositionChangingEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    currentPosition: scala.Double,
    currentPositionEnd: scala.Double,
    currentPositionStart: scala.Double,
    newPosition: scala.Double,
    newPositionEnd: scala.Double,
    newPositionStart: scala.Double,
    processOnServer: scala.Boolean
  ): ASPxClientTrackBarPositionChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, currentPosition = currentPosition, currentPositionEnd = currentPositionEnd, currentPositionStart = currentPositionStart, newPosition = newPosition, newPositionEnd = newPositionEnd, newPositionStart = newPositionStart, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientTrackBarPositionChangingEventArgs]
  }
}

